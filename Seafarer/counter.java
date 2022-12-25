package software_enginner.SE_Order_System.Seafarer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

public class counter implements ActionListener
{
    static JFrame countFrame;
    static JButton seat;

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
        JFrame seating = new JFrame("座位表");
        seating.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seating.setExtendedState(JFrame.MAXIMIZED_BOTH);
        seating.setVisible(true);

        seating.setLayout(new BorderLayout());

        JLabel jta = new JLabel("1號桌");
        jta.setPreferredSize(new Dimension(410,20));
        jta.setOpaque(true);
        jta.setBackground(Color.PINK);
        JLabel jta1 = new JLabel("2號桌");
        jta1.setOpaque(true);
        jta1.setBackground(Color.PINK);
        JLabel jta2 = new JLabel("3號桌");
        jta2.setOpaque(true);
        jta2.setBackground(Color.PINK);
        jta2.setPreferredSize(new Dimension(410,20));
        JTextArea botton = new JTextArea("");
        botton.setPreferredSize(new Dimension(0, 300));
        JButton enter = new JButton("入座");
        JButton leave = new JButton("離座");

        JPanel p = new JPanel(new BorderLayout(100, 20));
        seating.add(p, BorderLayout.CENTER);
        p.add(jta, BorderLayout.LINE_START);
        p.add(jta1, BorderLayout.CENTER);
        p.add(jta2, BorderLayout.LINE_END);
        
        JPanel p1 = new JPanel();
        seating.add(p1, BorderLayout.PAGE_END);
        p1.add(botton, BorderLayout.CENTER);
        p1.add(enter,BorderLayout.PAGE_START);
        p1.add(leave,BorderLayout.PAGE_START);

    }

    public static void main(String[]args)
    {
        counter frame = new counter();
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

