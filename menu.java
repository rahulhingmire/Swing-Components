package Gui1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class menu implements ActionListener {
	
	JFrame jframe;
	JMenuBar menubar;
	JTextArea textarea;
	JMenu file,edit,format;
	JMenuItem save,exit,copy,paste,cut,zoom;
	
	public menu() {
		 jframe = new JFrame();
		 jframe.setSize(400,400);
		 
		 textarea =new JTextArea();
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 textarea.setSize(screenSize.width, screenSize.height);
		 jframe.add(textarea);
		 
		 file = new JMenu("File");
		 save = new JMenuItem("Save");
		 file.add(save);
		 
		 exit = new JMenuItem("Exit");
		 file.add(exit);
		 exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(jframe, "You want to exit");
				if(a == JOptionPane.YES_OPTION) {
					jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
				}
				
			}
			 
		 });
		 
		 edit = new JMenu("Edit");
		 cut = new JMenuItem("Cut");
		 copy = new JMenuItem("Copy");
		 paste = new JMenuItem("Paste");
		 
		 edit.add(cut);
		 edit.add(copy);
		 edit.add(paste);
		 
		 cut.addActionListener(this);
		 copy.addActionListener(this);
		 paste.addActionListener(this);
		 
		 
		 
		 format = new JMenu("Format");
		 zoom = new JMenuItem("Zoom");
		 format.add(zoom);		 
//		 zoom.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//			   textarea.zo
//				
//			}
//			 
//			 
//		 });
		 
		 menubar = new JMenuBar();
		 menubar.add(file);
		 menubar.add(edit);
		 menubar.add(format);
		 jframe.add(menubar);
		 jframe.setJMenuBar(menubar);
		 
		 jframe.setLayout(null);
		 jframe.setVisible(true);
		 jframe.setDefaultCloseOperation(jframe.DO_NOTHING_ON_CLOSE);
		 	  
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
       
		if(e.getSource() == cut) {
			textarea.cut();
		}
		if(e.getSource() == paste) {
			textarea.paste();
		}
		if(e.getSource() == copy) {
			textarea.copy();
		}
		
	}
	
	

	public static void main(String[] args)  {
		
		menu m = new menu();	

	}



	

}
