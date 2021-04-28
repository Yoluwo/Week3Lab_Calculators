<%-- 
    Document   : agecalculator
    Created on : 1-Feb-2021, 11:02:25 AM
    Author     : 805580
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Age Calculator</title>
     </head>
     <body>
          <h1>Age Calculator</h1>
          
          <form method="POST" action="age">
               <label>Enter your age: </label>
               <input type="text" name="age"> <br>
               <input type="submit" value="Age next birthday">
          </form>
          <a href="arithmetic"> Arithmetic Calculator </a>
          <p>${message}</p>
     </body>
</html>