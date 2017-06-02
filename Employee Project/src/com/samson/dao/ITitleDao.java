package com.samson.dao;

import java.util.List;

import com.samson.dbo.TitleDbo;

public interface ITitleDao {
	
public List<TitleDbo> findAll();
	
	public TitleDbo findById(int id);
	
	public int insert(TitleDbo dbo);

}
