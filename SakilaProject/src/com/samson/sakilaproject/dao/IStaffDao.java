package com.samson.sakilaproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.samson.sakilaproject.dbo.StaffDbo;

public interface IStaffDao {
	
	public List<StaffDbo> findAll() throws SQLException;
	
	public StaffDbo findById(int id) throws SQLException;
	
	public int insert(StaffDbo sbo) throws SQLException;
	
}
