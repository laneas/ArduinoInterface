<%-- 
    Document   : workspace
    Created on : Feb 25, 2016, 3:26:49 PM
    Author     : Ardjen
--%>

<%@page import="Communication.Connector"%>
<%@page import="Handlers.BoardHandler"%>
<%@page import="Hardware.Board"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Workspace</title>
        <link href="workspace.css" type="text/css" rel="stylesheet" />
        
        <script>
            function allowDrop(ev) 
            {
                ev.preventDefault();
            }

            function drag(ev) 
            {
                ev.dataTransfer.setData("text", ev.target.id);
            }

            function drop(ev) 
            {
                ev.preventDefault();
                var data = ev.dataTransfer.getData("text");
                ev.target.appendChild(document.getElementById(data));
            }
            
            function dropcopy(ev)
            {
                ev.preventDefault();
                var data=ev.dataTransfer.getData("Text");
                var copyimg = document.createElement("img");
                var original = document.getElementById(data);
                copyimg.src = original.src;
                ev.target.appendChild(copyimg);
            }
            
            function getWorkspaceInfo()
            {
                document.getElementById("echo").innerHTML = document.getElementById('workspace').innerHTML;
            }
        </script>
        
    </head>
        <jsp:useBean id="nameBean" scope="session" class="Handlers.BoardHandler" />
        <jsp:useBean id="portBean" scope="session" class="Handlers.BoardHandler" />
        <jsp:setProperty name="nameBean" property="name" />
        <jsp:setProperty name="portBean" property="port" />
        <%
            String name = nameBean.getName();
            String port = portBean.getPort();
            
        %>
        
        <%-- Board userBoard = new Board(name, port); --%>
        
        <img id="logo" src="res//Logo.png" alt="logo" width="75" height="100"/>
        
        <h1>Welcome to your Workspace!</h1>
        
        <table id="toolbar" class="toolbar">
            <tr>
                <td><img src="res/LED.png" 
                         id="led"
                         width="200" height="150" 
                         alt="LED" 
                         title="LED"
                         draggable="true"
                         ondragstart="drag(event)"/></td>
                <td><img src="res/Ultrasonic.png"
                         id="ussensor"
                         width="200" height="150" 
                         alt="Ultrasonic Sensor" 
                         title="Ultrasonic Sensor"
                         draggable="true"
                         ondragstart="drag(event)"/></td>
                <td><img src="res/Servo.png"
                         id="servo"
                         width="200" height="150" 
                         alt="Servo" 
                         title="Standard Servo"
                         draggable="true"
                         ondragstart="drag(event)"/></td>
                <td><img src="res/ConServo.png"
                         id="cservo"
                         width="200" height="150" 
                         alt="Continous Servo" 
                         title="Continuous Servo"
                         draggable="true"
                         ondragstart="drag(event)"/></td>
                <td><img src="res/Uno.png"
                         id="uno"
                         width="200" height="150" 
                         alt="Continous Servo" 
                         title="Arduino Uno"
                         draggable="true"
                         ondragstart="drag(event)"/></td>
            </tr>
        </table>
  
        <div id="workspace" ondrop="dropcopy(event)" ondragover="allowDrop(event)"></div>
        
        <p id="echo"></p>
        
         <button onclick="getWorkspaceInfo()">Echo</button>
        
        <form action="interface" method="post">
            <input type="submit" name="button1" value="Create Interface"/>
        </form>
        
        <form action="workspace" method="post">
            <input type="submit" name="save" value="Save"/>
        </form>
        
        <form action="workspace" method="get">
            <input type="text" name="load" value="Enter File Path to Load"/>
        </form>
        
        <h2>Board: <jsp:getProperty name="nameBean" property="name" /> </h2>
        <h2>Port: <jsp:getProperty name="portBean" property="port" /> </h2>
</html>
