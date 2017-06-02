package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.CustomerDbo;

public interface ICustomerDao {
	
	public List<CustomerDbo> findAll();
	
	public CustomerDbo findById(int id);
	
	public int insert(CustomerDbo dbo);

}
