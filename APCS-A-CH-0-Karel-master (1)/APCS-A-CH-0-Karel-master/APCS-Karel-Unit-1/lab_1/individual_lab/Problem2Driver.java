package lab_1.individual_lab;

package lab_1.individual_lab/_1.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 billy = new Problem2(3,5,North,0);
        
        billy.turnOff();
    } 
    public void loop1() {
      move();
      pickBeeper();
      turnLeft();
      turnLeft();
      move();
      
      
      
        
        
      
  

    static {
        World.reset(); 
        World.readWorld("worlds/lab-1-p2.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(3);  
        World.setVisible(true);
    }
}