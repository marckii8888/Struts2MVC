package com.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.mvc.model.Login;
import com.mvc.dao.LoginDao;

public class LoginAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 102831973239L;
	
	// Instantiate a new model class
	private Login loginBean = new Login(); 
	SessionMap<String,String> sessionmap;  
	    
	public String execute() throws Exception {
		LoginDao logindao = new LoginDao(); // Instantiate a new DAO class
		String userValidate = logindao.authenticateUser(loginBean.getUserName(), loginBean.getPassword()); // Validate the inputted username and password
		if(userValidate.equals("SUCCESS")) {
			return "success"; //Returns if inputted username and password matches the database
		} else {
			return "error"; // Returns if does not match
		}
	}
	
	public Login getLoginBean() {
		return loginBean; // Getter method to return a model class
	}
	
	public void setPersonBean(Login login) {
		loginBean = login; // Setter method to set a new model class
	}
	@SuppressWarnings("unchecked")
	@Override
	public void setSession(Map map) {
		// Set the session map
		sessionmap = (SessionMap)map;
		sessionmap.put("login", "true");
	}
}
