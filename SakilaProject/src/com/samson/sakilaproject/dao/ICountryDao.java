package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.CountryDbo;

public interface ICountryDao {
	
	public List<CountryDbo> findAll();
	
	public CountryDbo findById(int id);
	
	public int insert(CountryDbo dbo);

}
