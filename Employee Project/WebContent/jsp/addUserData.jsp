<%@ page import="com.samson.bo.AddEmployeeBo" %>
<%@ page import="com.samson.service.ServiceEmployees" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String gender = request.getParameter("Sex");
String birthDate = request.getParameter("datepicker1");
String hireDate = request.getParameter("datepicker2");
String deptNo = request.getParameter("department");
String startDate = request.getParameter("datepicker3");
%>
<%
AddEmployeeBo bo = new AddEmployeeBo();
bo.setFirstName(firstName);
bo.setLastName(lastName);
bo.setGender(gender);
bo.setBirthDate(birthDate);
bo.setHireDate(hireDate);
bo.setDeptNo(deptNo);
bo.setStartDate(startDate);
%>
<%
ServiceEmployees service = new ServiceEmployees();
int i = service.addEmployee(bo);
%>
<% if (i == 1){ %>

<h3> User added successfully </h3>
<%} 
 else { %>
	

	<h3>Failed to add User</h3>
 
<%} %> 
<%-- 
<%= firstName %>
<%= lastName %>
<%= gender %>
<%= birthDate %>
<%= hireDate%>
<%=  deptNo%>
<%= startDate %> --%>

</body>
</html>