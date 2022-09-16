

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.entities.Class" %>
<%@ page import="com.entities.Students" %>

<!DOCTYPE html>
<html>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/dashboard.css">
<link rel="stylesheet" href="css/portal.css">
<body>

<!-- Sidebar -->
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:25%">
  <h3 class="w3-bar-item">ADMIN PORTAL</h3>
  <a href="class?command=classesfetch" class="w3-bar-item w3-button">CLASSES</a>
  <a href="teachers?command=teachersfetch" class="w3-bar-item w3-button">TEACHERS</a>
  <a href="students?command=studentsfetch" class="w3-bar-item w3-button">STUDENTS</a>
  <a href="subjects?command=subjectsfetch" class="w3-bar-item w3-button">SUBJECTS</a>
  <a href="Assignment.jsp" class="w3-bar-item w3-button">ASSIGNMENT</a>
   <a href="reporting?command=reportcreation" class="w3-bar-item w3-button">CLASS-REPORT</a>
    <a href="Login.jsp" class="w3-bar-item w3-button">LOGOUT</a>
  
</div>
 

<div style="margin-left:25%">
 

<div class="w3-container w3-grey">
  <div style="text-align:center">
     <h1>Class-Reports</h1>
  </div>
</div>

<% List<Class> list=(List<Class>)request.getAttribute("class"); %>
<% List<Students> list1=(List<Students>)request.getAttribute("studentsOfSection1"); %>
<% List<Students> list2=(List<Students>)request.getAttribute("studentsOfSection2"); %>
<div class="w3-container">



<br>
<br>
<table>
                   <tr> SECTION 1 REPORT</tr>
					<tr>

			           <!--  <th>Id</th>  -->
						<th>Section</th>
						<th>Teacher</th>
						<th>Subject</th>
		                <th>Students</th>

					</tr>
                 
                     <th rowspan=<%list.size();%>>
                     
                     1
                     
                     
                     </th>
                     &emsp;&emsp;
                    <th>
                       <%for(Class l:list) {%>
                       
                          <%if(l.getSection()==1){ %>
                                <%=l.getTeacher() %><br>
                          <%} %>
                     
                       <%} %>
                    </th>
                    
                    <th>
                       <%for(Class l:list) {%>
                       
                          <%if(l.getSection()==1){ %>
                                <%=l.getSubject() %><br>
                          <%} %>
                     
                       <%} %>
                    </th>
                    
                    <th>
                       <%for(Students l:list1) {%>
                       
                          <%if(l.getSection()==1){ %>
                               <%=l.getFname()+" "+l.getLname() %><br> 
                                
                          <%} %>
                     
                       <%} %>
                    </th>
                    
                    
                    
                   


			

				</table>
				
				
				
				
	<br>
	<br>			
				
				
<table>
                   <tr> SECTION 2 REPORT</tr>
					<tr>

			           <!--  <th>Id</th>  -->
						<th>Section</th>
						<th>Teacher</th>
						<th>Subject</th>
		                <th>Students</th>

					</tr>
                 
                     <th rowspan=<%list.size();%>>
                     
                     2
                     
                     
                     </th>
                     &emsp;&emsp;
                    <th>
                       <%for(Class l:list) {%>
                       
                          <%if(l.getSection()==2){ %>
                                <%=l.getTeacher() %><br>
                          <%} %>
                     
                       <%} %>
                    </th>
                    
                    <th>
                       <%for(Class l:list) {%>
                       
                          <%if(l.getSection()==2){ %>
                                <%=l.getSubject() %><br>
                          <%} %>
                     
                       <%} %>
                    </th>
                    
                    <th>
                       <%for(Students l:list2) {%>
                       
                          <%if(l.getSection()==2){ %>
                               <%=l.getFname()+" "+l.getLname() %><br> 
                                
                          <%} %>
                     
                       <%} %>
                    </th>
                    
                    
                    
                   


			

				</table>
</div>

</div>


 </body>   
    
 </html>   