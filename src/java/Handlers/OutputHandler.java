/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

/**
 *
 * @author Ardjen
 */
public class OutputHandler
{
    private String data;
    private String LED;
    
    public OutputHandler()
    {
        data = null;
        LED = null;
    }
    
    public void setData(String theData)
    {
        data = theData;
    }
    
    public String getData()
    {
        return data;
    }
    
    public void setLED(String theLED)
    {
        LED = theLED;
    }
    
    public String getLED()
    {
        return LED;
    }
}
