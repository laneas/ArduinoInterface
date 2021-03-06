/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hardware;

import java.io.Serializable;

/**
 *
 * @author Ardjen
 */
public abstract class Component implements Serializable
{
    protected int pin;
    protected String name;
    protected boolean state;
    
    public Component(int thePin)
    {
        pin = thePin;
        name = "default";
        state = false;
    }

    public int getPin()
    {
        return pin;
    }

    public void setPin(int pin)
    {
        this.pin = pin;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isState()
    {
        return state;
    }

    public void setState(boolean state)
    {
        this.state = state;
    }
}
