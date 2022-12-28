package GUI;

import java.awt.event.*;
import javax.swing.*;

public class t4_login extends JFrame implements ActionListener{
	
	private JButton login = new JButton("Login");
	private JTextField t_account = new JTextField();
	private JTextField t_password = new JTextField();
	
	public static void main(String[] args) {
		t4_login t4 = new t4_login();
	}
	
	public t4_login() {
		this.setTitle("登入");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 480);
		this.setLayout(null);
		this.setVisible(true);
		
		t_account.setBounds(180, 80, 120, 30);
		t_password.setBounds(180, 200, 120, 30);
		login.setBounds(200, 300, 90, 30);
		
		add(t_account);
		add(t_password);
		add(login);
		
		login.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) {
			this.dispose();
			new t4_table();
		}
		
	}
}
