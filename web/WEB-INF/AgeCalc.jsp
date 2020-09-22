<%-- 
    Document   : AgeCalc
    Created on : Sep 22, 2020, 10:35:44 AM
    Author     : Law
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
        
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
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label> Enter your age:
                <input type="text" value="${age}" name="age_input">
            </label>    
            <input type="submit" value="Age next Birthday">

            <p>${result}</p>
            
            <a href="./arithmetic">Arithmetic Calculator &#8594;</a>
        </form>
    </body>
</html>
