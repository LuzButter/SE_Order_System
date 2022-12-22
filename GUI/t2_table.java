package GUI;

import java.awt.event.*;
import javax.swing.*;

public class t2_table extends JFrame implements ActionListener{
	public int x;
	public t2_table t2 = this;
	private JButton table1 = new JButton("Table 1");
	private JButton table2 = new JButton("Table 2");
	private JButton table3 = new JButton("Table 3");
	private JButton table4 = new JButton("Table 4");
	
	public static void main(String[] args) {
		t2_table t2 = new t2_table();
	}
	
	public t2_table() {
		
		this.setTitle("服務生點餐");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 480);
		this.setLayout(null);
		this.setVisible(true);
		
		table1.setBounds(40, 40, 120, 120);
		table2.setBounds(240, 40, 120, 120);
		table3.setBounds(40, 250, 120, 120);
		table4.setBounds(240, 250, 120, 120);
		
		
		add(table1);
		add(table2);
		add(table3);
		add(table4);
		
		
		table1.addActionListener(this);
		table2.addActionListener(this);
		table3.addActionListener(this);
		table4.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==table1) {
			x=1;
			this.dispose();
			new order(t2);
		}
		else if(e.getSource()==table2) {
			x=2;
			this.dispose();
			new order(t2);
		}
		else if(e.getSource()==table3) {
			x=3;
			this.dispose();
			new order(t2);
		}
		else if(e.getSource()==table4) {
			x=4;
			this.dispose();
			new order(t2);
		}
		
	}
}
