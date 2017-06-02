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
import com.samson.sakilaproject.dbo.CountryDbo;

public class CountryDao implements ICountryDao{

	@Override
	public List<CountryDbo> findAll() {
		
		List<CountryDbo> list = new ArrayList<CountryDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select country_id,country from sakila.country");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("Executing query.."+sbr);
			rs=pstmt.executeQuery();
			CountryDbo dbo = null;
			while(rs.next()){
				dbo.setCountry_id(rs.getInt("country_id"));
				dbo.setCountry(rs.getString("country"));
				list.add(dbo);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {

			try {
				try {
					DataSource.getInstance().closeConnection(pstmt, con, rs);
				} catch (SQLException | PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public CountryDbo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CountryDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
