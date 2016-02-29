<%-- 
    Document   : output
    Created on : Feb 29, 2016, 10:57:35 AM
    Author     : Ardjen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    </body>
</html>
