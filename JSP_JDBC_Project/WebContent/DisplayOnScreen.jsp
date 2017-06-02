<%@page import="com.samson.ActorBO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="com.samson.ActorService" %>
<%@page import="java.util.Arrays"%>
<%@ page isELIgnored="false" %> 



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB Result</title>
</head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

<body>
<%
List<ActorBO> actorList = new ArrayList<ActorBO>();
ActorService as = new ActorService();
actorList = as.getActors();

%>

<table style="border: 1px solid;">
	<tr>

    <th>Actor_ID</th>
    <th>First Name</th>
    <th>Last Name</th>
  </tr>

   <%
     for(ActorBO bo : actorList){
    	 %>
    	<tr>
    	 <td><%=bo.getId() %></td> 
    	 <td><%=bo.getFirst_Name() %></td>
    	 <td><%=bo.getLast_Name() %></td>
    	</tr>
    	 <% 	 
    	      }
   
   %>

</table>

</body>
</html>