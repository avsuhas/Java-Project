
<%@page import="com.samson.sakilaproject.service.StaffService" %>
<%@page import="com.samson.sakilaproject.service.IStaffService"%>
<%@page import="com.samson.sakilaproject.bo.StaffBo" %>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Staff list</title>
</head>
<body>
<% 

IStaffService service = new StaffService();

List<StaffBo> list = service.findAllStaff();

%>

My list of staff is <br></br>
<%= list %>
</body>
</html>