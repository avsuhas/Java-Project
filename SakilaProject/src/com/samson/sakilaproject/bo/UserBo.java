package com.samson.sakilaproject.bo;

import java.io.Serializable;

public class UserBo implements Serializable{
	
	private String id;
	private String firstName;
	private String lastName;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "UserBo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
