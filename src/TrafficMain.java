
public class TrafficMain {
  public static void main (String[] args)  
  {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficStatFrame().setVisible(true);
            }
        });
      
      TrafficLight Pattern = new TrafficLight(100);
      Thread LightSwitch = new Thread(Pattern);
      IntersectionArrival Cars = new IntersectionArrival();
      Thread Traffic = new Thread(Cars);
      LightSwitch.start();
      Traffic.start();
      
      
  }
}
