import javax.swing.*;
import java.awt.event.*;

public class KeyManager implements KeyListener
{
    public KeyManager()
    {
    }

    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        if(key == 'w'){
            Game.richtung = key;
        }else if(key == 's'){
            Game.richtung = key;
        }else if(key == 'a'){
            Game.richtung = key;
        }else if(key == 'd'){
            Game.richtung = key;
        }
    }

    public void keyReleased(KeyEvent e) {
        char key = e.getKeyChar();
        if(key == Game.richtung){
            Game.richtung = 't';
        }
    }

    public void keyTyped(KeyEvent e) {

    }
}
