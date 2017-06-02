package com.samson.service;

import java.util.List;

import com.samson.bo.UserBo;

public interface IUserService {

	public List<UserBo> findAll();
}
