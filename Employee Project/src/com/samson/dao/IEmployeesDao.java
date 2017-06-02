package com.samson.dao;

import java.util.List;

import com.samson.dbo.EmployeesDbo;

public interface IEmployeesDao {
	
	public List<EmployeesDbo> findAll();
	
	public EmployeesDbo findById(int id);
	
	public int insert(EmployeesDbo dbo);

}
