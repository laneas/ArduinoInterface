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
public class Motor extends Component implements Incrementable, Serializable
{
    private int defaultRotations, upperRotations, lowerRotations, rotations;
    private int direction;
    
    public Motor(int thePin)
    {
        super(thePin);
    }
    
    public Motor(int thePin, String theName)
    {
        super(thePin);
        name = theName;
    }

    @Override
    public void setUpperLimit(int upperLimit)
    {
        upperRotations = upperLimit;
    }

    @Override
    public void setLowerLimit(int lowerLimit)
    {
        lowerRotations = lowerLimit;
    }

    @Override
    public void writeAngle(int theAngle)
    {
        rotations = theAngle;
    }

    @Override
    public void setToDefault()
    {
        direction = 0;
    }

    public int getDefaultRotations()
    {
        return defaultRotations;
    }

    public void setDefaultRotations(int defaultRotations)
    {
        this.defaultRotations = defaultRotations;
    }

    public int getDirection()
    {
        return direction;
    }

    public void setDirection(int theDirection)
    {
        direction = theDirection;
        
        if(direction > 0)
        {
            //move foward
        }
        else if(direction < 0)
        {
            //move backward
        }
        else
        {
            //stop
        }
    }
    
}
