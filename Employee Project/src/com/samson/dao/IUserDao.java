package com.samson.dao;

import java.util.List;

import com.samson.dbo.UserDbo;

public interface IUserDao {
	
	public List<UserDbo> findAll();
	
	public UserDbo findById(int id);
	
	public int insert(UserDbo dbo);

}
