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
import com.samson.sakilaproject.dbo.StaffDbo;

public class StaffDao implements IStaffDao{
	
	public List<StaffDbo> findAll() throws SQLException{
	List<StaffDbo> staffList = new ArrayList<StaffDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			con = DataSource.getInstance().getConnection();
			StringBuilder  sbr = new StringBuilder();
			sbr.append("select staff_id,first_name,last_name,email from sakila.staff");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("Executing query...");
			rs = pstmt.executeQuery();
			StaffDbo staffDbo = null;
			while(rs.next()){
				staffDbo = new StaffDbo();
				staffDbo.setStaff_id(rs.getInt("staff_id"));
				staffDbo.setFirstName(rs.getString("first_name"));
				staffDbo.setLastName(rs.getString("last_name"));
				staffDbo.setEmail(rs.getString("email"));
				staffList.add(staffDbo);
			}
		}
		catch (SQLException e) {
            e.printStackTrace();
		}
			catch(Exception e){
				e.printStackTrace();
			}
		finally {
	        
        	try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
		
		return staffList;
		
		
	}


	@Override
	public StaffDbo findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(StaffDbo sbo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
