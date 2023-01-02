
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class choseSys extends JFrame implements ActionListener{
	
	private JButton t1 = new JButton("領檯人員");
	private JButton t2 = new JButton("服務生");
	private JButton t3 = new JButton("廚師");
	private JButton t4 = new JButton("雜工");
	private JButton t5 = new JButton("經理");
	
	public static void main(String[] args) {
		choseSys choseSys = new choseSys();
	}
	
	public choseSys() {
		setLayout(new GridLayout(5, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 480);
		//this.setLocation(300, 400);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton s = (JButton) e.getSource();
		if(s==t1) {
			
			this.setVisible(false);
			t1_login t1 = new t1_login();
			t1.main(null);
		}
		else if(s==t2)	{
			
			this.setVisible(false);
			new t2_login();
		}
		else if(s==t3)	{
			
			this.setVisible(false);
			t3_login t3 = new t3_login();
			t3.main(null);
		}
		else if(s==t4)	{
			
			this.setVisible(false);
			new t4_login();
		}
		else if(s==t5)	{
			
			this.setVisible(false);
			//new t5_login();
		}
	}

}
