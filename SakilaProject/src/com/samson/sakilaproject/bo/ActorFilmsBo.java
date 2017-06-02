package com.samson.sakilaproject.bo;

import java.util.List;

public class ActorFilmsBo {
	
	int actorId;
	String firstName;

	List<FilmBo> filmList;

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<FilmBo> getFilmList() {
		return filmList;
	}

	public void setFilmList(List<FilmBo> filmList) {
		this.filmList = filmList;
	}

	@Override
	public String toString() {
		return "ActorFilmsBo [actorId=" + actorId + ", firstName=" + firstName + ", filmList=" + filmList + "]";
	}

	
	
	
	
}
