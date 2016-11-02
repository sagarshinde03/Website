package com.sagar.service.impl;

/**
 * @author Sagar
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sagar.dao.UsersAndRolesDao;
import com.sagar.model.UsersAndRoles;
import com.sagar.service.UsersAndRolesService;

@Service
public class UsersAndRolesServiceImpl implements UsersAndRolesService {

	@Autowired
	private UsersAndRolesDao usersAndRolesDao;

	@Transactional
	public void addUsersAndRoles(UsersAndRoles usersAndRoles) {
		usersAndRolesDao.addUsersAndRoles(usersAndRoles);
	}

}
