package com.samson.bo;

public class DepartmentsBo {

		String deptNo;
		String deptName;
		public String getDeptNo() {
			return deptNo;
		}
		public void setDeptNo(String deptNo) {
			this.deptNo = deptNo;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		@Override
		public String toString() {
			return "DepartmentsBo [deptNo=" + deptNo + ", deptName=" + deptName + "]";
		}
		
		
}
