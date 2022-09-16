package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/com.servlets.Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Cookie userName=new Cookie("userName",request.getParameter("username"));
		Cookie passWord=new Cookie("passWord",request.getParameter("password"));

		Cookie cookie=null;
		Cookie []cookies =request.getCookies();
		Boolean check=false,check1=false;
		PrintWriter out=response.getWriter();
		Boolean cookieUserNameExists=false,cookiePasswordExists=false;
		//response.sendRedirect("Home.jsp");
	
		for(Cookie c:cookies) {
			if(c.getName().equals("userName")) {
				cookieUserNameExists=true;
			}
			if(c.getName().equals("passWord")) {
				cookiePasswordExists=true;
			}
		}
		if(!cookieUserNameExists && !cookiePasswordExists)
		{
			if((userName.getValue().equals("Admin"))  && (passWord.getValue().equals("Admin")) )
			{ 
				response.addCookie(userName);
				response.addCookie(passWord);
				userName.setMaxAge(3600);
				passWord.setMaxAge(3600);
				RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");
				rd.forward(request, response);
			}else {
				out.println("Enter Valid credential");
			}
		}else {
			if((userName.getValue().equals("Admin"))  && (passWord.getValue().equals("Admin")) )	 
			{   
				RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");
				rd.forward(request, response);
			}else {
				out.println("Enter Valid credential");
			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);



















		//First time login
		/*if(cookies == null) {
			if((userName.getValue().equals("Admin"))  && (passWord.getValue().equals("Admin")) )
			{   
				check=true;
				response.addCookie(userName);
				//userName.setMaxAge(60);
			}

		}else {
					cookies=request.getCookies();
			for(Cookie c :cookies) {
				//response.addCookie(userName);
					if(c.getName().equals("userName")  && c.getValue().equals("Admin") && (passWord.getValue().equals("Admin"))) {
						check1=true;
						break;
					}
				}
		}

		if(check==true || check1==true) {
			RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");
			rd.forward(request, response);
		}else {

			response.sendRedirect("Login.jsp");
			out.println("Enter valid username and password");
		}
		 */
	}

}
