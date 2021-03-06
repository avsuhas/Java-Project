package com.samson.sakilaproject.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.samson.sakilaproject.bo.ActorFilmsBo;
import com.samson.sakilaproject.bo.FilmBo;
import com.samson.sakilaproject.dao.ActorDao;
import com.samson.sakilaproject.dao.FilmActorDao;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dbo.ActorDbo;
import com.samson.sakilaproject.dbo.FilmActorDbo;
import com.samson.sakilaproject.dbo.FilmDbo;

public class ActorFilmService {
	
	public List<ActorFilmsBo> findAll() {
		List<ActorFilmsBo> returnList = new ArrayList<ActorFilmsBo>();
		Map<Integer,List<Integer>> actorFilmMap = actorFilmMap();
		int actorId = 0;
		String actorName = "";
		
		ActorFilmsBo actorFilmBo = null; 
		List<Integer> filmList;
		Iterator<Integer> iter = actorFilmMap.keySet().iterator();
		while(iter.hasNext()){
			actorFilmBo = new ActorFilmsBo();
			actorId = iter.next();
			actorName = getActorName(actorId);
			filmList = actorFilmMap.get(actorId);
			actorFilmBo.setFirstName(actorName);
			
			actorFilmBo.setFilmList(findFilmInfo(filmList));
			returnList.add(actorFilmBo);
		}
		System.out.println("printing in findAll ----"+returnList);
		
		return returnList;
	}
 
	public Map<Integer,List<Integer>>  actorFilmMap(){
		Map<Integer,List<Integer>> actorFilmMap = new HashMap<Integer,List<Integer>>();
		FilmActorDao filmActorDao = new FilmActorDao();
		List<FilmActorDbo> filmActorDbo =filmActorDao.findAll();
		List<Integer> filmList;
		for(FilmActorDbo dbo :filmActorDbo){
			if(actorFilmMap.containsKey(dbo.getActor_id())){
				filmList = actorFilmMap.get(dbo.getActor_id());
			}
			else{
				filmList = new ArrayList<Integer>();
			}
		filmList.add(dbo.getFilm_id());
		actorFilmMap.put(dbo.getActor_id(), filmList);
		}
		System.out.println(actorFilmMap);
		return actorFilmMap;		
	}
	
	public static void main(String[] args) {
		
		ActorFilmService actorFilmService = new ActorFilmService();
		actorFilmService.actorFilmMap();
		actorFilmService.findAll();
		
	}

	public	List<FilmBo> findFilmInfo(List<Integer> filmList){
			List<FilmBo> returnList = new ArrayList<FilmBo>();
			FilmBo bo = null;
			FilmDao filmDao = new FilmDao();
			FilmDbo dbo = null;
			for(Integer filmId : filmList){
				dbo = filmDao.findById(filmId);
				bo = new FilmBo();
				bo.setFilmId(dbo.getFilmId());
				bo.setTitle(dbo.getTitle());
				bo.setDescription(dbo.getDescription());
				returnList.add(bo);
				
			}
	//		System.out.println("printing in findFilmInfo Method ---"+returnList);
			return returnList;
			
		}
	
		private String getActorName(int id) {
			ActorDao adao = new ActorDao();
			ActorDbo dbo = null;
			try {
				dbo = adao.findById(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return dbo.getFirstName()+ " " + dbo.getLastName();
		}
		
}
