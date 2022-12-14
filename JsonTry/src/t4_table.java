

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class t4_table extends JFrame implements ActionListener{
	public int x;
	public t4_table t4 = this;
	private JTextField table1_state = new JTextField();
	private JTextField table2_state = new JTextField();
	private JTextField table3_state = new JTextField();
	private JTextField table4_state = new JTextField();
	
	private JButton table1 = new JButton("clean Table 1");
	private JButton table2 = new JButton("clean Table 2");
	private JButton table3 = new JButton("clean Table 3");
	private JButton table4 = new JButton("clean Table 4");
	private JButton finish = new JButton("finish");
	private JButton back = new JButton("返回");
	
	
	public static void main(String[] args) {
		t4_table t4 = new t4_table();
	}
	
	public t4_table() {
		
		this.setTitle("雜工查看桌子狀態");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 480);
		this.setLayout(null);
		this.setVisible(true);
		
		table1.setBounds(40, 40, 120, 120);
		table1_state.setBounds(40, 180, 120, 30);
		table2.setBounds(240, 40, 120, 120);
		table2_state.setBounds(240, 180, 120, 30);
		table3.setBounds(40, 250, 120, 120);
		table3_state.setBounds(40, 390, 120, 30);
		table4.setBounds(240, 250, 120, 120);
		table4_state.setBounds(240, 390, 120, 30);
		finish.setBounds(360, 400, 90, 30);
		back.setBounds(360, 350, 90, 30);
		
		add(table1);
		add(table1_state);
		add(table2);
		add(table2_state);
		add(table3);
		add(table3_state);
		add(table4);
		add(table4_state);
		add(finish);
		add(back);
		
		table1.addActionListener(this);
		table2.addActionListener(this);
		table3.addActionListener(this);
		table4.addActionListener(this);
		finish.addActionListener(this);
		back.addActionListener(this);
		
		table1_state.setText(ReadJSONFile.readState("Table1"));
		table2_state.setText(ReadJSONFile.readState("Table2"));
		table3_state.setText(ReadJSONFile.readState("Table3"));
		table4_state.setText(ReadJSONFile.readState("Table4"));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==table1) {
			table1.setForeground(Color.GREEN);
			UpdateJSONFile.SwitchState("Table1", "Empty");
			table1_state.setText(ReadJSONFile.readState("Table1"));
		}
		else if(e.getSource()==table2) {
			table2.setForeground(Color.GREEN);
			UpdateJSONFile.SwitchState("Table2", "Empty");
			table2_state.setText(ReadJSONFile.readState("Table2"));
		}
		else if(e.getSource()==table3) {
			table3.setForeground(Color.GREEN);
			UpdateJSONFile.SwitchState("Table3", "Empty");
			table3_state.setText(ReadJSONFile.readState("Table3"));
		}
		else if(e.getSource()==table4) {
			table4.setForeground(Color.GREEN);
			UpdateJSONFile.SwitchState("Table4", "Empty");
			table4_state.setText(ReadJSONFile.readState("Table4"));
		}
		else if(e.getSource() == finish) {
			//t1_counter t1 = new t1_counter();
			//t1.seating.setVisible(true);
			table1.setForeground(Color.BLACK);
			table2.setForeground(Color.BLACK);
			table3.setForeground(Color.BLACK);
			table4.setForeground(Color.BLACK);
		}
		else if(e.getSource() == back) {
			new choseSys();
		}
	}
}
