<%@ page import="com.samson.Login" %>
<html>

<head><title> You are Authorized User </title></head>

<body>
<jsp:include page="header.html" />

<%

String userName = request.getParameter("loginName");
String pwd = request.getParameter("password");
boolean isValidUser = new Login().isAuthUser(userName, pwd);

if(isValidUser){
	session.setAttribute("user_name", userName);
	%>
	
	I AM A VALID USER
	
	<% 
	 
 }else {
	 %>
	 I AM NOT A VALID USER
	 
	 <%
	 
 }
 
%>


The User is Confirmed: ${param.loginName}
	

<jsp:include page="footer.jsp" />
</body>

</html>