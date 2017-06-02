<%@page import="com.samson.sakilaproject.SakilaConstants"%>
<%@page import="com.samson.sakilaproject.service.ActorService"%>
<%@page import="java.util.List"%>
<%@page import="com.samson.sakilaproject.bo.ActorBo"%>

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
		String selectionType = request.getParameter("nameField");
	   
		String firstName = "";
		String lastName = "";
		if (selectionType.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_AND_LAST_NAME)
				|| selectionType.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_OR_LAST_NAME)
				|| selectionType.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_NAME)) 
		{
			firstName = (null != request.getParameter("firstName")) ? request.getParameter("firstName") : "";

		} else if (selectionType.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_AND_LAST_NAME)
				|| selectionType.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_OR_LAST_NAME)
				|| selectionType.equalsIgnoreCase(SakilaConstants.SEARCH_BY_LAST_NAME))

		 {
			lastName = (null != request.getParameter("lastName")) ? request.getParameter("lastName") : "";
		}
		ActorService as = new ActorService();
		List<ActorBo> listFirst = as.findActorsBySearchString(firstName, lastName, selectionType);
	%>
	
	<%=listFirst %>

</body>
</html>