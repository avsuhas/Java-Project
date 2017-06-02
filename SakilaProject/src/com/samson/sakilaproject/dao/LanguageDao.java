package com.samson.sakilaproject.dao;

public class LanguageDao implements ILanguageDao {

	@Override
	public String findById(int id) {
		if(id == 1) return "English";
		else return "Still need to code";
	}

}
