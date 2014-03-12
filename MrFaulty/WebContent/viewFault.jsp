<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@ page import="java.util.*" %>
    <%@ page import="com.graeme.model.storeBean" %>
  
    
<title>View faults</title>
</head>
<body>
<h1>View All Faults</h1>
<% 
			if((session.getAttribute("userid")==null) || (session.getAttribute("userid")==""))
		 		{%>
					You have not been logged in!<br><br>		
					<a href="index.jsp">GO TO LOGIN PAGE.</a>
				<%}
		else {%>
<form method="post" action="/MrFaulty/reporter.jsp" > 
	<input type="submit" value="Menu">
</form>
<br>
	<% 
	if (request.getAttribute("dataBean") !=null){
		ArrayList<storeBean> storeB = (ArrayList<storeBean>)request.getAttribute("dataBean");
	
		Iterator it = storeB.iterator();
		
			
		
	        while(it.hasNext())
	        {
	          
	        	storeBean item = (storeBean)it.next();
	            int value = item.getFaultID();	
	            String value2 =  item.getShort_Desc();
	       	 	String value3 = item.getDescription();
	    	 	String value4 = item.getPriority();
				int value5 = item.getReported_By();
	    	 	
				%>
		
			 <table class="tftable" border="1">
<tr><th>Fault ID</th><th>Error Code</th><th>Description</th><th>Priority</th><th>Reported BY</th></tr>
<tr><td><%=value%></td><td><%=value2%></td><td><%=value3%></td><td><%=value4%></td><td><%=value5%></td></tr>

</table>

			  
			  <%
			  }
	        %>
                                    
                            
	        <%
	}else
	{
		%>
		<p><strong>No Data</strong></p>
		<%
	}
		}	%>
						
</body>
</html>