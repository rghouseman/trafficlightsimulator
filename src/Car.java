
import java.util.Random;


public class Car {
    String LPlate = "";
    int RouteNum;
    int waitTime;


public Car()
{
  String alphabet = "abcdefghijklmnopqrstuvwxyz";
  Random PlateGen = new Random();
  char [ ] lp = new char[3];
  for(int i = 0; i < 3; i++)
  {
      lp[i] = alphabet.charAt(PlateGen.nextInt(alphabet.length()));
      LPlate += lp[i];
  }
  LPlate += "-";
  for(int i = 0; i < 4; i++)
  {
      int Temp = PlateGen.nextInt(10);
      LPlate  += Integer.toString(Temp);
  }
  
  waitTime = 0;
}

public String getPlate()
{
    return LPlate;
}

public void setRoute(int rNum)
    {
    RouteNum = rNum;
    }

public int getRoute()
    {
    return RouteNum;
    }

public void setWait(int wTime)
    {
    waitTime = wTime;
    }
  
 public int getWait()
    {
    return waitTime;
    } 

public String toString()
    {
    return LPlate;
    }

}