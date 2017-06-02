package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo {
	public static void main(String[] args){
		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libmgt", "root" , "suhas123");
			
			Statement mystat = myConn.createStatement();
			
			ResultSet myres = mystat.executeQuery("select * from customer;");
		
			while(myres.next()){
				System.out.println(myres.getString("cus_id") +" "+myres.getString("name")+" "+myres.getString("address")+" "+myres.getString("phone"));
				
			}
		}
	
	catch(Exception e){
		
		e.printStackTrace();
		
	}
	
	}

}
