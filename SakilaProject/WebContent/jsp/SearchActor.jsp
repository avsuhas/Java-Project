<%@page import="com.samson.sakilaproject.SakilaConstants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<title>Insert title here</title>
</head>
 <style type="text/css">
    html, body {
    	margin: 0px;
    	background: #ebebeb;
    }
    	.dropdown-content a {
	    color: black;
	    padding: 12px 16px;
	    text-decoration: none;
	    display: block;
	}

	.topnav {
    background-color: #333;
    overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
    float: left;
    display: block;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
    background-color: #ddd;
    color: black;
}

/* Hide the link that should open and close the topnav on small screens */
.topnav .icon {
    display: none;
}
	
 </style>

<body>
<div class="topnav" id="myTopnav">
  <a href="#home">Home</a>
  <a href="#news">News</a>
  <a href="#contact">Contact</a>
  <a href="#about">About</a>

</div>
<form action="searchActorData.jsp" id=id >
<br>
<br>
<center ><h3>Search by:</h3>

<select name ="nameField" id="nameField">
    <option value="null" selected="selected" >--- Please Select---</option>
 
    <option value="<%=SakilaConstants.SEARCH_BY_FIRST_NAME %>">Only FirstName</option>
    <option value="<%=SakilaConstants.SEARCH_BY_LAST_NAME %>">Only LastName</option>
    <option value="<%=SakilaConstants.SEARCH_BY_FIRST_OR_LAST_NAME %>">Or</option>
    <option value="<%=SakilaConstants.SEARCH_BY_FIRST_AND_LAST_NAME %>">And</option>
</select>
<br><br>
First Name <input type="text" name="firstName" id="firstNameInput"/>
Last Name <input type="text" name="lastName" id="lastNameInput" />
<br><br>
<input type="submit"/>
<input type="reset"/>

</center>
</form>

<script type="text/javascript">
var nameField = document.getElementById("nameField");
var firstNameInput = document.getElementById("firstNameInput");
var lastNameInput = document.getElementById("lastNameInput");

nameField.addEventListener("change", function(){

  if(nameField.value === "Search By First Name"){
    firstNameInput.disabled = false;
    lastNameInput.disabled = true;
  }
  else if(nameField.value === "Search By Last Name"){
    firstNameInput.disabled = true;
    lastNameInput.disabled = false;
  }
  else {
    firstNameInput.disabled = false;
    lastNameInput.disabled = false;
  }

});

</script>

</body>
</html>
