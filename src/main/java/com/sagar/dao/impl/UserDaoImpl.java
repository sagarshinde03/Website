package com.sagar.dao.impl;

/**
 * @author Sagar
 */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sagar.dao.UserDao;
import com.sagar.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory session;

	@Override
	public void addUser(User user) {
		session.getCurrentSession().save(user);
	}

	@Override
	public void editUser(User user) {
		session.getCurrentSession().update(user);
	}

	@Override
	public void deleteUser(String username) {
		session.getCurrentSession().delete(findUser(username));
	}

	@Override
	public User findUser(String username) {
		return (User) session.getCurrentSession().get(User.class, username);
	}

	@Override
	public User findUserByName(String username) {
		Criteria criteria = session.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));
		return (User) criteria.uniqueResult();
	}
	
	@Override
	public List<User> getAllUsers() {
		return session.getCurrentSession().createQuery("from User").list();
	}

}
