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
import com.samson.dbo.EmployeesDbo;

public class EmployeesDao implements IEmployeesDao{

	@Override
	public List<EmployeesDbo> findAll() {

		List<EmployeesDbo> returnList = new ArrayList<EmployeesDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select emp_no,birth_date,first_name,last_name,gender,hire_date from employees.employees where emp_no >= 10937 and emp_no <= 10963 ");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			EmployeesDbo dbo = null;
			while (rs.next()) {
				dbo = new EmployeesDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setBirthDate(rs.getString("birth_date"));
				dbo.setFirstName(rs.getString("first_name"));
				dbo.setLastName(rs.getString("last_name"));
				dbo.setGender(rs.getString("gender"));
				dbo.setHireDate(rs.getString("hire_date"));
				
				
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
		System.out.println("results "+returnList);
		return returnList;
	}

	@Override
	public EmployeesDbo findById(int id) {
		EmployeesDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			
			sbr.append("select emp_no,birth_date,first_name,last_name,gender,hire_date from employees.employees where emp_no ='"+id+"'");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dbo = new EmployeesDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setBirthDate(rs.getString("birth_date"));
				dbo.setFirstName(rs.getString("first_name"));
				dbo.setLastName(rs.getString("last_name"));
				dbo.setGender(rs.getString("gender"));
				dbo.setHireDate(rs.getString("hire_date"));

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
	public int insert(EmployeesDbo dbo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int i = 0;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sql = new StringBuilder();
			
			sql.append("insert into employees.employees (emp_no, birth_date,first_name,last_name,gender,hire_date)  values (?,?,?,?,?,?) ");

			pstmt = con.prepareStatement(sql.toString());
			System.out.println(pstmt);
			pstmt.setInt(1, dbo.getEmpNo());
			pstmt.setString(2, dbo.getBirthDate());
			pstmt.setString(3, dbo.getFirstName());
			pstmt.setString(4, dbo.getLastName());
			pstmt.setString(5, dbo.getGender());
			pstmt.setString(6, dbo.getHireDate());
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
		int id=10938;
		EmployeesDao dao = new EmployeesDao();
	//	dao.findById(id);
		dao.getNextEmpNo();
	}
	
	public  List<EmployeesDbo> getRecords(int start,int total){  
        List<EmployeesDbo> returnList=new ArrayList<EmployeesDbo>();  
       
        	EmployeesDbo dbo = null;
    		Connection con = null;
    		PreparedStatement pstmt = null;
    		ResultSet rs = null;
    		try {
    			con = DataSource.getInstance().getConnection();
    			StringBuilder sbr = new StringBuilder();

    			sbr.append("select emp_no,birth_date,first_name,last_name,gender,hire_date "
    					+ "from employees.employees limit "+(start-1)+","+total);  
    			System.out.println("I am executing query here : " + sbr.toString());
    			pstmt = con.prepareStatement(sbr.toString());
    			rs = pstmt.executeQuery();
    			
    			
    			while (rs.next()) {
    				dbo = new EmployeesDbo();
    				dbo.setEmpNo(rs.getInt("emp_no"));
    				dbo.setBirthDate(rs.getString("birth_date"));
    				dbo.setFirstName(rs.getString("first_name"));
    				dbo.setLastName(rs.getString("last_name"));
    				dbo.setGender(rs.getString("gender"));
    				dbo.setHireDate(rs.getString("hire_date"));
    				
    				
    				returnList.add(dbo);
    			}
    		
    		}catch (SQLException e) {
    				e.printStackTrace();
    			} catch (Exception e) {
    				// TODO: handle exception
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
    				} catch (SQLException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    		}
    		System.out.println("results "+returnList);
    			return returnList;
    			}
	
		public int getNextEmpNo(){
			
			EmployeesDbo dbo = null;
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int i = 0;
			try {
				con = DataSource.getInstance().getConnection();
				StringBuilder sbr = new StringBuilder();
				
				sbr.append("select max(emp_no)+1 from employees.employees");
				pstmt = con.prepareStatement(sbr.toString());
				System.out.println("I am executing query here : " + sbr.toString());
				rs = pstmt.executeQuery();
				
				if(rs.next()){
				i = rs.getInt("max(emp_no)+1");
			
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
		
			System.out.println("value of i = "+i);
			return i;
			
		}
  }	
	
	



