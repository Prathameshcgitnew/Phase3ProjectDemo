package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.*;
import com.entities.Class;
import com.utilities.HibernateUtil;
/**
 * Servlet implementation class UpdateClasses
 */
public class UpdateClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateClasses() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   Class c=new Class();//form com.entities.Class
	   
		String section=request.getParameter("sections");
		String teacher=request.getParameter("teachers");
		String subject=request.getParameter("subjects");
		String time =request.getParameter("time");
		c.setSection(Integer.parseInt(section));
		c.setSubject(subject);
		c.setTeacher(teacher);
		c.setTime(time);
		PrintWriter out=response.getWriter();
		Transaction transaction=null;
		//out.println(section+" "+teacher+" "+subject+" "+time);
		try {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		//doGet(request, response);
		
		Session session=factory.openSession();
		
	    transaction=session.beginTransaction();
		
		session.save(c);
		
		transaction.commit();
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			
			e.printStackTrace();
		}
		
	}

}
