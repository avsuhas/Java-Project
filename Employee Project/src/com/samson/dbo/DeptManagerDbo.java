package com.samson.dbo;

public class DeptManagerDbo {
	
	int empNo;
	String deptNo;
	String fromDate;
	String toDate;
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
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "DeptManagerDbo [empNo=" + empNo + ", deptNo=" + deptNo + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ "]";
	}
	
	
	

}
