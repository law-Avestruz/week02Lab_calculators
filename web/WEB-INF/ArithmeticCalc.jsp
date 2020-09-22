<%-- 
    Document   : ArithmeticCalculatorServlet
    Created on : Sep 22, 2020, 11:35:12 AM
    Author     : Law
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
        
        <style>
            body{
                width: 30%;
                margin: auto auto;
            }
            
            body h1{
                margin-top: 30px;
            }
            
            body p {
                font-weight:  bold;
                font-style: italic;
            }
           
        </style>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label> First
                <input type="text" value="${first}" name="first-number">
            </label>    


            <label> Second
                <input type="text" value="${second}" name="second-number">
            </label>   


            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="/">

            <p>${result}</p>
            
            <a href="./age">&#8592; Age Calculator </a>
        </form>
    </body>
</html>
