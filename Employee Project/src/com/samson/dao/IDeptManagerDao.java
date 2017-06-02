package com.samson.dao;

import java.util.List;

import com.samson.dbo.DeptManagerDbo;

public interface IDeptManagerDao {
	
public List<DeptManagerDbo> findAll();
	
	public DeptManagerDbo findById(int id);
	
	public int insert(DeptManagerDbo dbo);

}
