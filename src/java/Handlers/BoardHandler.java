/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Communication.SerialComm;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ardjen
 */
public class BoardHandler
{
    private String name;
    private String port;
    
    public BoardHandler()
    {
        name = "default";
        port = "default";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPort()
    {
        return port;
    }

    public void setPort(String port)
    {
        this.port = port;
    }
}
