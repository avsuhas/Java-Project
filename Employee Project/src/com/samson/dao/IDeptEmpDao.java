package com.samson.dao;

import java.util.List;

import com.samson.dbo.DeptEmpDbo;

public interface IDeptEmpDao {
	
public List<DeptEmpDbo> findAll();
	
	public DeptEmpDbo findById(int id);
	
	public int insert(DeptEmpDbo dbo);

}
