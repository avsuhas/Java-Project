package Library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOp {
	Connection conn;
	Statement stat;
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public void setStat(Statement stat) {
		this.stat = stat;
	}
	
	public void printCustomerDetails() throws SQLException{
		ResultSet myres = stat.executeQuery("select * from customer;" );
		while(myres.next()){
			System.out.println(myres.getString("cus_id")+""+myres.getString("name"));
		}
		
	}
	
	
}
