package com.sagar.model;

/**
 * @author Sagar
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class User_RoleId implements Serializable {
	@Column
	private String username;
	@Column
	private int role_id;
	public User_RoleId(String username, int role_id) {
		super();
		this.username = username;
		this.role_id = role_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
}
