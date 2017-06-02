

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection myConn = null;
		Statement myStat = null;
		ResultSet myRs = null;
		try{
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "suhas123");
			
			myStat = myConn.createStatement();
			String sql = "select last_name as lName, first_name as fName, email as email from employees";
			System.out.println("Executing Query "+ sql);
			myRs = myStat.executeQuery(sql);
			
			String lastName ="";
			String fName = "";
			String email="";
			
			while(myRs.next()){
				lastName = myRs.getString("lName");
				fName = myRs.getString("fName");
				email = myRs.getString("email");
				System.out.println("Last Name is " +lastName);
				System.out.println("First Name is " +fName);
				System.out.println("Email Name is " +email);
			}
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}finally{
				try {
					if(null != myRs)  myRs.close();
					if(null != myStat) myStat.close();
					if(null != myConn) myConn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
