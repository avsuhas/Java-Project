<%@page import="com.samson.sakilaproject.service.ActorService"%>
<%@page import="java.util.List" %>
<%@page import="com.samson.sakilaproject.bo.ActorBo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<%
 String matchChar = (null != request.getParameter("startChar")) ? 
		             request.getParameter("startChar") : "";   
		             
		             ActorService as = new ActorService();
		             
		      //  List<ActorBo> list = as.findActorsBySearchString(matchChar);
		        
 
%>


</body>
</html>