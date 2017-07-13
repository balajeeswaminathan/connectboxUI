package com.smp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
	@Id
	private String user_Id;
	private String userName;
	
	public String getUser_Id() {
		return user_Id;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
