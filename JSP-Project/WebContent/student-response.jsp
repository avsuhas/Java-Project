<html>

<head><title> Student Confirmation Title </title></head>
<body>

	The Student is Confirmed: 

	<%=request.getParameter("firstName") %>
	<%=request.getParameter("lastName") %>


<%--  Short Way of declaration --%>
<%-- 	The Student is Confirmed: ${param.firstName} ${param.lastName} --%>

</body>

</html>