package Communication;

import java.io.IOException;
import java.io.OutputStream;

    public class SerialWriter implements Runnable 
    {
        public OutputStream out;
        
        public SerialWriter ( OutputStream outstream )
        {
            System.out.println("Serial Writer Created");
            this.out = outstream;
        }
        
        public void run ()
        {
            try
            {                
                int c = 0;
                while ( ( c = System.in.read()) > -1 )
                {
                    this.out.write(c);
                }                
            }
            catch ( IOException e )
            {
                e.printStackTrace();
            }            
        }
    }
