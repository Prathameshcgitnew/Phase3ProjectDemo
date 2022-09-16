package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Subjects;
import com.utilities.HibernateUtil;

/**
 * Servlet implementation class SubjectsRetrieval
 */
public class SubjectsRetrieval extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectsRetrieval() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		List<Subjects> list=session.createQuery("From Subjects").list();
		
		session.close();
		
		request.setAttribute("subjects", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("Subjects.jsp");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append("SubjectsRetrieval");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
