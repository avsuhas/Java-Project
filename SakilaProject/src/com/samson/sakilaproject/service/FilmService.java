package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.FilmBo;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dao.ILanguageDao;
import com.samson.sakilaproject.dao.LanguageDao;
import com.samson.sakilaproject.dbo.FilmDbo;

public class FilmService implements IFilmService{

	@Override
	public List<FilmBo> findALL() {
		List<FilmBo> list = new ArrayList<FilmBo>();
		 
		FilmDao fDao = new FilmDao();
			
		List<FilmDbo> l = fDao.findAll();
		String lang = "";
		FilmBo fBo = null;
		for(FilmDbo dbo : l){
			fBo = new FilmBo();
			fBo.setFilmId(dbo.getFilmId());
			fBo.setTitle(dbo.getTitle());
			fBo.setDescription(dbo.getDescription());
			lang = getLang(dbo.getLanguageId());
			fBo.setLanguage(lang);
			list.add(fBo);
		}
	
		return list;
	}
	
	
	public String getLang(int lanId){
		ILanguageDao languageDao = new LanguageDao();
		String lang = languageDao.findById(lanId);
		return lang;
		
		
		
		
		
		
	}
	

}
