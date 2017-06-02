package com.samson.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.bo.DeptEmpBo;
import com.samson.dao.DepartmentsDao;
import com.samson.dao.DeptEmpDao;
import com.samson.dbo.DepartmentsDbo;
import com.samson.dbo.DeptEmpDbo;

public class DeptEmpService implements IDeptEmpService{

	@Override
	public List<DeptEmpBo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DeptEmpBo> findById(int id){
	//	List<DeptEmpBo> returnList = new ArrayList<DeptEmpBo>();
		DeptEmpDao dao = new DeptEmpDao();
		DeptEmpDbo dbo = dao.findById(id);
		String DeptName = getDeptName(dbo.getDeptNo());
		System.out.println(DeptName);
		return null;
		
	}
	public String getDeptName(String id){		
		DepartmentsDao dao = new DepartmentsDao();
		DepartmentsDbo dbo = dao.findById(id);		
		return dbo.getDeptName();
	}
	public static void main(String[] args) {
		DeptEmpService service = new DeptEmpService();
		service.findById(10007);
	}
}
