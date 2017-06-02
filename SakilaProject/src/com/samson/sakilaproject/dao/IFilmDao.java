package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.FilmDbo;

public interface IFilmDao {
	
	public List<FilmDbo> findAll();
	
	public FilmDbo findById(int id);
	
	public int insert(FilmDbo dbo);

}
