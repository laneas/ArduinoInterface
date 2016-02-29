<%-- 
    Document   : interface
    Created on : Feb 29, 2016, 1:17:24 AM
    Author     : Ardjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interface</title>
        <link href="interface.css" type="text/css" rel="stylesheet" />
        <style>
            body 
            {
                font-family: Courier, monospace;
                background-color: #00979C
            }

            h2
            {
                text-align: center;
                color: #00979C;
                border: 2px solid #000000;
                background-color: #FFFFFF;
            }           

            #logo
            {
                border: 1px solid #FFFFFF;
            }
        </style>
    </head>
    <body>
        <img id="logo" src="res//Logo.png" alt="logo" width="75" height="100"/>
        
        <h2>Welcome to your Interface!</h2>
        
        <p>Message: ${1}</p>
        <p>Message: ${2}</p>
        <p>Message: ${2}</p>
        <p>Message: ${4}</p>
        <p>Message: ${pageContext.request.contextPath}</p>
    </body>
</html>
