package com.graeme.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.graeme.model.conBean;

/**
 * Servlet implementation class addFault
 */
@WebServlet("/addFault")
public class addFault extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addFault() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session = (HttpSession) req.getAttribute("userID");
		
		/*if((session.getAttribute("userID")==null) || (session.getAttribute("userID")==""))
		{
			//out.println("You are not logged in");
			<br>
			<a href="index.jsp"></a>
			
			
		}*/
		RequestDispatcher dispatcher = req.getRequestDispatcher("addFault.jsp");
		dispatcher.forward(req, res);
		
		/*res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		
		out.println("<HTML>");
		out.println("<HEAD><Title>AddFault</Title></HEAD>");
		out.println("<BODY>");
		out.println("<h1>Add a Fault Page<h1>");
		out.println(""); 
		out.print("<% if((session.getAttribute(\"userid\")==null) || (session.getAttribute(\"userid\")==\"\"))");
		out.print(" {");
		out.print("	<br> <a href=\"index.jsp\"></a>");
		out.print("	}else {");
		out.println("<form action=/MrFaulty/addFault method=post>");//*******need to create another servlet to hold inputted data
		out.println("<table border =0 cellpadding=0 cellspacing=0>");
		out.println("<tr>");
		out.println("<td>Enter a Short description of Fault: </td>");
		out.println("<td><input type=text name = short size=20/></td>");			
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Enter description of fault: </td>");
		out.println("<td><textarea name=long rows=10></textarea></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Severity type(Choose)</td>");
		out.println("<td>");
		out.println("<select name=varSer id=varSer >");
		out.println("<option value=High>High</option>");
		out.println("<option value=Medium>Medium</option>"); 
		out.println("<option value=Low>Low</option>");		
		out.println("</select>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Enter Reporter ID</td>");
		out.println("<td><input type=text name=repID></td>");
		out.println("</tr>");
		out.println("<tr>");	
		out.println("<td></td>");
		out.println("<td><input type=submit value=Submit Fault name=But1/>");
		out.println("<input type=reset name=But2/>");
		out.println("<input type=button onclick=location.href('reporter.jsp'); value=Menu></button></td>");
		out.println("</tr>");
		out.println("</table");	
		out.println("</form>");
		out.println("}%>");

		out.println("</BODY></HTML>");*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		com.graeme.model.addFaultBean myCon = new com.graeme.model.addFaultBean();
		
		String wee = request.getParameter("short"); 
		String big = request.getParameter("long");
		String priority = request.getParameter("varSer"); 
		String temp = request.getParameter("repID");
		int rep = Integer.parseInt(temp);
		
		
		myCon.setData(wee, big, priority, rep);
		
		//Redirects User
		RequestDispatcher dispatcher = request.getRequestDispatcher("reporter.jsp");
		dispatcher.forward(request, response);
		
	}

}
