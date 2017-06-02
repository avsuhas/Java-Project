package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.StoreBo;
import com.samson.sakilaproject.dao.StoreDao;
import com.samson.sakilaproject.dbo.StoreDbo;

public class StoreService implements IStoreService{

	@Override
	public List<StoreBo> findAll() {
		
		List<StoreBo> returnList = new ArrayList<StoreBo>();
		
		StoreBo bo = null;
		StoreDao dao = new StoreDao();
		List<StoreDbo> storeList =dao.findAll();
		
		for(StoreDbo dbo : storeList){
			bo = new StoreBo();
			bo.setStoreId(dbo.getStoreId());
			bo.setManagerId(dbo.getManagerId());
			bo.setAddressId(dbo.getAddressId());
			returnList.add(bo);
			
		}
		
		return returnList;
	}

}
