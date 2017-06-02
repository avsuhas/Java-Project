package com.samson.bo;

public class UserBo {
	
	String userName;
	String password;
	int userId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UserBo [userName=" + userName + ", password=" + password + ", userId=" + userId + "]";
	}
	
	

}
