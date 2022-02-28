package Gui1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class brl {
	
	
	JFrame  jframe;
	JPanel jpanel1,jpanel2,jpanel3,jpanel4,jpanel5;

	
	public brl() {
		
		
		  jframe = new JFrame();
		  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  jframe.setSize(screenSize.width, screenSize.height);
		  jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		  jframe.setLayout(new BorderLayout(5,5));
		  
		  
		  jpanel1 = new JPanel();
		  jpanel2 = new JPanel();
		  jpanel3 = new JPanel();
		  jpanel4 = new JPanel();
		  jpanel5 = new JPanel();
		  
		  jpanel1.setBackground(Color.black);
		  jpanel2.setBackground(Color.blue);
		  jpanel3.setBackground(Color.red);
		  jpanel4.setBackground(Color.GRAY);
		  jpanel5.setBackground(Color.cyan);
		  
		  
		  jpanel1.setPreferredSize(new Dimension(100,100));
		  jpanel2.setPreferredSize(new Dimension(70,70));
		  jpanel3.setPreferredSize(new Dimension(100,100));
		  jpanel4.setPreferredSize(new Dimension(50,50));
		  jpanel5.setPreferredSize(new Dimension(100,100));
		  
		  jframe.add(jpanel1,BorderLayout.EAST);
		  jframe.add(jpanel2,BorderLayout.WEST);
		  jframe.add(jpanel3,BorderLayout.NORTH);
		  jframe.add(jpanel4,BorderLayout.CENTER);
		  jframe.add(jpanel5,BorderLayout.SOUTH);
		  
		  
		  jframe.setVisible(true);
		  
	}

	public static void main(String[] args) {
		
		brl br = new brl();
		

	}

}
