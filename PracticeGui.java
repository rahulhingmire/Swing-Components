package Gui1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PracticeGui implements ActionListener  {
	
//	JFrame jframe;
//	JButton jbtn;

	JLabel jlabel = new JLabel();
	
	JFrame jframe = new JFrame();
	JTextArea jtxtar = new JTextArea();
	JButton Jbtn = new JButton("Count");
    public PracticeGui(){
    	//JFrame jframe = new JFrame();
    	jframe.setTitle("Text counter");
    	jframe.setLayout(null);
    	jframe.setSize(400,400);
    	
    	//JTextArea jtxtar = new JTextArea();
    	jtxtar.setBounds(40, 60, 300, 200);
    	jtxtar.setBackground(Color.cyan);
    	jtxtar.setForeground(Color.black);
    	jframe.add(jtxtar);
    	
    	
    	jlabel.setBounds(40,20,350,10);
    	jframe.add(jlabel);
    	
    	
    	//JButton Jbtn = new JButton("Count");
    	Jbtn.setBounds(150,280,150,40);
    	jframe.add(Jbtn);
    	Jbtn.addActionListener(this);
    	
    	
        jframe.setVisible(true);
    	jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);          
    
    	
    }
    

    
	


	public static void main(String[] args) {
    	
    	PracticeGui PracticeGui = new PracticeGui();

}

@Override
public void actionPerformed(ActionEvent e) {
	String text = jtxtar.getText();
	String word[]= text.split(" ");
	jlabel.setText("Total number of char is "+ text.length()+" total number of words " +word.length);
	
}
}
