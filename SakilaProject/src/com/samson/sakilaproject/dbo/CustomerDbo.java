package com.samson.sakilaproject.dbo;

public class CustomerDbo {
	
	int customerId;
	int storeId;
	String firstName;
	String lastName;
	String email;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
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
		return "CustomerDbo [customerId=" + customerId + ", storeId=" + storeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + "]";
	}
	

}
