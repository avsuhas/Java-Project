package com.samson.dao;

import java.util.List;

import com.samson.dbo.DepartmentsDbo;

public interface IDepartmentsDao {
	
	public List<DepartmentsDbo> findAll();
	
	public DepartmentsDbo findById(String id);
	
	public int insert(DepartmentsDbo dbo);
	

}
