package Gui1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class layer {
	
	
	JFrame frame;
	JLayeredPane layer;
	JLabel lbl1,lbl2,lbl3;
	
	
	public layer() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(new Dimension(500,500));
		
		layer = new JLayeredPane();
		layer.setBounds(0,0,500,500);
		
	    lbl1 = new JLabel();
		lbl1.setBounds(50,50,200,200);
		lbl1.setOpaque(true);
		lbl1.setBackground(Color.BLACK);
		
	    lbl2 = new JLabel();
		lbl2.setBounds(100,100,200,200);
		lbl2.setOpaque(true);
		lbl2.setBackground(Color.red);
		
	    lbl3 = new JLabel();
		lbl3.setBounds(150,150,200,200);
		lbl3.setOpaque(true);
		lbl3.setBackground(Color.yellow);

		layer.add(lbl1);
		layer.add(lbl2);
		layer.add(lbl3);
		
		//layer on top of each other layer is mentioned......
//		layer.add(lbl1,Integer.valueOf(0));
//		layer.add(lbl2,Integer.valueOf(2));
//		layer.add(lbl3,Integer.valueOf(1));
		
		frame.add(layer);
		frame.setVisible(true);	
		
	}

	public static void main(String[] args) {
		
      layer lc = new layer();	}

}
