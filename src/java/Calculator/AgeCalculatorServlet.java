/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Law
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalc.jsp")
                .forward(request,response);
    }

    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age_input = request.getParameter("age_input");
        String result = "";
        
         if(age_input == null || age_input.equals("")){
             result = "You must give you current age.";
         }else{
             try{
                 int age = Integer.parseInt(age_input) + 1;
                 if(age - 1 < 0){
                     throw new Exception();
                 }
                 result = "Your age next birthday will  be " + age;
                 request.setAttribute("age", age - 1);
             }catch(Exception e){
                 result = "Result: Invalid Input.";
             }
         }
             
               
        request.setAttribute("result", result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalc.jsp")
                .forward(request,response);
        
    }
    }

   
  