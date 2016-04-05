
package Communication;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.InputStream;
import java.io.OutputStream;

public class SerialComm
{
    public InputStream in;
    public OutputStream out;
    public SerialReader sr;
    public SerialWriter sw;
    
    public SerialComm()
    {
        super();
        System.out.println("Serial Communication Created");
    }
    
    public void connect ( String portName ) throws Exception
    {
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if ( portIdentifier.isCurrentlyOwned() )
        {
            //------close port-------
            System.out.println("Attempting to close port");
            CommPort killPort = portIdentifier.open(this.getClass().getName(), 2000);
            killPort.close();
            System.out.println("Port has been closed");
            //----------------------
            System.out.println("Error: Port is currently in use");
            System.out.println("Port owned by: "+portIdentifier.getCurrentOwner());
        }
        else
        {
            System.out.println("Attempting to make CommPort");
            CommPort commPort = portIdentifier.open(this.getClass().getName(),2000);
            
            if ( commPort instanceof SerialPort )
            {
                SerialPort serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
                
                in = serialPort.getInputStream();
                out = serialPort.getOutputStream();
                
                sr = new SerialReader(in);
                sw = new SerialWriter(out);
                (new Thread(sr)).start();
                (new Thread(sw)).start();

            }
            else
            {
                System.out.println("Error: Only serial ports are handled by this example.");
            }
        }     
    }
}
