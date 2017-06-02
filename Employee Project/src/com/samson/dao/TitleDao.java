package com.samson.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.DataSource;
import com.samson.dbo.TitleDbo;

public class TitleDao implements ITitleDao{

	@Override
	public List<TitleDbo> findAll() {
		List<TitleDbo> returnList = new ArrayList<TitleDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select emp_no,title,from_date,to_date from employees.titles limit 20");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			TitleDbo dbo = null;
			while (rs.next()) {
				dbo = new TitleDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setTitle(rs.getString("title"));
				dbo.setFromDate(rs.getString("from_date"));
				dbo.setToDate(rs.getString("to_date"));
				
				
				returnList.add(dbo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	//	System.out.println("results "+returnList);
		return returnList;
	}

	@Override
	public TitleDbo findById(int id) {
		TitleDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			
			sbr.append("select emp_no,title,from_date,to_date from employees.titles where emp_no ="+id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dbo = new TitleDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setTitle(rs.getString("title"));
				dbo.setFromDate(rs.getString("from_date"));
				dbo.setToDate(rs.getString("to_date"));

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(dbo);
		return dbo;
	}

	@Override
	public int insert(TitleDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		int id=10013;
		TitleDao dao = new TitleDao();
		dao.findById(id);
	}
}
