package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnection {
	Connection conn;
	Statement stat;
	String username ="root";
	String pwd ="suhas123";
	String url ="jdbc:mysql://localhost:3306/libmgt";
	CreateConnection() throws SQLException{
		conn = DriverManager.getConnection(url,username,pwd);
		stat = conn.createStatement();
		System.out.println(conn+""+stat);
	}
	
	public Statement getStat() {
		return stat;
	}
	public Connection getConn() {
		return conn;
	}
	
	

}
