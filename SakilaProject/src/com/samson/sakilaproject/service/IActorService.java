package com.samson.sakilaproject.service;

import java.sql.SQLException;
import java.util.List;

import com.samson.sakilaproject.bo.ActorBo;

public interface IActorService {	
	
	public List<ActorBo> findAllActors();
	
	
	public List<ActorBo> findActorsBySearchString(String firstName, String lastName, String flag) throws SQLException;

	//public ActorBo findByChar(char c);
	
}
