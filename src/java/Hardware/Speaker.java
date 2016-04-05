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
public class Speaker extends Component implements Serializable
{
    private int volume;
    private String fileLocation;
    
    public Speaker(int thePin)
    {
        super(thePin);
    }
    
    public Speaker(int thePin, String theName)
    {
        super(thePin);
        name = theName;
    }
    
    public void play()
    {
        //find default file and play it
    }
    
    public void play(String theLocation)
    {
        //play a specific file.
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public String getFileLocation()
    {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation)
    {
        this.fileLocation = fileLocation;
    }
}
