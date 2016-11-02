package com.sagar.model;

/**
 * @author Sagar
 */

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class UsersAndRoles {
	@EmbeddedId
	private User_RoleId user_roleId;
	public User_RoleId getUser_roleId() {
		return user_roleId;
	}
	public void setUser_roleId(User_RoleId user_roleId) {
		this.user_roleId = user_roleId;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	@Transient
	private User user;
	public UsersAndRoles(String username, int role_id, User user) {
		super();
		this.user_roleId = new User_RoleId(username, role_id);
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
