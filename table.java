package Gui1;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class table {
	
	JFrame jframe;
	public table() {
		
		jframe = new JFrame();
		jframe.setSize(400,400);
		
		String data[][] = {{"1","ROHIT","KAVITAKE"},
				{"2","PAVAN","KAKDE"},
				{"3","ONKAR","BIRAJDAR"},
				{"4","RAHUL","hINGMIRE"}		
		};
		
		String Colomn[] = {"Id","Name","Surname"};
		
		JTable jtable = new JTable(data,Colomn);
		jtable.setCellSelectionEnabled(true);
		ListSelectionModel selectionModel = jtable.getSelectionModel();
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		selectionModel.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				String data = null;
				int[] row = jtable.getSelectedRows();
				int[] colomn = jtable.getSelectedColumns();
				
				for(int i=0;i<row.length;i++) {
					for(int j=0;j<colomn.length;j++) {
						data = (String) jtable.getValueAt(row[i], colomn[j]);
					}
				}
				System.out.println("You Selected this data "+ data);
			}
			
		});
		
		JScrollPane jscrollpane = new JScrollPane(jtable);
		jframe.add(jscrollpane);
		
		jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);				
				
		
	}
	public static void main(String[] args) {
		
        table tabel = new table();
	}

}
