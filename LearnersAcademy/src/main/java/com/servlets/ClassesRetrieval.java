package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Class;
import com.utilities.HibernateUtil;

/**
 * Servlet implementation class ClassesRetrieval
 */
@WebServlet("/com.servlets.ClassesRetrieval")
public class ClassesRetrieval extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassesRetrieval() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
        List<Class> list = session.createQuery("From Class").list();
       
		session.close();
		//request.setAttribute("Product_LIST", students);
        
		/*for(EProduct p: list)
        {
        	out.println("ID:" + String.valueOf(p.getID()) + ",Name: "+p.getName() + ",Price: "+String.valueOf(p.getPrice() + ",Date Added: "+p.getDateAdded().toString() + "<br>"));
        }*/
		
		request.setAttribute("class", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("Classes.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
