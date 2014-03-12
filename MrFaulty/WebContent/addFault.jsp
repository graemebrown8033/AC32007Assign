<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Fault</title>
</head>
<h1>Add a Fault Page</h1>
		
		<% 
			if((session.getAttribute("userid")==null) || (session.getAttribute("userid")==""))
		 		{%>
					You have not been logged in!<br><br>		
					<a href="index.jsp">GO TO LOGIN PAGE.</a>
				<%}
		else {%>
		<form action=/MrFaulty/addFault method=post>
		<table border =0 cellpadding=0 cellspacing=0>
		<tr>
		<td><h4>Enter a Short description of Fault: </h4></td>
		<td><input type=text name = short size=20/></td>			
		</tr>
		<tr>
		<td><h4>Enter description of fault: </h4></td>
		<td><textarea name=long rows=10></textarea></td>
		</tr>
		<tr>
		<td><h4>Severity type(Choose)</h4></td>
		<td>
		<select name=varSer id=varSer >
		<option value=High>High</option>
		<option value=Medium>Medium</option> 
		<option value=Low>Low</option>		
		</select>
		</td>
		</tr>
		<tr>
		<td>Enter Reporter ID</td>
		<td><input type=text name=repID></td>
		</tr>
		<tr>	
		<td></td>
		<td><input type=submit value=Submit Fault name=But1/>
		<input type=reset name=But2/>
		<input type=button onclick=location.href("reporter.jsp") value=Menu></button></td>
		</tr>
		</table>	
		</form>
		<%}%>
</body>
</html>