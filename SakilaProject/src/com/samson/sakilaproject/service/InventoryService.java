package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.InventoryBo;
import com.samson.sakilaproject.bo.InventoryStoreBo;
import com.samson.sakilaproject.dao.AddressDao;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dao.IAddressDao;
import com.samson.sakilaproject.dao.IFilmDao;
import com.samson.sakilaproject.dao.IInventoryDao;
import com.samson.sakilaproject.dao.InventoryDao;
import com.samson.sakilaproject.dbo.AddressDbo;
import com.samson.sakilaproject.dbo.FilmDbo;
import com.samson.sakilaproject.dbo.InventoryDbo;

public class InventoryService implements IInventoryService {

	@Override
	public List<InventoryStoreBo> findAll() {

		List<InventoryStoreBo> list = new ArrayList<InventoryStoreBo>();
		InventoryStoreBo iBo = null;
		IInventoryDao iDao = new InventoryDao();

		String filmTitle = "";

		try {
			List<InventoryDbo> listDbo = iDao.findAll();

			String address = "";
			// List<FilmDbo> listDbo = fDao.findAll();
			for (InventoryDbo dbo : listDbo) {
				iBo = new InventoryStoreBo();
				iBo.setFilm_id(dbo.getFilmId());
				iBo.setInventory_id(dbo.getInverntoryId());
				iBo.setStore_id(dbo.getStoreId());
				filmTitle = getFilm(dbo.getFilmId());
             
				iBo.setFilmTitle(filmTitle);
				iBo.setAddress(getAddress(1));
				list.add(iBo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public String getFilm(int id) {
		IFilmDao FilmDao = new FilmDao();
		FilmDbo dbo = FilmDao.findById(id);
		return dbo.getTitle();
	}

	public String getAddress(int stoerId) {
		String add = "";
       int addId = 1;
		IAddressDao dao = new AddressDao();
        AddressDbo addressDbo = dao.findById(addId);
        System.out.println(addressDbo);
        add = returnBlankifNull(addressDbo.getAddress()) + 
        		returnBlankifNull(addressDbo.getDistrict()) + 
        		addressDbo.getCity_id() +
        		addressDbo.getPostal_code() ;
        		
		return add;
	}
	
	
	
	public String returnBlankifNull(String str) {
		if(null != str) return "";
		return str;
			
		}
	}
	
	
	

