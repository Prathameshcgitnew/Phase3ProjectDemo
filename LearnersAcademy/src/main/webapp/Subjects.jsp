<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.entities.Subjects" %>

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
     <h1>SUBJECTS</h1>
  </div>
</div>

<% List<Subjects> list=(List<Subjects>)request.getAttribute("subjects"); %>

<div class="w3-container">




<table>

					<tr>

			             <th>Id</th>
						<th>SubjectName</th>
						<th>ShortName</th>
						
		                

					</tr>
                      <% for(Subjects l:list) {%>
						<tr>
					    
					     <th><%=l.getId()%></th>
                         <th><%=l.getName() %></th>
                         <th><%=l.getShortcut()%></th>
                         
                         
						</tr>
                      <%} %> 

			

				</table>
</div>

</div>


 </body>   
    
 </html>   