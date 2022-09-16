<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <link type="text/css" rel="stylesheet" href="css/login.css"> 
</head>
<body>

    <div class="center">
    <div class="center1">
   <h1> Admin Login </h1>
   
    <form action="Login" method="post">
   
          <label>Username  : </label>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br><br>
            <label>Password  : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br><br>
            <div class="center1">
            <button type="submit">Login</button> 
            </div>  
            <br/>
            
            <br>
            <input type="checkbox" checked="checked"> Remember me   
       
          </form>
        </div> 
</div>

</body>
</html>


