
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitTimeE implements Runnable{
public int Time = 0;
public int Position;


public WaitTimeE(int Pos)
{
    Position = Pos;
}
   
@Override
    public void run() {
 
 while(TrafficLight.LightState == 1)
        {   
    try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitTime.class.getName()).log(Level.SEVERE, null, ex);
            }
            Time++;
            TrafficStatFrame.EastQueue.setValueAt(Time, Position, 1);
            }
}
}
