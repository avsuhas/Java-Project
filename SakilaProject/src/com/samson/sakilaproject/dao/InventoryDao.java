package com.samson.sakilaproject.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.DataSource;
import com.samson.sakilaproject.dbo.InventoryDbo;

public class InventoryDao implements IInventoryDao{

	@Override
	public List<InventoryDbo> findAll() {
		
		List<InventoryDbo> list = new ArrayList<InventoryDbo>();
		InventoryDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		try{
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select inventory_id,film_id,store_id from inventory;");
			pstmt = con.prepareStatement(sbr.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				dbo = new InventoryDbo();
				dbo.setFilmId(rs.getInt("inventory_id"));
				dbo.setInverntoryId(rs.getInt("film_id"));
				dbo.setStoreId(rs.getInt("film_id"));
				list.add(dbo);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return list;
	}
	
	

@Override
public InventoryDbo findById(int id) {
	
	InventoryDbo iDbo = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		con = DataSource.getInstance().getConnection();
		StringBuilder sbr = new StringBuilder();
		sbr.append("select inventory_id,film_id,store_id from sakila.inventory where inventory_id = " + id);
		pstmt = con.prepareStatement(sbr.toString());
		System.out.println("I am executing query here : " + sbr.toString());
		rs = pstmt.executeQuery();
		if (rs.next()) {
			iDbo = new InventoryDbo();
			iDbo.setFilmId(rs.getInt("film_id"));
			iDbo.setInverntoryId(rs.getInt("inventory_id"));
			iDbo.setStoreId(rs.getInt("store_id"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException | PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return iDbo;
}
@Override

public int insert(InventoryDbo actorDbo) {
	// TODO Auto-generated method stub
	return 0;
}



public static void main(String[] args) {
	
	InventoryDao dao = new InventoryDao();
	List<InventoryDbo> list = new ArrayList<InventoryDbo>();
	list = dao.findAll();
	System.out.println(list);

}
}
