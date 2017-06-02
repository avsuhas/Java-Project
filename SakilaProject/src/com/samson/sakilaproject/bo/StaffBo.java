package com.samson.sakilaproject.bo;

public class StaffBo {
	
	String firstName;
	String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StaffBo [firstName=" + firstName + ", email=" + email + "]";
	}
	
}
