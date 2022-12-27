package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class t1_counter implements ActionListener
{
    static JFrame countFrame;
    static JButton seat;
    static JFrame seating;

    public  void frame()
    {
        countFrame = new JFrame("counter");
        countFrame.setSize(300, 200);
        countFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        panel.setLayout(new FlowLayout());

        pack();

        seat = new JButton("座位表");
        seat.addActionListener(this);
        panel.add(seat);

        countFrame.add(panel);
        countFrame.setVisible(true);
    }
    private static void pack()
    {

    }

    public static void frame2()
    {
        seating = new JFrame("座位表");
        seating.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        seating.setExtendedState(JFrame.MAXIMIZED_BOTH);
        seating.setVisible(true);

        seating.setLayout(new FlowLayout());

        pack();

        JCheckBox T1 = new JCheckBox("Table 1");
        seating.add(T1);
        JCheckBox T2 = new JCheckBox("Table 2");
        seating.add(T2); 
        JCheckBox T3 = new JCheckBox("Table 3");
        seating.add(T3); 
        JCheckBox T4 = new JCheckBox("Table 4");
        seating.add(T4); 
        JButton enter = new JButton("入座");
        enter.setBounds(0, 0, 40, 40);
        seating.add(enter);
        JButton leave = new JButton("離座");
        leave.setBounds(0, 10, 40, 40);
        seating.add(leave);
        JButton back = new JButton("返回");
        seating.add(back);

        enter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                if (e.getSource() == enter)
                {
                    if (T1.isSelected())
                    {
                        T1.setVisible(false);
                    }

                    if (T2.isSelected())
                    {
                        T2.setVisible(false);
                    }

                    if (T3.isSelected())
                    {
                        T3.setVisible(false);
                    }

                    if (T4.isSelected())
                    {
                        T4.setVisible(false);
                    }

                    seating.setVisible(false);
                    t2_login t2 = new t2_login();
                    t2.main(null);
                }
            }
        });

        leave.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == leave)
                {
                    if (T1.isVisible() == false)
                    {
                        T1.setVisible(true);
                        T1.setSelected(false);
                    }

                    if (T2.isVisible() == false)
                    {
                        T2.setVisible(true);
                        T2.setSelected(false);
                    }

                    if (T3.isVisible() == false)
                    {
                        T3.setVisible(true);
                        T3.setSelected(false);
                    }

                    if (T4.isVisible() == false)
                    {
                        T4.setVisible(true);
                        T4.setSelected(false);
                    }
                }
            }
        });

        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == back)
                {
                    seating.dispose();
                    choseSys cs = new choseSys();
                    cs.setVisible(true);
                }
            }
        });

    }

    public static void main(String[]args)
    {
        t1_counter frame = new t1_counter();
        frame.frame();
    }
    public void actionPerformed(ActionEvent e) 
    {
        
        if(e.getSource() == seat)
        {
            countFrame.dispose();
            frame2();
        }
    }
}