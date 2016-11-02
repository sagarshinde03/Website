package com.sagar.model;

/**
 * @author Sagar
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable{
	@Size(min=2, max=45, message="Size of first name should be between {min} and {max} characters")
	@Column(nullable=false)
	private String firstname;
	@Size(min=2, max=45, message="Size of last name should be between {min} and {max} characters")
	@Column(nullable=false)
	private String lastname;
	@Id
	@Size(max=45)
	@Column(nullable=false)
	private String username;
	@Size(max=45, message="Password should not exceed {max} characters")
	@Column(nullable=false)
	private String password;
	@OneToMany
	@JoinTable(name="UsersAndRoles",
			joinColumns=@JoinColumn(name="username"),
			inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Role> roles;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private UserStatus status;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public User() {}

	public User(String firstname, String lastname, String username, String password, List<Role> roles, UserStatus status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.status = status;
	}
}
