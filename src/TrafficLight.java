
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TrafficLight implements Runnable{
 
 int reps;
 public static int LightState = 1;
 
 public static boolean running = true;
 public static int i = 0;
 public TrafficLight(int reps) {
        this.reps = reps;
    }
 
    @Override
    public void run() {
      
      for(int i = 0; i < reps; i++) 
      {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TrafficLight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(LightState == 1)
        {
            LightState = 0;
           
           
            TrafficStatFrame.NHeader.setBackground(Color.RED);
            TrafficStatFrame.SHeader.setBackground(Color.RED);
            TrafficStatFrame.EHeader.setBackground(Color.GREEN);
            TrafficStatFrame.WHeader.setBackground(Color.GREEN);
            
        }
        
        else
        {
            LightState = 1;
             
            
            TrafficStatFrame.NHeader.setBackground(Color.GREEN);
            TrafficStatFrame.SHeader.setBackground(Color.GREEN);
            TrafficStatFrame.EHeader.setBackground(Color.RED);
            TrafficStatFrame.WHeader.setBackground(Color.RED);
            
        }
       }
      running = false;
    }
    
 
    
}
