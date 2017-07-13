package com.smp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
	private String user_Id;
	private String username;
	private String email;
	private String password;
	private String gender;

	public String getUser_Id() {
		return user_Id;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
