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

		JLabel pos = new JLabel("test-test-test-test");
		pos.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseMoved(MouseEvent arg0){
				posx = MouseInfo.getPointerInfo().getLocation().getX();
				posy = MouseInfo.getPointerInfo().getLocation().getY();
				System.out.println("posx X:"+posx+"pos Y:"+posy);
			}
			@Override
			public void mouseDragged(MouseEvent arg0){
			}
		});
		getContentPane().add(pos);
		pack();

	}
	public static void main (String args[]){
	new mouse().setVisible(true);
	}
}

