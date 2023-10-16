import javax.swing.*;
public class GameLoop extends Thread
{
    public GameLoop()
    {
    }
    
    public void run() {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis()+5;

        while (true){
            start = System.currentTimeMillis();
            int diff = (int)(end-start);
            if(SpielFenster.richtung=='w'){
                SpielFenster.y-=1;
            }else if(SpielFenster.richtung=='a'){
                SpielFenster.x-=1;
            }else if(SpielFenster.richtung=='s'){
                SpielFenster.y+=1;
            }else if(SpielFenster.richtung=='d'){
                SpielFenster.x+=1;
            }
            try{
                Thread.sleep(5);
            }catch (Exception e){
            }
            SpielFenster.mainPanel.repaint();
            end = System.currentTimeMillis();
        }
  }
}
