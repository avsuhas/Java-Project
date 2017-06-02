package com.samson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.samson.CustomerBO;

public class CustomerService {
	
	public List<CustomerBO> getCustomer(){
		List<CustomerBO>  customerList = new ArrayList<CustomerBO>();
		CustomerBO cBo = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user_name = "root";
		String password = "suhas123";
		try{
			// 1. get connection to db
			Connection myConn = DriverManager.getConnection(url, user_name, password);
			// 2. create statement
			Statement myStat = myConn.createStatement();
			// 3. write sql query
			StringBuilder sbr = new StringBuilder( "select customer_id,first_name,last_name,email from sakila.customer" );
	        System.out.println("I am executing the query:" + sbr.toString());
			ResultSet myRs = myStat.executeQuery(sbr.toString());
			while (myRs.next()) {
				cBo = new CustomerBO();
				cBo.setId(myRs.getInt("customer_id"));
				cBo.setFirstName(myRs.getString("first_name"));
				cBo.setLastName(myRs.getString("last_name"));
				cBo.setEmail(myRs.getString("email"));
				customerList.add(cBo);
			}
		
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return customerList;		
	}


	public static void main(String[] args) {

		List<CustomerBO> list = new ArrayList<CustomerBO>();
		CustomerService service = new CustomerService();
		list = service.getCustomer();
		System.out.println("Printing Actors here " + service.getCustomer());	

	}

}
