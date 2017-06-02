package Library;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibMgt {
	String cus_id, name, address , phone;
	Scanner in = new Scanner(System.in);
	static CreateOp cp = new CreateOp();
	static ReadOp rp = new ReadOp() ;
	static Update up = new Update();
	static Delete dt = new Delete();
	
	static LibMgt lm = new LibMgt();
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		CreateConnection cc = new CreateConnection();
		Connection conn=cc.getConn();
		Statement stat=cc.getStat();
		
		
		rp.setConn(conn);	
		rp.setStat(stat);
		rp.printCustomerDetails();
		
		cp.setConn(conn);
		cp.setStat(stat);
		
		lm.getCustomerDetails();
		lm.getBookDetails();
		
		
		//cp.createTable();
		//up.setConn(conn);
		//up.setStat(stat);
		
		//dt.setConn(conn);
		//dt.setStat(stat);	
		
		

	}
	
		public void getCustomerDetails() throws SQLException{
			System.out.println("Enter the customer id,name,address,phone");
			cus_id = in.next();
			name = in.next();
			address = in.next();
			phone = in.next();
			cp.customer(cus_id, name, address , phone);
		}
	
		public void getBookDetails() throws SQLException{
			System.out.println("Enter book_id,book_name,author_id,volume,edition");
			String book_id = in.next();
			String book_name = in.next();
			String author_id = in.next();
			int volume = in.nextInt();
			int edition = in.nextInt();
			cp.insertBook(book_id,book_name,author_id,volume,edition);
		}
	
		public void updateTable(){
			System.out.println("Enter the updated values");
			String author_id = in.next();
			String name = in.next();
			
		}
}
