<%@ page import="com.samson.service.IServiceEmployees" %>
<%@ page import="com.samson.service.ServiceEmployees" %>
<%@ page import="com.samson.dao.EmployeesDao" %>
<%@ page import="com.samson.dbo.EmployeesDbo" %>
<%@ page import="com.samson.bo.EmployeesBo" %>

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
String spageid=request.getParameter("page");  
int pageid=Integer.parseInt(spageid);  
int total=5;  
if(pageid==1){}  
else{  
    pageid=pageid-1;  
    pageid=pageid*total+1;  
}  
ServiceEmployees service = new ServiceEmployees();
List<EmployeesBo> list = service.paginationDisplay(pageid, total);

out.print("<h1>Page No: "+spageid+"</h1>");  
out.print("<table border='1' cellpadding='4' width='60%'>");  
out.print("<tr><th>Emp Id</th><th>Birth Date</th><th>FName</th><th>LName</th>");  
for(EmployeesBo e:list){  
    out.print("<tr><td>"+e.getEmpNo()+"</td> <td>"+e.getBirthDate()+"</td>  <td>"+e.getFirstName()+"</td>  <td>"+e.getLastName()+"</td></tr>");  
}  
out.print("</table>");  
%>  

<a href="view.jsp?page=1">1</a>  
<a href="view.jsp?page=2">2</a>  
<a href="view.jsp?page=3">3</a>  


</body>
</html>