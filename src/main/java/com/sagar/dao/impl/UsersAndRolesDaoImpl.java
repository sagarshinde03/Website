package com.sagar.dao.impl;

/**
 * @author Sagar
 */

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sagar.dao.UsersAndRolesDao;
import com.sagar.model.UsersAndRoles;

@Repository
public class UsersAndRolesDaoImpl implements UsersAndRolesDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void addUsersAndRoles(UsersAndRoles usersAndRoles) {
		session.getCurrentSession().save(usersAndRoles);
	}
}