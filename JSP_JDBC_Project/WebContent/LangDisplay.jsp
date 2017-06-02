<%@page import="com.samson.LanguageBO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="com.samson.LanguageService" %>
<%@page import="java.util.Arrays"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lang Result</title>
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
List<LanguageBO> langlist = new ArrayList<LanguageBO>();
LanguageService ls = new LanguageService();
langlist = ls.getLanguage();

%>

<table style="border: 1px solid;">
	<tr>

    <th>Language_ID</th>
    <th> Name</th>
  
  </tr>

   <%
     for(LanguageBO bo : langlist){
    	 %>
    	<tr>
    	 <td><%=bo.getLanguage_id() %></td> 
    	 <td><%=bo.getName() %></td>
    	 </tr>
    	 <% 	 
    	      }
   
   %>

</table>

</body>
</html>