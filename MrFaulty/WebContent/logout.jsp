<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
<h1>Logout Page</h1>
<%
 session.setAttribute("userid",null);
 session.invalidate();
 
%>

<h2>You have been logged out </h2>
<br>
<form action=""></form>
</body>
</html>