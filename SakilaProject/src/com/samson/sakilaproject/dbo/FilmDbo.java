package com.samson.sakilaproject.dbo;

public class FilmDbo {
	
	int filmId;
	String title;
	String description;
	int languageId;
	
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
	
	
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	@Override
	public String toString() {
		return "FilmDbo [filmId=" + filmId + ", title=" + title + ", description=" + description + ", languageId="
				+ languageId + "]";
	}
	
	
	

}
