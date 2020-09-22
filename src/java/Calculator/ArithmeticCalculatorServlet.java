/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Law
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalc.jsp")
                .forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        float firstNum =0;
        float secondNum = 0;
        String clicked = request.getParameter("operation");
        String result = "";
                
        try{
            String getFirst =request.getParameter("first-number");
            String getSecond =request.getParameter("second-number");
            
            
                firstNum = Float.parseFloat(getFirst);
                secondNum = Float.parseFloat(getSecond);
                
            if(getFirst == null || getFirst.equals("") 
                    || getSecond == null || getSecond.equals("")){
                result = "Result = --- ";
            }else{
 
                result = "Result: " + firstNum + " " + clicked + " " + secondNum;
             
                switch(clicked){
                    case "+": result += " = " + (firstNum + secondNum);break;
                    case "-": result += " = " + (firstNum - secondNum);break;
                    case "*": result += " = " + (firstNum * secondNum);break;
                    case "/": result += " = " + (firstNum / secondNum);break;
                }
            }
                        
            request.setAttribute("first", getFirst);
            request.setAttribute("second", getSecond);
            
             
        }catch(NumberFormatException e){
            result = "Result: Invalid Input ";
        }
                
               
        request.setAttribute("result", result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalc.jsp")
                .forward(request,response);
        
    }
        
}
