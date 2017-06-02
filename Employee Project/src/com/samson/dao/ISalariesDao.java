package com.samson.dao;

import java.util.List;

import com.samson.dbo.SalariesDbo;

public interface ISalariesDao {
	
	public List<SalariesDbo> findAll();
	
	public SalariesDbo findById(int id);
	
	public int insert(SalariesDbo dbo);

}
