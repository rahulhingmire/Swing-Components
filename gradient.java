package Gui1;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class gradient {

	
	public gradient() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		
		
		frame.getContentPane().add(new paintgradient());
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		gradient g = new gradient();
	
	}



public class paintgradient extends JComponent{

public void paintgradient(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.ORANGE);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 150,150);
		
		
	}
}
}
