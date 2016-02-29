<%-- 
    Document   : output
    Created on : Feb 29, 2016, 10:57:35 AM
    Author     : Ardjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.IOException"%>
<%@page import="Hardware.Board"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="ledBean" scope="session" class="Handlers.OutputHandler" />
        <jsp:setProperty name="ledBean" property="LED" />
        <h2>Sent: <jsp:getProperty name="ledBean" property="LED" /> </h2>
        
        <% 
            Board userBoard = new Board("Arduino", "COM3");
            try
            {
                userBoard.getComm().out.write(56);
            }
            catch(IOException ioe)
            {
                System.out.println(ioe);
            }
        %>
    </body>
</html>
