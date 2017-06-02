<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Header </title>
</head>
    <style type="text/css">
       
    html, body {
    	margin: 0px;
    	background: #ebebeb;
    }
      .ulTag {
      	list-style-type: none;
      	background: #0E283C;
      	margin: 0px;
      }
      
      
      .liTag {
        display: inline-block;
            padding: 15px 25px;
            background: grey;
            border-radius: 5px;
            margin: 10px 0px 10px 0px;
            text-align: right;
        } 
        .sbmtBtn {
        	width: 90px;
		    height: 35px;
		    border-radius: 10px;
		    font-size: 17px;
		    margin-top: 20px;
}
        }
        
        .login{
			display: inline-block;
            padding: 15px 25px;
            background: goldenrod;
            border-radius: 5px;
            margin: -5px 10px 10px 0px;
            text-align: right;

    	}
   

 /* CSS Document */
/* ---------- FONTAWESOME ---------- */
/* ---------- https://fortawesome.github.com/Font-Awesome/ ---------- */
/* ---------- http://weloveiconfonts.com/ ---------- */
@import url(http://weloveiconfonts.com/api/?family=fontawesome);
/* ---------- ERIC MEYER'S RESET CSS ---------- */
/* ---------- https://meyerweb.com/eric/tools/css/reset/ ---------- */
@import url(https://meyerweb.com/eric/tools/css/reset/reset.css);
/* ---------- FONTAWESOME ---------- */
[class*="fontawesome-"]:before {
  font-family: 'FontAwesome', sans-serif;
}

/* ---------- GENERAL ---------- */
* {
  -moz-box-sizing: border-box;
       box-sizing: border-box;
}
*:before, *:after {
  -moz-box-sizing: border-box;
       box-sizing: border-box;
}

body {
  background: #2c3338;
  color: #606468;
  font: 87.5%/1.5em 'Open Sans', sans-serif;
  margin: 0;
  overflow-y:auto !important;
  overflow-x:hidden !important;
}

a {
  color: #eee;
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}

input {
  border: none;
  font-family: 'Open Sans', Arial, sans-serif;
  font-size: 14px;
  line-height: 1.5em;
  padding: 0;
  -webkit-appearance: none;
}

p {
  line-height: 1.5em;
}

.clearfix {
  *zoom: 1;
}
.clearfix:before, .clearfix:after {
  content: ' ';
  display: table;
}
.clearfix:after {
  clear: both;
}

.container {
  left: 50%;
  position:absolute;
   top: 50%;
  -webkit-transform: translate(-50%, -50%);
      -ms-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
}

/* ---------- LOGIN ---------- */

/*Lets start with the cloud formation rather*/

/*The container will also serve as the SKY*/

*{ margin: 0; padding: 0;}

#clouds{
	padding: 100px 0;
	background: #c9dbe9;
	background: -webkit-linear-gradient(top, #c9dbe9 0%, #fff 100%);
	background: -linear-gradient(top, #c9dbe9 0%, #fff 100%);
	background: -moz-linear-gradient(top, #c9dbe9 0%, #fff 100%);
}

/*Time to finalise the cloud shape*/
.cloud {
	width: 200px; height: 60px;
	background: #fff;
	
	border-radius: 200px;
	-moz-border-radius: 200px;
	-webkit-border-radius: 200px;
	
	position: relative; 
}

.cloud:before, .cloud:after {
	content: '';
	position: absolute; 
	background: #fff;
	width: 100px; height: 80px;
	position: absolute; top: -15px; left: 10px;
	
	border-radius: 100px;
	-moz-border-radius: 100px;
	-webkit-border-radius: 100px;
	
	-webkit-transform: rotate(30deg);
	transform: rotate(30deg);
	-moz-transform: rotate(30deg);
}

.cloud:after {
	width: 120px; height: 120px;
	top: -55px; left: auto; right: 15px;
}

/*Time to animate*/
.x1 {
	-webkit-animation: moveclouds 15s linear infinite;
	-moz-animation: moveclouds 15s linear infinite;
	-o-animation: moveclouds 15s linear infinite;
}

/*variable speed, opacity, and position of clouds for realistic effect*/
.x2 {
	left: 200px;
	
	-webkit-transform: scale(0.6);
	-moz-transform: scale(0.6);
	transform: scale(0.6);
	opacity: 0.6; /*opacity proportional to the size*/
	
	/*Speed will also be proportional to the size and opacity*/
	/*More the speed. Less the time in 's' = seconds*/
	-webkit-animation: moveclouds 25s linear infinite;
	-moz-animation: moveclouds 25s linear infinite;
	-o-animation: moveclouds 25s linear infinite;
}

.x3 {
	left: -250px; top: -200px;
	
	-webkit-transform: scale(0.8);
	-moz-transform: scale(0.8);
	transform: scale(0.8);
	opacity: 0.8; /*opacity proportional to the size*/
	
	-webkit-animation: moveclouds 20s linear infinite;
	-moz-animation: moveclouds 20s linear infinite;
	-o-animation: moveclouds 20s linear infinite;
}

.x4 {
	left: 470px; top: -250px;
	
	-webkit-transform: scale(0.75);
	-moz-transform: scale(0.75);
	transform: scale(0.75);
	opacity: 0.75; /*opacity proportional to the size*/
	
	-webkit-animation: moveclouds 18s linear infinite;
	-moz-animation: moveclouds 18s linear infinite;
	-o-animation: moveclouds 18s linear infinite;
}

.x5 {
	left: -150px; top: -150px;
	
	-webkit-transform: scale(0.8);
	-moz-transform: scale(0.8);
	transform: scale(0.8);
	opacity: 0.8; /*opacity proportional to the size*/
	
	-webkit-animation: moveclouds 20s linear infinite;
	-moz-animation: moveclouds 20s linear infinite;
	-o-animation: moveclouds 20s linear infinite;
}

@-webkit-keyframes moveclouds {
	0% {margin-left: 1000px;}
	100% {margin-left: -1000px;}
}
@-moz-keyframes moveclouds {
	0% {margin-left: 1000px;}
	100% {margin-left: -1000px;}
}
@-o-keyframes moveclouds {
	0% {margin-left: 1000px;}
	100% {margin-left: -1000px;}
}
.bottom {
	width:100%; margin:0 auto; text-align:center; padding:10px 0; height:100px; position:absolute;
}
.bottom h3 {color:white; font-size:30px; font-weight:bold; margin-top:45px; padding-bottom:45px;}
.blue { color:#09c;} 
 
   
        
</style>
  
<body>
	<%
String userName = "";
 if(null == session.getAttribute("user_name")){
	 
 }else {
	 userName = session.getAttribute("user_name").toString();
 }
	
%>

	
	<div class="ulTag">
	<ul>
		<li class="liTag"> <a href="employees.jsp?page=1" style="color:black;">Employees</a></li>		
		<li class="liTag"><a href="../jsp/departments.jsp" style="color:black;">Departments</a></li>
		<li class="liTag"><a href="../jsp/user.jsp" style="color:black;">Users</a></li>
		<li class="liTag"><a href="../jsp/addUser.jsp" style="color:black;">Add User</a></li>
		<li style="float:right;padding-right: 38px;padding-top: 20px"  >Hello <%=userName %></li>
	</ul>
	
	</div>
	
	</div>
	<div>
		<ul>
			<li class="login" style="float:right"><a href="../html/welcomePage.html" style="color:black;">Login</a></li>
			
		</ul>
	</div>
	
	<br>
	
	<div>
	<div id="clouds">
	<div class="cloud x1"></div>
	<!-- Time for multiple clouds to dance around -->
	<div class="cloud x2"></div>
	<div class="cloud x3"></div>
	<div class="cloud x4"></div>
	<div class="cloud x5"></div>	
</div>
	<br>




</body>
</html>