package com.samson.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.bo.AddEmployeeBo;
import com.samson.bo.EmployeeInfoBo;
import com.samson.bo.EmployeesBo;
import com.samson.dao.DepartmentsDao;
import com.samson.dao.DeptEmpDao;
import com.samson.dao.EmployeesDao;
import com.samson.dao.SalariesDao;
import com.samson.dao.TitleDao;
import com.samson.dbo.DepartmentsDbo;
import com.samson.dbo.DeptEmpDbo;
import com.samson.dbo.EmployeesDbo;
import com.samson.dbo.SalariesDbo;
import com.samson.dbo.TitleDbo;

public class ServiceEmployees implements IServiceEmployees{

	public static void main(String[] args) {
		int id = 401809;
		ServiceEmployees service = new ServiceEmployees();
		AddEmployeeBo bo = new AddEmployeeBo();
		
		EmployeesDao empDao = new EmployeesDao();
		EmployeesDbo empDbo = new EmployeesDbo();
		bo.setBirthDate("05/12/1908");
		bo.setFirstName("vikram");
		bo.setLastName("sia");
		bo.setGender("M");
		
		empDbo.setGender(bo.getGender());
		empDbo.setHireDate(bo.getHireDate());
		System.out.println(empDbo);
		service.addEmployee(bo);
	}
	
	public int addEmployee(AddEmployeeBo bo){
		int i=0;
		EmployeesDao empDao = new EmployeesDao();
		EmployeesDbo empDbo = new EmployeesDbo();
		int empNo = empDao.getNextEmpNo();
		empDbo.setEmpNo(empNo);
		empDbo.setFirstName(bo.getFirstName());
		empDbo.setLastName(bo.getLastName());
		empDbo.setBirthDate(bo.getBirthDate());
		empDbo.setGender(bo.getGender()); 
		empDbo.setHireDate(bo.getHireDate());
		
		System.out.println(empDbo);
		i=empDao.insert(empDbo);
		
		return i;
			
		}
	
	public EmployeeInfoBo findEmpInfo(int id){
		EmployeesDao employeeDao = new EmployeesDao();
		EmployeesDbo employeesDbo = employeeDao.findById(id);
		
		String deptNo="";
		String deptName = "";
		int salary = 0;
		String title = "";
		
		deptNo = getDepForEmpId(id);
		deptName = getDeptName(deptNo);
		salary = getSalary(id);
		title = getTitle(id);
		
		EmployeeInfoBo bo= new EmployeeInfoBo();
		bo.setEmpNo(id);
		bo.setFirstName(employeesDbo.getFirstName());
		bo.setLastName(employeesDbo.getLastName());
		bo.setDepartment(deptName);
		bo.setSalary(salary);
		bo.setTitle(title);
		
		System.out.println(bo);
		return bo;
	}
	
	@Override
	public List<EmployeesBo> findAll() {

		List<EmployeesBo> returnList = new ArrayList<EmployeesBo>();
		
		EmployeesBo bo = null;
		EmployeesDao dao = new EmployeesDao();
		List<EmployeesDbo> employeesDbo = dao.findAll();
		for(EmployeesDbo dbo : employeesDbo){
			bo = new EmployeesBo();
			bo.setEmpNo(dbo.getEmpNo());
			bo.setBirthDate(dbo.getBirthDate());
			bo.setFirstName(dbo.getFirstName());
			bo.setLastName(dbo.getLastName());
			bo.setGender(dbo.getGender());
			bo.setHireDate(dbo.getHireDate());
			returnList.add(bo);
		}
		System.out.println(returnList);
		return returnList;
	}
	
	public List<EmployeesBo> paginationDisplay(int start,int total){
		List<EmployeesBo> returnList = new ArrayList<EmployeesBo>();
		
		EmployeesBo bo = null;
		EmployeesDao dao = new EmployeesDao();
		List<EmployeesDbo> employeesDbo = dao.getRecords(start, total);
		for(EmployeesDbo dbo : employeesDbo){
			bo = new EmployeesBo();
			bo.setEmpNo(dbo.getEmpNo());
			bo.setBirthDate(dbo.getBirthDate());
			bo.setFirstName(dbo.getFirstName());
			bo.setLastName(dbo.getLastName());
			bo.setGender(dbo.getGender());
			bo.setHireDate(dbo.getHireDate());
			returnList.add(bo);
		}
		System.out.println(returnList);
		return returnList;
		
	}

	public String getDepForEmpId(int id){
		DeptEmpDao dao = new DeptEmpDao();
		DeptEmpDbo dbo = dao.findById(id);		
		return  dbo.getDeptNo();
		
	}
	
	public String getDeptName(String id){		
		DepartmentsDao dao = new DepartmentsDao();
		DepartmentsDbo dbo = dao.findById(id);		
		return dbo.getDeptName();
	}

	public int getSalary(int id){		
		SalariesDao dao = new SalariesDao();
		SalariesDbo dbo = dao.findById(id);
		return dbo.getSalary();
	}

	public String getTitle(int id){		
		TitleDao dao = new TitleDao();
		TitleDbo dbo =dao.findById(id);
		return dbo.getTitle();		
	}
	
	
	
}