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
import com.samson.sakilaproject.dbo.CustomerDbo;

public class CustomerDao implements ICustomerDao{

	@Override
	public List<CustomerDbo> findAll() {
	
		List<CustomerDbo> list = new ArrayList<CustomerDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			con = DataSource.getInstance().getConnection();
			StringBuffer sbr = new StringBuffer();
			sbr.append("Select customer_id,store_id,first_name,last_name,email from sakila.customer");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("Executing query.."+ sbr);
			rs = pstmt.executeQuery();
			CustomerDbo dbo = null;
			while(rs.next()){
				dbo = new CustomerDbo();
				dbo.setCustomerId(rs.getInt("customer_id"));
				dbo.setStoreId(rs.getInt("store-id"));
				dbo.setFirstName(rs.getString("first_name"));
				dbo.setLastName(rs.getString("last_name"));
				dbo.setEmail(rs.getString("email"));
				list.add(dbo);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				DataSource.getInstance().closeConnection(pstmt, con,rs);
			} catch (SQLException | IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		return list;
	}

	@Override
	public CustomerDbo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CustomerDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
