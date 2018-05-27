import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;
public class mouse extends JFrame{
    private JLabel pos;
    private double posx;
    private double posy;
    public  mouse () {
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                posx = MouseInfo.getPointerInfo().getLocation().getX();
                posy = MouseInfo.getPointerInfo().getLocation().getY();
                System.out.println("you clicked posX:"+posx+" posY:"+posy);
            }

            public void keyReleased(KeyEvent e) {

            }
        });
        pack();
    }
    public static void main (String args[]){
        new mouse().setVisible(true);
    }
}

