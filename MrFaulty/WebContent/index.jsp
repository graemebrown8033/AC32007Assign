<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon</title>
</head>
<body>
<h1>LOG ON SCREEN</h1>
<form Method="post" action="/MrFaulty/loginServlet"> <!-- ****** Needs sorting what line ******* -->
Enter email:
<input type=text Name="name"><p>
Enter password:
<input type="password" name="pass"><p>
<input type=submit value="Submit">
<input type=reset>
</form>
</body>
</html>