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
import com.samson.sakilaproject.dbo.FilmDbo;

public class FilmDao implements IFilmDao{

	@Override
	public List<FilmDbo> findAll() {
	
		List<FilmDbo> list = new ArrayList<FilmDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			con = DataSource.getInstance().getConnection();
			StringBuffer sbr = new StringBuffer();
			sbr.append("select film_id,title,description,language_id  from sakila.film");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("Executing query.. "+ sbr);
			rs = pstmt.executeQuery();
			FilmDbo dbo = null;
			while(rs.next()){
				dbo = new FilmDbo();
				dbo.setFilmId(rs.getInt("film_id"));
				dbo.setTitle(rs.getString("title"));
				dbo.setDescription(rs.getString("description"));
				dbo.setLanguageId(rs.getInt("language_id"));
				list.add(dbo);
			}		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (SQLException | IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}


	public FilmDbo findById(int id) {
		
		FilmDbo fDbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select film_id,title,description,language_id from sakila.film where film_id = " + id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				fDbo = new FilmDbo();
				fDbo.setFilmId(rs.getInt("film_id"));
				fDbo.setTitle(rs.getString("title"));
				fDbo.setDescription(rs.getString("description"));
				fDbo.setLanguageId(rs.getInt("language_id"));		
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

	
		return fDbo;
	}

	@Override
	public int insert(FilmDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
