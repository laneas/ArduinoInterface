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
public class ContinuousServo extends Servo implements Incrementable, Serializable
{
    
    public ContinuousServo(int thePin)
    {
        super(thePin);
        upperLimit = 180;
        lowerLimit = 0;
        defaultAngle = 90;
    }
    
    public ContinuousServo(int thePin, String theName)
    {
        super(thePin);
        upperLimit = 180;
        lowerLimit = 0;
        defaultAngle = 90;
        name = theName;
    }
    
}
