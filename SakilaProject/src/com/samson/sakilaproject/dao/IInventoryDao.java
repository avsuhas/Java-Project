package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.InventoryDbo;


public interface IInventoryDao {
	
	public List<InventoryDbo> findAll();
	
	public InventoryDbo findById(int id);
	
	public int insert(InventoryDbo actorDbo) ;


}
