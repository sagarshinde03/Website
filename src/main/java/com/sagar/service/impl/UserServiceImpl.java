package com.sagar.service.impl;

/**
 * @author Sagar
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sagar.dao.UserDao;
import com.sagar.model.User;
import com.sagar.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void addUser(User user) {
		try {
			String passwordToHash = user.getPassword();
			MessageDigest md;
			md = MessageDigest.getInstance("MD5");
	        md.update(passwordToHash.getBytes());
	        byte[] bytes = md.digest();
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i< bytes.length ;i++)
	        {
	            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        user.setPassword(sb.toString());
			userDao.addUser(user);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	@Transactional
	public void editUser(User user) {
		userDao.editUser(user);
	}

	@Transactional
	public void deleteUser(String username) {
		userDao.deleteUser(username);
	}

	@Transactional
	public User findUser(String username) {
		return userDao.findUser(username);
	}

	@Transactional
	public User findUserByName(String username) {
		return userDao.findUserByName(username);
	}

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
