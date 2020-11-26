package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mvc.model.Login;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
public class LoginDao extends ActionSupport {
	
	private String user, pw, name;
	public String authenticateUser(String userName, String password) {	
		String ret = "error";
		Connection conn = null;
		String userNameDB = "";
		String passwordDB = "";
		
		try {
			String url = "jdbc:mysql://localhost:3306/customers"; //MySQL url and the database name - customers
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "root123");
			
			String sql_query = "SELECT userName, password FROM users";
			Statement stmt = conn.createStatement();
						
			ResultSet rs = stmt.executeQuery(sql_query); // Execute the sql_query
			
			while(rs.next()) {
				// For each entry in database, get userName and password and compare with the inputted username and password
				userNameDB = rs.getString("userName"); 
				passwordDB = rs.getString("password");
				if(userName.equals(userNameDB) && password.equals(passwordDB)) {
					return "SUCCESS";
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "Invalid user credentials";

	}

}
