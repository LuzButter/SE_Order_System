package GUI;

import java.awt.event.*;
import javax.swing.*;

public class order extends JFrame implements ActionListener{
	
	private t2_table t2;
	
	public String cuis="";
	private JButton cui1 = new JButton("cuisine 1");
	private JButton cui2 = new JButton("cuisine 2");
	private JButton cui3 = new JButton("cuisine 3");
	private JButton cui4 = new JButton("cuisine 4");
	private JButton done = new JButton("done");
	
	private JTextField table = new JTextField();
	//private JPanel panel = new JPanel();
	private JTextArea orders = new JTextArea();
	
	/*public static void main(String[] args) {
		order order = new order();
	}*/
	
	public order(final t2_table t2) {
		this.t2 = t2;
		this.setTitle("Table 點餐");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 480);
		this.setLayout(null);
		this.setVisible(true);

		
		table.setBounds(100, 40, 270, 30);
		cui1.setBounds(180, 80, 120, 30);
		cui2.setBounds(180, 120, 120, 30);
		cui3.setBounds(180, 160, 120, 30);
		cui4.setBounds(180, 200, 120, 30);
		
		orders.setBounds(100, 250, 270, 100);
		done.setBounds(180, 400, 90, 30);
		
		//panel.setBounds(100, 250, 280, 110);
		
		add(cui1);
		add(cui2);
		add(cui3);
		add(cui4);
		add(done);
		add(orders);
		add(table);
		//add(panel);
		
		cui1.addActionListener(this);
		cui2.addActionListener(this);
		cui3.addActionListener(this);
		cui4.addActionListener(this);
		done.addActionListener(this);
		
		int s = t2.x;
		String stringvalue = new String("Table "+s);
		table.setText(stringvalue);
		
		orders.setLineWrap(true);        //激活自动换行功能 
		orders.setWrapStyleWord(true);            // 激活断行不断字功能
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cui1) {
			cuis += "cuisine 1, ";
		}
		else if(e.getSource()==cui2) {
			cuis += "cuisine 2, ";
		}
		else if(e.getSource()==cui3) {
			cuis += "cuisine 3, ";
		}
		else if(e.getSource()==cui4) {
			cuis += "cuisine 4, ";
		}
		else if(e.getSource()==done) {
			orders.setText(cuis);
			//panel.add(new JScrollPane(orders));
		}
	}
}

