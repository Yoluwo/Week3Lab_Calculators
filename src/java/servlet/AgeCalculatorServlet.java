package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 805580
 */
public class AgeCalculatorServlet extends HttpServlet {
     
     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                  .forward(request, response);
     }
     
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
          
          String message = "";
          String ageString = request.getParameter("age");
          
          if(ageString != ""){
               
               try {
                    int age = Integer.parseInt(ageString);
                    int nextAge = age +1;
                    
                    message = "Your age next birthday will be " + nextAge + ".";
               }
               catch (Exception e) {
                    message = "You must enter a number.";
               }
          }
          else {
               message = "You must give your current age.";
          }
          
          request.setAttribute("message", message);
          
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                  .forward(request, response);
     }
}