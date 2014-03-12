package com.graeme.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.graeme.model.loginBean;
import com.graeme.model.loginStore;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("logout.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//System.out.println("This is beginning of login servlett");
		
		HttpSession session = request.getSession();
		
		loginBean LoginBean = new loginBean();
	
		String Name = request.getParameter("name");
		String Pass = request.getParameter("pass");
		
		//System.out.println("List is being made and verify user called.\n" + Name + Pass );
		
		List<loginStore> loginData = LoginBean.userVerify();
		
		//System.out.println(loginData.isEmpty());
		
		
		//System.out.println("Starting Iterator");
		
		Iterator<loginStore> it = loginData.iterator();
		
		//System.out.println("Starting Servlet While loop");
		
		//System.out.println(loginData.isEmpty());
		
		while(it.hasNext())
		{
			//System.out.println("In the servlet while loop. ");
			
			loginStore item = new loginStore();
			item = it.next();
			//System.out.println(item.getEmail());
			String EMAIL = item.getEmail();
			String PASS = item.getPasword();
			String TYPE = item.getAccess_Type();
			//System.out.println(EMAIL + " "+ PASS);
			
			if(EMAIL.equals(Name))
			{
				System.out.println("Your name is correct!");
				if(PASS.equals(Pass))
				{
					System.out.println("You have been logged in!!");
					session.setAttribute("userid", EMAIL);
				}
				else
				{
					System.out.println("You have wrong password");
					RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
					dispatcher.forward(request,response);
				}
				String type = TYPE + ".jsp";
				RequestDispatcher dispatcher = request.getRequestDispatcher(type);
				dispatcher.forward(request,response);
				break;
			}
			else
			{
				System.out.println("Not logging in");
				
			}
			
		
		}
		
	}
}
