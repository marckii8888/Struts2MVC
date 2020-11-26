package com.mvc.model;

public class Login {
	// Defining data attributes of the model class
	private String userName;
	private String password;
	
	public String getUserName() {
		// Getter method to get username
		return userName;
	}
	public void setUserName(String userName) {
		// Setter method to set username.
		this.userName = userName;
	}
	public void setPassword(String password) {
		// Setter method to set password
		this.password = password;
	}
	public String getPassword() {
		// Getter method to get password
		return password;
	}

}
