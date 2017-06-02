package com.samson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

	public boolean isAuthUser(String userName, String password) {
		boolean isValidUser = false;
		ResultSet myRs = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			// make jdbc connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "suhas123");
			// write sql query
			Statement myStat = myConn.createStatement();
			StringBuilder queryString = new StringBuilder();
			queryString.append(
					" SELECT id  FROM sakila.login where login_name = '" + userName + "' and pwd ='" + password + "'  ");
			System.out.println("Executing query here" + queryString.toString());
			myRs = myStat.executeQuery(queryString.toString());
			// pass the parameters
			// get the rs and check
			if (null != myRs && myRs.next())
				isValidUser = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}

		return isValidUser;
	}

	public static void main(String[] args) {
       Login login = new Login();
       System.out.println("I am checking for " + login.isAuthUser("john", "john123"));
	}
}
