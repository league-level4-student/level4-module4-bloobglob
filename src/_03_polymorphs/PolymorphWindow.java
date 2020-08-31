package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 	new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
    	window = new JFrame("IT'S MORPHIN' TIME!");
   	 	window.add(this);
   	 	window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 	window.pack();
   	 	window.setVisible(true);
   	 	window.addMouseListener(this);
   	 
   	 
   	 	polymorphs.add(new BluePolymorph(50, 50));
   	 	polymorphs.add(new RedPolymorph(100, 100));
   	 	polymorphs.add(new CirclePolymorph(200, 150));
   	 	polymorphs.add(new MousePolymorph(0, 0));
   	 	polymorphs.add(new ButtonPolymorph(0, 0));
   	 
   	 	timer = new Timer(1000 / 30, this);
   	 	timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 	g.setColor(Color.LIGHT_GRAY);
   	 	g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 	for(int i = 0; i < polymorphs.size(); i++) {
   	 		polymorphs.get(i).draw(g);
   	 	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 	repaint();
   	 	for(int i = 0; i < polymorphs.size(); i++) {
   	 		polymorphs.get(i).update();
   	 	}
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX() > 0 && e.getX() < 50 && e.getY() > 0 && e.getY() < 50) {
			JOptionPane.showMessageDialog(null, "You pressed the orange button!");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
