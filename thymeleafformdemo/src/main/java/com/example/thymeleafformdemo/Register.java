package com.example.thymeleafformdemo;

import java.io.Serializable;

public class Register  implements Serializable{

	private String userName;
	private String password;
	public Register(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Register() {}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
