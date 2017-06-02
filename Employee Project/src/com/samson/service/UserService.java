package com.samson.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.bo.UserBo;
import com.samson.dao.IUserDao;
import com.samson.dao.UserDao;
import com.samson.dbo.UserDbo;


public class UserService implements IUserService{

	@Override
	public List<UserBo> findAll() {
		List<UserBo> returnList = new ArrayList<UserBo>();
		UserDao dao = new UserDao();
		List<UserDbo> list = dao.findAll();
		UserBo bo = null;
		for(UserDbo dbo :list){
			bo = new UserBo();
			bo.setUserName(dbo.getUserName());
			bo.setPassword(dbo.getPassword());
			bo.setUserId(dbo.getUserId());
			returnList.add(bo);
		}
		return returnList;
	}

	public int insertUser(UserBo bo){
		int i = 0;
		IUserDao dao = new UserDao();
		UserDbo dbo = new UserDbo();
		dbo.setUserName(bo.getUserName());
		dbo.setPassword(bo.getPassword());
		dbo.setUserId(bo.getUserId());	
		try {
			i = dao.insert(dbo); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
		
}
