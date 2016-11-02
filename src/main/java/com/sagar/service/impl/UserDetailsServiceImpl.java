package com.sagar.service.impl;

/**
 * @author Sagar
 */

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sagar.dao.UserDao;
import com.sagar.model.Role;
import com.sagar.model.User;
import com.sagar.model.UserStatus;
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userDao.findUserByName(username);
		if(user!=null){
			String password=user.getPassword();
			boolean enabled=user.getStatus().equals(UserStatus.ACTIVE);
			boolean accountNonExpired=user.getStatus().equals(UserStatus.ACTIVE);
			boolean credentialsNonExpired=user.getStatus().equals(UserStatus.ACTIVE);
			boolean accountNonLocked=user.getStatus().equals(UserStatus.ACTIVE);
			
			Collection<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
			for(Role role:user.getRoles()){
				authorities.add(new GrantedAuthorityImpl(role.getRoleName()));
			}
			org.springframework.security.core.userdetails.User securityUser=new org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securityUser;
		} else {
			throw new UsernameNotFoundException("User Not Found!!!");
		}
	}

}
