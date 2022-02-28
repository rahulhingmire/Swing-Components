package Gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class check implements ActionListener  {
	
	JFrame jframe = new JFrame();
	JButton Jbtn = new JButton("Total");
	JLabel jlb = new JLabel("Billing System");
	JCheckBox jchk = new JCheckBox("Pizza Prize = 100");
	JCheckBox jchk2 = new JCheckBox("Burger Prize = 100");
	JCheckBox jchk3 = new JCheckBox("Tea Prize = 35");
	
	public check() {
		
		
		Jbtn.setBounds(250,300,100,30);
		jframe.add(Jbtn);
		Jbtn.addActionListener(this);
		
		jchk.setBounds(40,60,300,30);
		jchk2.setBounds(40,80,300,30);
		jchk3.setBounds(40,100,300,30);
		
		jframe.add(jchk);
		jframe.add(jchk2);
		jframe.add(jchk3);
		
		jframe.setSize(400,400);
		jframe.setLayout(null);
		
		jlb.setBounds(40,40,300,30);
		jframe.add(jlb);
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
		     float total = 0;
		     String msg = "";
		     if(jchk.isSelected()) {
		    	 total += 100;
		    	 msg += "Pizza 100/-\n";
		     }
		     if(jchk2.isSelected()) {
		    	 total += 100;
		    	 msg += "Burger 100/-\n";
		     }
		     if(jchk3.isSelected()) {
		    	 total += 35;
		    	 msg += "tea 35/-\n";
		     }
		     
		     msg += "_______________\n";
		     JOptionPane.showMessageDialog(jframe,msg + "Total " + total  );
		     
			
		}
		
	
	
	

	public static void main(String[] args) {
		
		check Ch = new check(); 
		

	}

}
