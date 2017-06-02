package com.samson.sakilaproject.dbo;

public class UserDbo {
		
	int userid;
	String firstName;
	String lastName;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
		return "UserDbo [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
