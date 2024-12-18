package GUI.d1113;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MovingText extends JFrame {

	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("JAVA");
	
	
	public MovingText() {
		
		setTitle("방향키 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		
		la.setLocation(50, 50);
		la.setSize(100,20);
		c.add(la);
		
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
		;
		
		c.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {
				
				Component com = (Component) e.getSource();
				System.out.println(com);
				com.setFocusable(true);
				com.requestFocus();
				
				
			}
			
			
			
		});
		
		
		
		
		
		
	}
	
	
	
	
	
	
	class MyKeyListener extends KeyAdapter {
	
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
				
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
				
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY() );
			break;
			
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
			break;
			
			}
			
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new MovingText();
		
		
	}
	
	
	
	

}



