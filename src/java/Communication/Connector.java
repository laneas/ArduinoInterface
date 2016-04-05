/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ardjen
 */
public class Connector extends Thread
{
    public SerialComm arduinoConnector;
    public String port;
    
    public Connector(String thePort)
    {
        port = thePort;
        arduinoConnector = new SerialComm();
    }

    @Override
    public void run()
    {
        try
        {
            arduinoConnector.connect(port);
        }    
        catch (Exception ex)
        {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
