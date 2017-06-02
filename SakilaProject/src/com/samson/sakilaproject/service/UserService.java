package com.samson.sakilaproject.service;

import java.sql.SQLException;

import com.samson.sakilaproject.bo.UserBo;
import com.samson.sakilaproject.dao.IUserDao;
import com.samson.sakilaproject.dao.UserDao;
import com.samson.sakilaproject.dbo.UserDbo;

public class UserService implements IUserService{
	
	public int insertUser(UserBo bo){
		int i =0;
		IUserDao dao = new UserDao();
		UserDbo dbo = new UserDbo();
		dbo.setUserid(new Integer(bo.getId()));
		dbo.setFirstName(bo.getFirstName());
		dbo.setLastName(bo.getLastName());
		try {
			i = dao.insert(dbo); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	
	
//	public void nonOB(String userName, String lastName, String firsntName, int age, int id, 
//			  String add1, String add2, int zip) {
//	}
	}
	


