package com.samson.sakilaproject.dbo;

public class Film {
	
	int filmId;
	String title;
	String description;
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "FilmText [filmId=" + filmId + ", title=" + title + ", description=" + description + "]";
	}
	

}
