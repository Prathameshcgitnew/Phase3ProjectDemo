package com.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Class;
import com.entities.Students;
import com.utilities.HibernateUtil;

/**
 * Servlet implementation class ClassReport
 */
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Section
		//Teachers Name from class Table as per section
		//Subjects for that section from class table
		//Students from student table as per section
		
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
        List<Class> list = session.createQuery("From Class").list();
       
		session.close();
		
		ClassReport classReport=new ClassReport();
		
		List<Students> studentsListOfSection1=classReport.getStudentsBySection(1);
		List<Students> studentsListOfSection2=classReport.getStudentsBySection(2);

		
		request.setAttribute("class", list);
		request.setAttribute("studentsOfSection1", studentsListOfSection1);
		request.setAttribute("studentsOfSection2", studentsListOfSection2);
		RequestDispatcher rd=request.getRequestDispatcher("ClassReport.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	public List<Students> getStudentsBySection(int section){
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		List<Students> studentsList=session.createQuery("From Students").list();
		
		session.close();
		
		List<Students> listOfSection=new ArrayList<Students>();
		
		for(Students s:studentsList) {
			if(s.getSection()==section) {
				listOfSection.add(s);
			}
		}
		
		return listOfSection;

     }
	
}
