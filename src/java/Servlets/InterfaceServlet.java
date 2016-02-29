/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Hardware.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ardjen
 */
public class InterfaceServlet extends HttpServlet
{
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        Board userBoard = boardSim();
        
        for(int i = 0; i < userBoard.getComponents().size(); i++)
        {
            String attribute = "comp"+Integer.toString(i);
            request.setAttribute(attribute, 
                    "<h3>"+userBoard.getComponents().get(i).getName()+"</h3>"+
                    "<form name=\"Control\" action=\"http://localhost:8080/ArduinoInterface/interface\"/>"+
                    "<input type=\"text\" name=\"output\"/>"+
                    "<input type=\"submit\" value=\"Send\" />"+
                    "</form>");
        }
        
        request.getRequestDispatcher("/WEB-INF/interface.jsp").forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doPost(request, response);
        //request.getRequestDispatcher("/WEB-INF/interface.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "This Servlet creates an interface for the user";
    }// </editor-fold>
    
    public Board boardSim()
    {
        Board userBoard = new Board("Arduino", "COM3");
          userBoard.addComponent(new LED(1, "LED"));
          userBoard.addComponent(new ContinuousServo(2, "Continuous Servo"));
          userBoard.addComponent(new Ultrasonic(3, "Ultrasonic Sensor"));
          
          return userBoard;
    }

}
