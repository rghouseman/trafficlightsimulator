import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitTimeS implements Runnable{
public int Time = 0;
public int Position;


public WaitTimeS(int Pos)
{
    Position = Pos;
}
    @Override
    public void run() {
 
    while(TrafficLight.LightState == 0)
        {    
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitTime.class.getName()).log(Level.SEVERE, null, ex);
            }
            Time++;
            TrafficStatFrame.SouthQueue.setValueAt(Time, Position, 1);
        
            }
    }
}
