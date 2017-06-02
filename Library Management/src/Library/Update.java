package Library;

import java.sql.Connection;
import java.sql.Statement;

public class Update {
	
	Connection conn;
	Statement stat;
	
	

	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public void setStat(Statement stat) {
		this.stat = stat;
	}
	
	

}
