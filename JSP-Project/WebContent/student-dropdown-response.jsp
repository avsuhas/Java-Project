<html>

<head><title> Student Confirmation Title </title></head>
<body>

	The Student is Confirmed: 
	<%=request.getParameter("firstName") %>
	<%=request.getParameter("lastName") %>

	<br/> <br/>

<%--  Short Way of declaration --%>
<%-- 	The Student is Confirmed: ${param.firstName} ${param.lastName} --%>
	The Student's Country: ${param.country}

</body>

</html>