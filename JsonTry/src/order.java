

import java.awt.event.*;
import javax.swing.*;

public class order extends JFrame implements ActionListener{

	public int beef = 0;
	public int pork = 0;
	public int lamp = 0;
	public int chicken = 0;
	
	private t2_table t2;
	
	public String cuis="";
	private JButton cui1 = new JButton("Beef");
	private JButton cui2 = new JButton("Pork");
	private JButton cui3 = new JButton("Lamp");
	private JButton cui4 = new JButton("Chicken");
	private JButton done = new JButton("done");
	private JButton save = new JButton("save");
	
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
		save.setBounds(360, 400, 90, 30);
		
		//panel.setBounds(100, 250, 280, 110);
		
		add(cui1);
		add(cui2);
		add(cui3);
		add(cui4);
		add(done);
		add(save);
		add(orders);
		add(table);
		//add(panel);
		
		cui1.addActionListener(this);
		cui2.addActionListener(this);
		cui3.addActionListener(this);
		cui4.addActionListener(this);
		done.addActionListener(this);
		save.addActionListener(this);
		
		int s = t2.x;
		String stringvalue = new String("Table "+s);
		table.setText(stringvalue);
		
		orders.setLineWrap(true);        //激活自动换行功能 
		orders.setWrapStyleWord(true);            // 激活断行不断字功能
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cui1) {
			cuis += "Beef, ";
			beef++;
		}
		else if(e.getSource()==cui2) {
			cuis += "Pork, ";
			pork++;
		}
		else if(e.getSource()==cui3) {
			cuis += "Lamp, ";
			lamp++;
		}
		else if(e.getSource()==cui4) {
			cuis += "Chicken, ";
			chicken++;
		}
		else if(e.getSource()==save) {
			orders.setText(cuis);
			//panel.add(new JScrollPane(orders));
			
		}
		else if(e.getSource() == done)
		{
			t2.setVisible(true);
			for(; beef>0; beef--)
			{
				UpdateJSONFile.AddOrder("Table"+t2.x, "Beef");
			}
			for(; pork>0; pork--)
			{
				UpdateJSONFile.AddOrder("Table"+t2.x, "Pork");
			}
			for(; lamp>0; lamp--)
			{
				UpdateJSONFile.AddOrder("Table"+t2.x, "Lamp");
			}
			for(; chicken>0; chicken--)
			{
				UpdateJSONFile.AddOrder("Table"+t2.x, "Chicken");
			}
		}
	}
}

