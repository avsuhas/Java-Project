package com.samson;

public class LanguageBO {
	int language_id;
	String name;
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "LanguageBO [language_id=" + language_id + ", name=" + name + "]";
	}
	

}
