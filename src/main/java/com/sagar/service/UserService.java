package com.sagar.service;

/**
 * @author Sagar
 */

import java.util.List;

import com.sagar.model.User;

public interface UserService {
	void addUser(User user);
	void editUser(User user);
	void deleteUser(String username);
	User findUser(String username);
	User findUserByName(String username);
	List<User> getAllUsers();
}
