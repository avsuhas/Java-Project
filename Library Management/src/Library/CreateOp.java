package Library;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class CreateOp {
	
	Connection conn;
	Statement stat;
	//String book_create="CREATE TABLE author (author_id VARCHAR(45), name VARCHAR(45) );";
	String book="CREATE TABLE book (book_id VARCHAR(45), book_name VARCHAR(45), author VARCHAR(45), volume INTEGER, edition INTEGER);";
	String author_book="CREATE TABLE author_book (author_id VARCHAR(45), name VARCHAR(45));";
	String books_lent="CREATE TABLE books_lent (book_id VARCHAR(45), cus_id VARCHAR(45), date VARCHAR(45), renewal VARCHAR(45));";
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public void setStat(Statement stat) {
		this.stat = stat;
	}
	
	public void createTable() throws SQLException{
		stat.execute(book);
		stat.execute(author_book);
		stat.execute(books_lent);
	}
	
	public void insertBook(String book_id, String book_name, String author_id, int volume, int edition) throws SQLException{
		String sql ="INSERT INTO book (book_id,book_name,author_id,volume,edition) VALUES (?,?,?,?,?)";
		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
		ps.setString(1, book_id);
		ps.setString(2, book_name);
		ps.setString(3, author_id);
		ps.setInt(4, volume);
		ps.setInt(5, edition);
		ps.executeUpdate();
	}
	
	public void insertAuthor(){
		
	}
	public void authorDetails(){
	
	}
	public void booksLent(){
	
	}
	public void customer(String cus_id, String name, String address, String phone) throws SQLException{
		String sql = "INSERT INTO customer (cus_id,Name,address,phone) VALUES (?,?,?,?)";
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
		ps.setString(1, cus_id);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setString(4, phone);
		ps.executeUpdate();
		
	}

}
