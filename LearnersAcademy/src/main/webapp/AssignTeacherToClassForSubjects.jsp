<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.entities.Class" %>

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
     <h1>Assignment Of Teacher</h1>
  </div>
</div>


<div class="w3-container">
       
      <form action="UpdateClasses" method="post">
      	<br>
      	<br>
      	<br>
      	
      <label  for="sections"> &emsp;&emsp; Sections &emsp;&emsp;:</label>
           
      <select name="sections" id="sections" required>
         <option value="">select</option>
         <option value="1">1</option>
         <option value="2">2</option>
      </select>
       
       <br>
      	<br>
      	<br>
      <label for="teachers"> &emsp;&emsp; Teachers &emsp;&emsp;:</label>
           
      <select name="teachers" id="teachers" required>
      <option value="">select</option>
         <option value="Dev Devang">Dev Devang</option>
         <option value="Mahesh Joshi">Mahesh Joshi</option>
      </select>
      
      <br>
      	<br>
      	<br>
      <label for="subjects"> &emsp;&emsp; Subjects &emsp;&emsp;:</label>
           
      <select name="subjects" id="subjects" required>
         <option value="">select</option>
         <option value="English">English</option>
         <option value="Mathematics">Mathematics</option>
      </select>
      <br>
      	<br>
      	<br>
      <label for="time"> &emsp;&emsp; Time &emsp;&emsp;&emsp;&emsp;:</label>
           
      <select name="time" id="time" required>
         <option value="">select</option>
         <option value="3.00">3.00</option>
         <option value="4.00">4.00</option>
      </select>
      <br>
      	<br>
      	<br>
    &emsp;&emsp;&emsp;&emsp;  <input type="submit" value="Submit"></input>
      
      </form>

</div>

</div>


 </body>   
    
 </html>   