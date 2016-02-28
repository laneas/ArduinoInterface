<%-- 
    Document   : workspace
    Created on : Feb 25, 2016, 3:26:49 PM
    Author     : Ardjen
--%>

<%@page import="Handlers.BoardHandler"%>
<%@page import="Hardware.Board"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Workspace</title>
        <link href="workspace.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <img id="logo" src="res//Logo.png" alt="logo" width="75" height="100"/>
        <jsp:useBean id="nameBean" scope="session" class="Handlers.BoardHandler" />
        <jsp:useBean id="portBean" scope="session" class="Handlers.BoardHandler" />
        <jsp:setProperty name="nameBean" property="name" />
        <jsp:setProperty name="portBean" property="port" />
        
        <h1>Welcome to your Workspace!</h1>
        
        <table id="toolbar" class="toolbar">
            <tr>
                <td><img src="res/LED.png" width="200" height="150" alt="LED" title="LED"/></td>
                <td><img src="res/Ultrasonic.png" width="200" height="150" alt="Ultrasonic Sensor" title="Ultrasonic Sensor"/></td>
                <td><img src="res/Servo.png" width="200" height="150" alt="Servo" title="Standard Servo"/></td>
                <td><img src="res/ConServo.png" width="200" height="150" alt="Continous Servo" title="Continuous Servo"/></td>
            </tr>
        </table>
        
        <h2>Board: <jsp:getProperty name="nameBean" property="name" /> </h2>
        <h2>Port: <jsp:getProperty name="portBean" property="port" /> </h2>
        <%-- <%!Board userBoard = new Board(nameBean, portBean); %> --%>
    </body>
</html>
