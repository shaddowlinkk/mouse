import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.awt.MouseInfo;
public class mouse extends JFrame{
    private JLabel pos = new JLabel("you clicked posX: 0.0 posY: 0.0");
    private double posx =0.0;
    private double posy =0.0;
    public  mouse () {
        setSize(150,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(pos);
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                posx = MouseInfo.getPointerInfo().getLocation().getX();
                posy = MouseInfo.getPointerInfo().getLocation().getY();
                pos.setText("you clicked posX: "+posx+" posY: "+posy);
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

