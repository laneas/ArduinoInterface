/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Communication.BoardSerializer;
import Hardware.Board;
import Hardware.ContinuousServo;
import Hardware.LED;
import Hardware.Ultrasonic;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ardjen
 */
public class WorkspaceServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {   
        request.getRequestDispatcher("/workspace.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Board temp = boardSim();
        
        Thread serializer = new BoardSerializer(temp);
        serializer.start();
        
        request.getRequestDispatcher("/workspace.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>
    
    public Board boardSim()
    {
        Board userBoard = new Board("MyBoard", "COM3");
          userBoard.addComponent(new LED(1, "LED"));
          userBoard.addComponent(new LED(2, "LED2"));
          userBoard.addComponent(new ContinuousServo(3, "LED3"));
          userBoard.addComponent(new Ultrasonic(4, "LED3"));
          
          return userBoard;
    }

}
