package com.samson.bo;

public class DeptEmpBo {
	
	int empNo;
	String deptNo;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "DeptEmpBo [empNo=" + empNo + ", deptNo=" + deptNo + "]";
	}
	

}
