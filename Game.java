import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Game extends JFrame
{
    public static GPanel mainPanel;
    public static int x;
    public static int y;
    public static char richtung;

    public Game()
    {
        super();
        x=0;
        y=0;
        richtung='t';
        setSize(500,500);
        this.initiate();
        setVisible(true);
    }

    private void initiate(){
        mainPanel = new GPanel();
        this.getContentPane().add(mainPanel);
        this.addKeyListener(new KeyManager());
        Thread thread = new GameLoop();
        thread.start();
    }
}
