package com.samson.sakilaproject.dbo;

public class CountryDbo {
	int country_id;
	String country;
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CountryDbo [country_id=" + country_id + ", country=" + country + "]";
	}
	

}
