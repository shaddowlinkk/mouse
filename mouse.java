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

		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				posx = MouseInfo.getPointerInfo().getLocation().getX();
                                posy = MouseInfo.getPointerInfo().getLocation().getY();
				System.out.println("you clicked posX:"+posx+" posY:"+posy);
			}
		});

	}
	public static void main (String args[]){
	new mouse().setVisible(true);
	}
}

