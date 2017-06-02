package com.samson.sakilaproject.dao;

import java.sql.SQLException;

import com.samson.sakilaproject.dbo.UserDbo;



public interface IUserDao {
	
	
//	public List<UserDbo> findAll() throws SQLException;
	
//	public UserDbo findById(int id) throws SQLException;
		public int insert(UserDbo bo) throws SQLException;

}
