package com.samson.sakilaproject.dbo;

public class StaffDbo {
	
	int staff_id;
	String firstName;
	String lastName;
	String email;
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StaffDbo [staff_id=" + staff_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
	

}
