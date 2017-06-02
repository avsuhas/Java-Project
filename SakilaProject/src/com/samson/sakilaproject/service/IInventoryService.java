package com.samson.sakilaproject.service;

import java.util.List;

import com.samson.sakilaproject.bo.InventoryBo;
import com.samson.sakilaproject.bo.InventoryStoreBo;

public interface IInventoryService {
	
	public List <InventoryStoreBo> findAll();

}
