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

import com.samson.dbo.UserDbo;

public class UserDao implements IUserDao{

	@Override
	public List<UserDbo> findAll() {
		List<UserDbo> returnList = new ArrayList<UserDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select userName,password,userId from employees.user ");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			UserDbo dbo = null;
			while (rs.next()) {
				dbo = new UserDbo();
				dbo.setUserName(rs.getString("userName"));
				dbo.setPassword(rs.getString("password"));
				dbo.setUserId(rs.getInt("userId"));
		
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
	public UserDbo findById(int id) {
		UserDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			
			sbr.append("select userName,password,userId from employees.user where userId ="+id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dbo = new UserDbo();
				dbo.setUserName(rs.getString("userName"));
				dbo.setPassword(rs.getString("password"));
				dbo.setUserId(rs.getInt("userId"));

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
	public int insert(UserDbo userDbo) {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		int i = 0;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sql = new StringBuilder();
			
			sql.append("insert into employees.user (userName,password,userId)  values (?,?,?) ");
		//	int j = ("SELECT max(userId)+1 FROM employees.user");
			pstmt = con.prepareStatement(sql.toString());
			System.out.println(pstmt);
			pstmt.setString(1, userDbo.getUserName());
			pstmt.setString(2, userDbo.getPassword());
			pstmt.setInt(3, userDbo.getUserId());
			System.out.println("I am executing query here : " + sql);
			i = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				try {
					DataSource.getInstance().closeConnection(pstmt, con, null);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(i + " row inserted successfully");
		return i;
	
	}

	public static void main(String[] args) {
		UserDbo dbo = new UserDbo();
		dbo.setUserName("cody");
		dbo.setPassword("cody123");
		dbo.setUserId(9);
		
		
		
	
		
		UserDao dao = new UserDao();
		int i = dao.insert(dbo);
	}
}
