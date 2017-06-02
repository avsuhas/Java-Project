<%@ page import="com.samson.sakilaproject.service.IStoreService" %>
<%@ page import="com.samson.sakilaproject.service.StoreService" %>
<%@ page import="com.samson.sakilaproject.bo.StoreBo" %>
<%@page import="java.util.List"%>
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
IStoreService service = new StoreService();
List<StoreBo> list=service.findAll();

%>
<%=list %>
</body>
</html>