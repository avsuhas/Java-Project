package com.samson;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class LanguageService  {

		public List<LanguageBO> getLanguage(){
		List<LanguageBO> listLanguage = new ArrayList<LanguageBO>();
		LanguageBO lBo = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String url = "jdbc:mysql://localhost:3306/sakila";
		String username = "root";
		String password = "suhas123";
		try{
		Connection myConn = (Connection) DriverManager.getConnection(url,username,password);
		
		PreparedStatement myStat = myConn.prepareStatement("select language_id,name from sakila.language");
		
		ResultSet myRs = myStat.executeQuery();
		
		while(myRs.next()){
			lBo = new LanguageBO();
			lBo.setLanguage_id(myRs.getInt("language_id"));
			lBo.setName(myRs.getString("name"));
			listLanguage.add(lBo);
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return listLanguage;
		
	}
	
	public static void main(String[] args) {
		List<LanguageBO> list = new ArrayList<LanguageBO>();
		LanguageService serv = new LanguageService();
		list = serv.getLanguage();
		System.out.println("Printing Language"+serv.getLanguage());

	}

}
