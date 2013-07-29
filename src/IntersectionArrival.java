
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IntersectionArrival implements Runnable {
    Random NorthSouth = new Random();
    Random EastWest = new Random();
    Random Route = new Random ();
    int SelRoute;
    int Arrival;
    int NCount = 0;
    int SCount = 0;
    int ECount = 0;
    int WCount = 0;
    int TCount = 0;
    int QCountN = 0;
    int QCountS = 0;
    int QCountE = 0;
    int QCountW = 0;
    int c = 0;
    String NTimeTally;
    int NTalToInt;
    int NAvg;
    String STimeTally;
    int STalToInt;
    int SAvg;
    String ETimeTally;
    int ETalToInt;
    int EAvg;
    String WTimeTally;
    int WTalToInt;
    int WAvg;
    int TAvg;
    String CAvg;
    LLQueue NorthQueue = new LLQueue();
    LLQueue SouthQueue = new LLQueue();
    LLQueue EastQueue = new LLQueue();
    LLQueue WestQueue = new LLQueue();
    

    
    @Override
    public void run() {
        
        while (TrafficLight.running == true)
        {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(TrafficLight.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        if(TrafficLight.LightState == 1 && NorthQueue.front != null)
        {
          while(NorthQueue.front != null)
                  {
            
                try {
                    NorthQueue.Ndequeue();
                          try {
                              Thread.sleep(500);
                          } catch (InterruptedException ex) {
                              Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                          }
                } catch (QueueUnderFlowException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                NCount++;
                TCount++;
                String NCountString = Integer.toString(NCount);
                TrafficStatFrame.Total.setText(NCountString);
                String TCountString = Integer.toString(TCount);
                TrafficStatFrame.Total4.setText(TCountString);
                
                NTimeTally = TrafficStatFrame.NorthQueue.getValueAt(0, 1).toString();
                NTalToInt += Integer.parseInt(NTimeTally);
                NAvg = NTalToInt / NCount;
                NTimeTally = Integer.toString(NAvg);
                
                        
                String Nten2 = TrafficStatFrame.NorthQueue.getValueAt(9, 1).toString();
                TrafficStatFrame.NorthQueue.setValueAt("", 9, 1);
                  String Nnine2 = TrafficStatFrame.NorthQueue.getValueAt(8, 1).toString();
                  TrafficStatFrame.NorthQueue.setValueAt(Nten2, 8, 1);
                    String Neight2 = TrafficStatFrame.NorthQueue.getValueAt(7, 1).toString();
                    TrafficStatFrame.NorthQueue.setValueAt(Nnine2, 7, 1);
                      String Nseven2 = TrafficStatFrame.NorthQueue.getValueAt(6, 1).toString();
                      TrafficStatFrame.NorthQueue.setValueAt(Neight2, 6, 1);
                        String Nsix2 = TrafficStatFrame.NorthQueue.getValueAt(5, 1).toString();
                        TrafficStatFrame.NorthQueue.setValueAt(Nseven2, 5, 1);
                          String Nfive2 = TrafficStatFrame.NorthQueue.getValueAt(4, 1).toString();
                          TrafficStatFrame.NorthQueue.setValueAt(Nsix2, 4, 1);
                            String Nfour2 = TrafficStatFrame.NorthQueue.getValueAt(3, 1).toString();
                            TrafficStatFrame.NorthQueue.setValueAt(Nfive2, 3, 1);
                              String Nthree2 = TrafficStatFrame.NorthQueue.getValueAt(2, 1).toString();
                              TrafficStatFrame.NorthQueue.setValueAt(Nfour2, 2, 1);
                               String Ntwo2 = TrafficStatFrame.NorthQueue.getValueAt(1, 1).toString();
                               TrafficStatFrame.NorthQueue.setValueAt(Nthree2, 1, 1);
                               TrafficStatFrame.NorthQueue.setValueAt(Ntwo2, 0, 1);
                              TrafficStatFrame.Navg.setText(NTimeTally);
                              TAvg = (NAvg + SAvg + EAvg + WAvg) / 4;
                              CAvg = Integer.toString(TAvg);
                              TrafficStatFrame.Cavg.setText(CAvg);
                
                String Nten = TrafficStatFrame.NorthQueue.getValueAt(9, 0).toString();
                TrafficStatFrame.NorthQueue.setValueAt("", 9, 0);
                  String Nnine = TrafficStatFrame.NorthQueue.getValueAt(8, 0).toString();
                  TrafficStatFrame.NorthQueue.setValueAt(Nten, 8, 0);
                    String Neight = TrafficStatFrame.NorthQueue.getValueAt(7, 0).toString();
                    TrafficStatFrame.NorthQueue.setValueAt(Nnine, 7, 0);
                      String Nseven = TrafficStatFrame.NorthQueue.getValueAt(6, 0).toString();
                      TrafficStatFrame.NorthQueue.setValueAt(Neight, 6, 0);
                        String Nsix = TrafficStatFrame.NorthQueue.getValueAt(5, 0).toString();
                        TrafficStatFrame.NorthQueue.setValueAt(Nseven, 5, 0);
                          String Nfive = TrafficStatFrame.NorthQueue.getValueAt(4, 0).toString();
                          TrafficStatFrame.NorthQueue.setValueAt(Nsix, 4, 0);
                            String Nfour = TrafficStatFrame.NorthQueue.getValueAt(3, 0).toString();
                            TrafficStatFrame.NorthQueue.setValueAt(Nfive, 3, 0);
                              String Nthree = TrafficStatFrame.NorthQueue.getValueAt(2, 0).toString();
                              TrafficStatFrame.NorthQueue.setValueAt(Nfour, 2, 0);
                               String Ntwo = TrafficStatFrame.NorthQueue.getValueAt(1, 0).toString();
                               TrafficStatFrame.NorthQueue.setValueAt(Nthree, 1, 0);
                               
                               TrafficStatFrame.NorthQueue.setValueAt(Ntwo, 0, 0);
                               QCountN = 0;
                               TrafficStatFrame.CurPlate.setText("");
                   }
        }
        
        if(TrafficLight.LightState == 1 && SouthQueue.front != null)
        {
                 while(SouthQueue.front != null)
                  {
            
                try {
                    SouthQueue.Sdequeue();
                          try {
                              Thread.sleep(500);
                          } catch (InterruptedException ex) {
                              Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                          }
                } catch (QueueUnderFlowException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                SCount++;
                TCount++;
                String SCountString = Integer.toString(SCount);
                TrafficStatFrame.Total1.setText(SCountString);
                String TCountString = Integer.toString(TCount);
                TrafficStatFrame.Total4.setText(TCountString);
                
                STimeTally = TrafficStatFrame.SouthQueue.getValueAt(0, 1).toString();
                STalToInt += Integer.parseInt(STimeTally);
                SAvg = STalToInt / SCount;
                STimeTally = Integer.toString(SAvg);
                String Sten2 = TrafficStatFrame.SouthQueue.getValueAt(9, 1).toString();
                TrafficStatFrame.SouthQueue.setValueAt("", 9, 1);
                  String Snine2 = TrafficStatFrame.SouthQueue.getValueAt(8, 1).toString();
                  TrafficStatFrame.SouthQueue.setValueAt(Sten2, 8, 1);
                    String Seight2 = TrafficStatFrame.SouthQueue.getValueAt(7, 1).toString();
                    TrafficStatFrame.SouthQueue.setValueAt(Snine2, 7, 1);
                      String Sseven2 = TrafficStatFrame.SouthQueue.getValueAt(6, 1).toString();
                      TrafficStatFrame.SouthQueue.setValueAt(Seight2, 6, 1);
                        String Ssix2 = TrafficStatFrame.SouthQueue.getValueAt(5, 1).toString();
                        TrafficStatFrame.SouthQueue.setValueAt(Sseven2, 5, 1);
                          String Sfive2 = TrafficStatFrame.SouthQueue.getValueAt(4, 1).toString();
                          TrafficStatFrame.SouthQueue.setValueAt(Ssix2, 4, 1);
                            String Sfour2 = TrafficStatFrame.SouthQueue.getValueAt(3, 1).toString();
                            TrafficStatFrame.SouthQueue.setValueAt(Sfive2, 3, 1);
                              String Sthree2 = TrafficStatFrame.SouthQueue.getValueAt(2, 1).toString();
                              TrafficStatFrame.SouthQueue.setValueAt(Sfour2, 2, 1);
                               String Stwo2 = TrafficStatFrame.SouthQueue.getValueAt(1, 1).toString();
                               TrafficStatFrame.SouthQueue.setValueAt(Sthree2, 1, 1);
                               
                               TrafficStatFrame.SouthQueue.setValueAt(Stwo2, 0, 1);
                               TrafficStatFrame.Savg.setText(STimeTally);
                               TAvg = (NAvg + SAvg + EAvg + WAvg) / 4;
                               CAvg = Integer.toString(TAvg);
                               TrafficStatFrame.Cavg.setText(CAvg);
                               
                 String Sten = TrafficStatFrame.SouthQueue.getValueAt(9, 0).toString();
                TrafficStatFrame.SouthQueue.setValueAt("", 9, 0);
                  String Snine = TrafficStatFrame.SouthQueue.getValueAt(8, 0).toString();
                  TrafficStatFrame.SouthQueue.setValueAt(Sten, 8, 0);
                    String Seight = TrafficStatFrame.SouthQueue.getValueAt(7, 0).toString();
                    TrafficStatFrame.SouthQueue.setValueAt(Snine, 7, 0);
                      String Sseven = TrafficStatFrame.SouthQueue.getValueAt(6, 0).toString();
                      TrafficStatFrame.SouthQueue.setValueAt(Seight, 6, 0);
                        String Ssix = TrafficStatFrame.SouthQueue.getValueAt(5, 0).toString();
                        TrafficStatFrame.SouthQueue.setValueAt(Sseven, 5, 0);
                          String Sfive = TrafficStatFrame.SouthQueue.getValueAt(4, 0).toString();
                          TrafficStatFrame.SouthQueue.setValueAt(Ssix, 4, 0);
                            String Sfour = TrafficStatFrame.SouthQueue.getValueAt(3, 0).toString();
                            TrafficStatFrame.SouthQueue.setValueAt(Sfive, 3, 0);
                              String Sthree = TrafficStatFrame.SouthQueue.getValueAt(2, 0).toString();
                              TrafficStatFrame.SouthQueue.setValueAt(Sfour, 2, 0);
                               String Stwo = TrafficStatFrame.SouthQueue.getValueAt(1, 0).toString();
                               TrafficStatFrame.SouthQueue.setValueAt(Sthree, 1, 0);
                               
                               TrafficStatFrame.SouthQueue.setValueAt(Stwo, 0, 0);
                               QCountS = 0;
                               TrafficStatFrame.CurPlate1.setText("");
                               
                  }
        }
        
        if(TrafficLight.LightState == 0 && EastQueue.front != null)
        {
                while(EastQueue.front != null)
                  {
            
                try {
                    EastQueue.Edequeue();
                          try {
                              Thread.sleep(500);
                          } catch (InterruptedException ex) {
                              Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                          }
                } catch (QueueUnderFlowException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                ECount++;
                TCount++;
                String ECountString = Integer.toString(ECount);
                TrafficStatFrame.Total2.setText(ECountString);
                String TCountString = Integer.toString(TCount);
                TrafficStatFrame.Total4.setText(TCountString);
                
                ETimeTally = TrafficStatFrame.EastQueue.getValueAt(0, 1).toString();
                ETalToInt += Integer.parseInt(ETimeTally);
                EAvg = ETalToInt / ECount;
                ETimeTally = Integer.toString(EAvg);
                
                String Eten = TrafficStatFrame.EastQueue.getValueAt(9, 0).toString();
                TrafficStatFrame.EastQueue.setValueAt("", 9, 0);
                  String Enine = TrafficStatFrame.EastQueue.getValueAt(8, 0).toString();
                  TrafficStatFrame.EastQueue.setValueAt(Eten, 8, 0);
                    String Eeight = TrafficStatFrame.EastQueue.getValueAt(7, 0).toString();
                    TrafficStatFrame.EastQueue.setValueAt(Enine, 7, 0);
                      String Eseven = TrafficStatFrame.EastQueue.getValueAt(6, 0).toString();
                      TrafficStatFrame.EastQueue.setValueAt(Eeight, 6, 0);
                        String Esix = TrafficStatFrame.EastQueue.getValueAt(5, 0).toString();
                        TrafficStatFrame.EastQueue.setValueAt(Eseven, 5, 0);
                          String Efive = TrafficStatFrame.EastQueue.getValueAt(4, 0).toString();
                          TrafficStatFrame.EastQueue.setValueAt(Esix, 4, 0);
                            String Efour = TrafficStatFrame.EastQueue.getValueAt(3, 0).toString();
                            TrafficStatFrame.EastQueue.setValueAt(Efive, 3, 0);
                              String Ethree = TrafficStatFrame.EastQueue.getValueAt(2, 0).toString();
                              TrafficStatFrame.EastQueue.setValueAt(Efour, 2, 0);
                               String Etwo = TrafficStatFrame.EastQueue.getValueAt(1, 0).toString();
                               TrafficStatFrame.EastQueue.setValueAt(Ethree, 1, 0);
                               
                               TrafficStatFrame.EastQueue.setValueAt(Etwo, 0, 0);
                               TrafficStatFrame.Eavg.setText(ETimeTally);
                               TAvg = (NAvg + SAvg + EAvg + WAvg) / 4;
                               CAvg = Integer.toString(TAvg);
                               TrafficStatFrame.Cavg.setText(CAvg);
                              
                String E2ten = TrafficStatFrame.EastQueue.getValueAt(9, 1).toString();
                TrafficStatFrame.EastQueue.setValueAt("", 9, 1);
                  String E2nine = TrafficStatFrame.EastQueue.getValueAt(8, 1).toString();
                  TrafficStatFrame.EastQueue.setValueAt(E2ten, 8, 1);
                    String E2eight = TrafficStatFrame.EastQueue.getValueAt(7, 1).toString();
                    TrafficStatFrame.EastQueue.setValueAt(E2nine, 7, 1);
                      String E2seven = TrafficStatFrame.EastQueue.getValueAt(6, 1).toString();
                      TrafficStatFrame.EastQueue.setValueAt(E2eight, 6, 1);
                        String E2six = TrafficStatFrame.EastQueue.getValueAt(5, 1).toString();
                        TrafficStatFrame.EastQueue.setValueAt(E2seven, 5, 1);
                          String E2five = TrafficStatFrame.EastQueue.getValueAt(4, 1).toString();
                          TrafficStatFrame.EastQueue.setValueAt(E2six, 4, 1);
                            String E2four = TrafficStatFrame.EastQueue.getValueAt(3, 1).toString();
                            TrafficStatFrame.EastQueue.setValueAt(E2five, 3, 1);
                              String E2three = TrafficStatFrame.EastQueue.getValueAt(2, 1).toString();
                              TrafficStatFrame.EastQueue.setValueAt(E2four, 2, 1);
                               String E2two = TrafficStatFrame.EastQueue.getValueAt(1, 1).toString();
                               TrafficStatFrame.EastQueue.setValueAt(E2three, 1, 1);
                               TrafficStatFrame.EastQueue.setValueAt(E2two, 0, 1);
                               
                               
                               QCountE = 0;
                               TrafficStatFrame.CurPlate2.setText("");
           
                  }
        }
        
        if(TrafficLight.LightState == 0 && WestQueue.front != null)
        {
                 while(WestQueue.front != null)
                  {
            
                try {
                    WestQueue.Wdequeue();
                          try {
                              Thread.sleep(500);
                          } catch (InterruptedException ex) {
                              Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                          }
                } catch (QueueUnderFlowException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                WCount++;
                TCount++;
                String WCountString = Integer.toString(WCount);
                TrafficStatFrame.Total3.setText(WCountString);
                String TCountString = Integer.toString(TCount);
                TrafficStatFrame.Total4.setText(TCountString);
                
                WTimeTally = TrafficStatFrame.WestQueue.getValueAt(0, 1).toString();
                WTalToInt += Integer.parseInt(WTimeTally);
                WAvg = WTalToInt / WCount;
                WTimeTally = Integer.toString(WAvg);
                
                String W2ten = TrafficStatFrame.WestQueue.getValueAt(9, 1).toString();
                TrafficStatFrame.WestQueue.setValueAt("", 9, 1);
                  String W2nine = TrafficStatFrame.WestQueue.getValueAt(8, 1).toString();
                  TrafficStatFrame.WestQueue.setValueAt(W2ten, 8, 1);
                    String W2eight = TrafficStatFrame.WestQueue.getValueAt(7, 1).toString();
                    TrafficStatFrame.WestQueue.setValueAt(W2nine, 7, 1);
                      String W2seven = TrafficStatFrame.WestQueue.getValueAt(6, 1).toString();
                      TrafficStatFrame.WestQueue.setValueAt(W2eight, 6, 1);
                        String W2six = TrafficStatFrame.WestQueue.getValueAt(5, 1).toString();
                        TrafficStatFrame.WestQueue.setValueAt(W2seven, 5, 1);
                          String W2five = TrafficStatFrame.WestQueue.getValueAt(4, 1).toString();
                          TrafficStatFrame.WestQueue.setValueAt(W2six, 4, 1);
                            String W2four = TrafficStatFrame.WestQueue.getValueAt(3, 1).toString();
                            TrafficStatFrame.WestQueue.setValueAt(W2five, 3, 1);
                              String W2three = TrafficStatFrame.WestQueue.getValueAt(2, 1).toString();
                              TrafficStatFrame.WestQueue.setValueAt(W2four, 2, 1);
                               String W2two = TrafficStatFrame.WestQueue.getValueAt(1, 1).toString();
                               TrafficStatFrame.WestQueue.setValueAt(W2three, 1, 1);
                               TrafficStatFrame.WestQueue.setValueAt(W2two, 0, 1);
                               TrafficStatFrame.Wavg.setText(WTimeTally);
                               TAvg = (NAvg + SAvg + EAvg + WAvg) / 4;
                               CAvg = Integer.toString(TAvg);
                               TrafficStatFrame.Cavg.setText(CAvg);
                               
                               String Wten = TrafficStatFrame.WestQueue.getValueAt(9, 0).toString();
                TrafficStatFrame.WestQueue.setValueAt("", 9, 0);
                  String Wnine = TrafficStatFrame.WestQueue.getValueAt(8, 0).toString();
                  TrafficStatFrame.WestQueue.setValueAt(Wten, 8, 0);
                    String Weight = TrafficStatFrame.WestQueue.getValueAt(7, 0).toString();
                    TrafficStatFrame.WestQueue.setValueAt(Wnine, 7, 0);
                      String Wseven = TrafficStatFrame.WestQueue.getValueAt(6, 0).toString();
                      TrafficStatFrame.WestQueue.setValueAt(Weight, 6, 0);
                        String Wsix = TrafficStatFrame.WestQueue.getValueAt(5, 0).toString();
                        TrafficStatFrame.WestQueue.setValueAt(Wseven, 5, 0);
                          String Wfive = TrafficStatFrame.WestQueue.getValueAt(4, 0).toString();
                          TrafficStatFrame.WestQueue.setValueAt(Wsix, 4, 0);
                            String Wfour = TrafficStatFrame.WestQueue.getValueAt(3, 0).toString();
                            TrafficStatFrame.WestQueue.setValueAt(Wfive, 3, 0);
                              String Wthree = TrafficStatFrame.WestQueue.getValueAt(2, 0).toString();
                              TrafficStatFrame.WestQueue.setValueAt(Wfour, 2, 0);
                               String Wtwo = TrafficStatFrame.WestQueue.getValueAt(1, 0).toString();
                               TrafficStatFrame.WestQueue.setValueAt(Wthree, 1, 0);
                               
                               TrafficStatFrame.WestQueue.setValueAt(Wtwo, 0, 0);
                               QCountW = 0;
                               TrafficStatFrame.CurPlate3.setText("");
                  }
        }
        
        
        SelRoute = Route.nextInt(4);
    
        if(SelRoute == 0)
        {
            Arrival = NorthSouth.nextInt(5);
                if(Arrival == 0 || Arrival == 1 || Arrival == 2 )
                {
                    if(TrafficLight.LightState == 1 && NorthQueue.front == null)
                    {
                    Car nCar = new Car();
                    TrafficStatFrame.CurPlate.setText(nCar.toString());
                    NCount++;
                    String NCountString = Integer.toString(NCount);
                    TrafficStatFrame.Total.setText(NCountString);
                    TCount++;
                    String TCountString = Integer.toString(TCount);
                    TrafficStatFrame.Total4.setText(TCountString);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                    TrafficStatFrame.CurPlate.setText("");
                    }
                }
            
                 if(TrafficLight.LightState == 0 )
                 {
                     Car nCar = new Car();
                     NorthQueue.enqueue(nCar);
                     TrafficStatFrame.NorthQueue.setValueAt(nCar.toString(), QCountN, 0);
                     QCountN++;
                     WaitTime Nwait = new WaitTime(QCountN - 1);
                     Thread NW = new Thread(Nwait);
                     NW.start();
                     
                 }
                 
                 
        }
    
        if(SelRoute == 1)
        {
            Arrival = NorthSouth.nextInt(5);
            if(Arrival == 3 || Arrival == 4)
                {
                     if(TrafficLight.LightState == 1)
                    {
                    Car nCar = new Car();
                    TrafficStatFrame.CurPlate1.setText(nCar.toString());
                    SCount++;
                    String SCountString = Integer.toString(SCount);
                    TrafficStatFrame.Total1.setText(SCountString);
                    TCount++;
                    String TCountString = Integer.toString(TCount);
                    TrafficStatFrame.Total4.setText(TCountString);
                    try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                    TrafficStatFrame.CurPlate1.setText("");
                    }
                }
                
            if(TrafficLight.LightState == 0 )
                 {
                     Car nCar = new Car();
                     SouthQueue.enqueue(nCar);
                     TrafficStatFrame.SouthQueue.setValueAt(nCar.toString(), QCountS, 0);
                     QCountS++;
                     WaitTimeS Swait = new WaitTimeS(QCountS - 1);
                     Thread SW = new Thread(Swait);
                     SW.start();
                 }
        }
        
        if(SelRoute == 2)
        {
            Arrival = EastWest.nextInt(10);
            if(Arrival % 5 == 0)
                {
                     if(TrafficLight.LightState == 0)
                    {
                    Car nCar = new Car();
                    TrafficStatFrame.CurPlate2.setText(nCar.toString());
                    ECount++;
                    String ECountString = Integer.toString(ECount);
                    TrafficStatFrame.Total2.setText(ECountString);
                    TCount++;
                    String TCountString = Integer.toString(TCount);
                    TrafficStatFrame.Total4.setText(TCountString);
                      try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                    TrafficStatFrame.CurPlate2.setText("");
                    }
                }
            if(TrafficLight.LightState == 1 )
                 {
                     Car nCar = new Car();
                     EastQueue.enqueue(nCar);
                     TrafficStatFrame.EastQueue.setValueAt(nCar.toString(), QCountE, 0);
                     QCountE++;
                     WaitTimeE Ewait = new WaitTimeE(QCountE - 1);
                     Thread EW = new Thread(Ewait);
                     EW.start();
                 }
        }
        
        else
        {
            Arrival = EastWest.nextInt(10);
            if(Arrival % 3 == 0)
                {
                     if(TrafficLight.LightState == 0)
                    {
                    Car nCar = new Car();
                    TrafficStatFrame.CurPlate3.setText(nCar.toString());
                    WCount++;
                    String WCountString = Integer.toString(WCount);
                    TrafficStatFrame.Total3.setText(WCountString);
                    TCount++;
                    String TCountString = Integer.toString(TCount);
                    TrafficStatFrame.Total4.setText(TCountString);
                  try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(IntersectionArrival.class.getName()).log(Level.SEVERE, null, ex);
                }
                    TrafficStatFrame.CurPlate3.setText("");
                    }
                }
            
            if(TrafficLight.LightState == 1 )
                 {
                     Car nCar = new Car();
                     WestQueue.enqueue(nCar);
                     TrafficStatFrame.WestQueue.setValueAt(nCar.toString(), QCountW, 0);
                     QCountW++;
                     WaitTimeW Wwait = new WaitTimeW(QCountW - 1);
                     Thread WW = new Thread(Wwait);
                     WW.start();
                 }
                
        }
        
    }
        
    }
   
}
