

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class t3_chef 
{
    static JFrame Desk ;
    public static void frame()
    {
        Desk = new JFrame("�p�v�t��");
        Desk.setSize(480, 480);
        Desk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Desk.setLayout(null);
        Desk.setVisible(true);

        JButton table1 = new JButton("Table1");
        table1.setBounds(40, 40, 120, 120);
        Desk.add(table1);
        JButton table2 = new JButton("Table2");
		table2.setBounds(240, 40, 120, 120);
        Desk.add(table2);
        JButton table3 = new JButton("Table3");
		table3.setBounds(40, 250, 120, 120);
        Desk.add(table3);
        JButton table4 = new JButton("Table4");
		table4.setBounds(240, 250, 120, 120);
        Desk.add(table4);
        JButton bk = new JButton("��^");
        bk.setBounds(20, 410, 80, 20);
        Desk.add(bk);

        table1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == table1)
                {
                    Desk.setVisible(false);
                    frame2();
                }

            }
        });

        table2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == table2)
                {
                    Desk.setVisible(false);
                    frame2();
                }

            }
        });

        table3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == table3)
                {
                    Desk.setVisible(false);
                    frame2();
                }

            }
        });

        table4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == table4)
                {
                    Desk.setVisible(false);
                    frame2();
                }

            }
        });

        bk.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == bk)
                {
                    Desk.dispose();
                    choseSys cs =new choseSys();
                    cs.setVisible(true);
                }
            }
        });
    }

    public  static void frame2() 
    {
        String food[] = {"QQ�����n�ܨ쫧�P�� ", "�j�״� ", "������ ", "���L��"};
        JFrame ready = new JFrame("�ǳƥX�");
        ready.setLayout(null);
        ready.setSize(480, 480);
        ready.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ready.setVisible(true);

        JTextArea output = new JTextArea();
        output.setBounds(100, 250, 270, 150);
        JTextArea input = new JTextArea();
        input.setBounds(100, 50, 270, 150);
        for(int i = 0; i < food.length; i++)
        {
            input.append(food[i]);
        }
        JButton send_out = new JButton("�e�X");
        send_out.setBounds(360, 410, 80, 20);

        JButton back = new JButton("��^");
        back.setBounds(20, 410, 80, 20);

        ready.add(output);
        ready.add(input);
        ready.add(send_out);
        ready.add(back);

        send_out.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == send_out)
                {
                    input.setText("");
                    for(int i = 0; i < food.length; i++)
                    {
                        output.append(food[i]);
                    }
                    send_out.setVisible(false);
                }
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ready.dispose();
                Desk.setVisible(true);
            }
        });
    }
    
}
