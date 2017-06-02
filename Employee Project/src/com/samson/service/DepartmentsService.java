package com.samson.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.bo.DepartmentsBo;
import com.samson.dao.DepartmentsDao;
import com.samson.dbo.DepartmentsDbo;

public class DepartmentsService implements IDepartmentsService{

	@Override
	public List<DepartmentsBo> findAll() {
		List<DepartmentsBo> returnList = new ArrayList<DepartmentsBo>();
		DepartmentsDao dao = new DepartmentsDao();
		List<DepartmentsDbo> list= dao.findAll();
		DepartmentsBo bo = null;
		for(DepartmentsDbo  dbo:list){
			bo = new DepartmentsBo();
			bo.setDeptNo(dbo.getDeptNumber());
			bo.setDeptName(dbo.getDeptName());
			returnList.add(bo);
			
		}
		return returnList;
	}

	
}
