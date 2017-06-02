
import java.sql.*;

import com.mysql.jdbc.Connection;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			//1. get a connection to database
			Connection myConn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "suhas123");
			//2.Create a statement
			Statement myStat = myConn.createStatement();
			//3.Execute SQL query
			ResultSet myRs = myStat.executeQuery("select * from employees");
			//4. Process the result.
			while(myRs.next()){
				System.out.println(myRs.getString("last_name")+ " " + myRs.getString("first_name"));
		
			}
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}


}
