package Gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class combobox {

	JFrame jframe;
    JLabel jlbl;
	JButton jbtn;
	JComboBox combobox;
	
	public combobox() {
		jframe = new JFrame();
		jframe.setSize(400,400);
		jframe.setLayout(null);
		
		String city[] = {"Mumbai", "Pune" , "Solapur" , "Sangli"};
		combobox = new JComboBox(city);
		combobox.setBounds(40,40,100,30);
		jframe.add(combobox);
		
		jbtn = new JButton("Click");
		jbtn.setBounds(145,245,100,20);
		jframe.add(jbtn);
		
		
		jlbl = new JLabel("");
		jlbl.setBounds(40,150,300,30);
		jframe.add(jlbl);
		
		jbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jlbl.setText("You selected the " + combobox.getItemAt(combobox.getSelectedIndex())+ " city");
				
				
			}
			
		});
		
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
				
		
	}
	
	public static void main(String[] args) {
		
         combobox cm = new combobox();
	}

}
