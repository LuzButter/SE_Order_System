package GUI;

import java.awt.event.*;
import javax.swing.*;

public class order extends JFrame implements ActionListener{
	
	private t2_table t2;
	
	String[] cui1tochose = {"玉米濃湯", "牛肉湯", "味噌湯"};
	String[] cui2tochose = {"麵包片", "水果沙拉", "蔬菜沙拉"};
	String[] cui3tochose = {"雞排", "牛排", "雙拼"};
	String[] cui4tochose = {"冰淇淋", "提拉米蘇", "布丁"};
	
	public String cuis="";
	private JTextField cui1 = new JTextField("湯");
	private JTextField cui2 = new JTextField("開胃菜");
	private JTextField cui3 = new JTextField("主餐");
	private JTextField cui4 = new JTextField("甜點");
	private JButton cui1_done = new JButton("確認");
	private JButton cui2_done = new JButton("確認");
	private JButton cui3_done = new JButton("確認");
	private JButton cui4_done = new JButton("確認");
	private JButton done = new JButton("done");
	private JButton save = new JButton("save");
	
	private JTextField table = new JTextField();
	//private JPanel panel = new JPanel();
	private JTextArea orders = new JTextArea();
	
	public JComboBox<String> jComboBox1 = new JComboBox<>(cui1tochose);
	public JComboBox<String> jComboBox2 = new JComboBox<>(cui2tochose);
	public JComboBox<String> jComboBox3 = new JComboBox<>(cui3tochose);
	public JComboBox<String> jComboBox4 = new JComboBox<>(cui4tochose);
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
		
		cui1.setBounds(30, 80, 120, 30);
		//JComboBox<String> jComboBox1 = new JComboBox<>(cui1tochose);
		jComboBox1.setBounds(200, 80, 120, 30);
		cui1_done.setBounds(350, 80, 90, 30);
		
		cui2.setBounds(30, 120, 120, 30);
		//JComboBox<String> jComboBox2 = new JComboBox<>(cui2tochose);
		jComboBox2.setBounds(200, 120, 120, 30);
		cui2_done.setBounds(350, 120, 90, 30);
		
		cui3.setBounds(30, 160, 120, 30);
		//JComboBox<String> jComboBox3 = new JComboBox<>(cui3tochose);
		jComboBox3.setBounds(200, 160, 120, 30);
		cui3_done.setBounds(350, 160, 90, 30);
		
		cui4.setBounds(30, 200, 120, 30);
		//JComboBox<String> jComboBox4 = new JComboBox<>(cui4tochose);
		jComboBox4.setBounds(200, 200, 120, 30);
		cui4_done.setBounds(350, 200, 90, 30);
		
		orders.setBounds(100, 250, 270, 100);
		done.setBounds(180, 400, 90, 30);
		save.setBounds(360, 400, 90, 30);
		
		
		add(cui1);
		add(cui2);
		add(cui3);
		add(cui4);
		add(done);
		add(save);
		add(orders);
		add(table);
		
		add(cui1_done);
		add(cui2_done);
		add(cui3_done);
		add(cui4_done);
		
		add(jComboBox1);
		add(jComboBox2);
		add(jComboBox3);
		add(jComboBox4);
		
		cui1_done.addActionListener(this);
		cui2_done.addActionListener(this);
		cui3_done.addActionListener(this);
		cui4_done.addActionListener(this);
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
		if(e.getSource()==cui1_done) {
			cuis = cuis + jComboBox1.getItemAt(jComboBox1.getSelectedIndex())+", ";
			orders.setText(cuis);
		}
		else if(e.getSource()==cui2_done) {
			cuis = cuis + jComboBox2.getItemAt(jComboBox2.getSelectedIndex())+", ";
			orders.setText(cuis);
		}
		else if(e.getSource()==cui3_done) {
			cuis = cuis + jComboBox3.getItemAt(jComboBox3.getSelectedIndex())+", ";
			orders.setText(cuis);
		}
		else if(e.getSource()==cui4_done) {
			cuis = cuis + jComboBox4.getItemAt(jComboBox4.getSelectedIndex())+", ";
			orders.setText(cuis);
		}
		else if(e.getSource()==done) {
			orders.setText(cuis);
			//panel.add(new JScrollPane(orders));
			
		}
		else if(e.getSource() == save)
		{
			t2.setVisible(true);
		}
	}
}

