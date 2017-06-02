package com.samson.sakilaproject.dbo;

public class LanguageDbo {
	
	private int languageId;
	private int name;
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "LanguageDbo [languageId=" + languageId + ", name=" + name + "]";
	}
	
	

}
