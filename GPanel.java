import javax.swing.*;
import java.awt.*;
import java.util.Random;

class GPanel extends JPanel {
    public GPanel() {
        super();
    }

    public void paintComponent(Graphics g){
        g.clearRect(0, 0, 500, 500);
        g.drawRect(Game.x,  Game.y, 100, 100);
    }
}