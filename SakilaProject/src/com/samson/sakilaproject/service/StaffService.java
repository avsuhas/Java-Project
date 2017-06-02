package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.StaffBo;
import com.samson.sakilaproject.dao.IStaffDao;
import com.samson.sakilaproject.dao.StaffDao;
import com.samson.sakilaproject.dbo.StaffDbo;

public class StaffService implements IStaffService {

	public List<StaffBo> findAllStaff() {
		List<StaffBo> list = new ArrayList<StaffBo>();
		StaffBo staffBo = null;
		IStaffDao staffDao = new StaffDao();

		try {
			List<StaffDbo> staffList = staffDao.findAll();
			
			for(StaffDbo dbo: staffList){
				staffBo = new StaffBo();
				staffBo.setFirstName(dbo.getFirstName());
				staffBo.setEmail(dbo.getEmail());
				list.add(staffBo);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
