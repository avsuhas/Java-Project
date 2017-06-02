<%@ page import ="com.samson.sakilaproject.service.InventoryService" %>
<%@ page import ="com.samson.sakilaproject.service.IInventoryService" %>
<%@ page import ="com.samson.sakilaproject.bo.InventoryStoreBo" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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

IInventoryService is = new InventoryService();
 List<InventoryStoreBo> list= new ArrayList<InventoryStoreBo>();
	list = is.findAll();

%>

<table >
	<tr>

    <th>Inventory_ID</th>
    <th> Film Id</th>
    <th>Store ID</th>
    <th>Title</th>
    <th>Address</th>
  </tr>
<%
for (InventoryStoreBo bo : list){
	%>
	<tr>
	<td><%= bo.getInventory_id() %></td>

	<td><%=bo.getFilm_id() %> </td>
	
	<td><%= bo.getStore_id() %></td>
	
	<td><%=bo.getFilmTitle() %></td>
	
	
	<td><%=bo.getAddress() %></td>
	</tr>	

<% 
} 
%>


</table>
</body>
</html>