package GUI;

import javax.swing.*;

import software_enginner.t1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class t1_login {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("�d�x�n�J");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        pack();

        JLabel userlable = new JLabel("�ϥΪ�:");
        panel.add(userlable);

        JTextField usertext = new JTextField(20);
        panel.add(usertext);

        JLabel passlable = new JLabel("�K�X:");
        panel.add(passlable);

        JPasswordField password = new JPasswordField(20);
        panel.add(password);

        JButton button = new JButton("�n�J");
        panel.add(button);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == button)
                {
                    frame.dispose();
                    t2_counter c  = new t2_counter();
                    c.frame();
                }
            }
        });

        frame.add(panel);

        frame.setVisible(true);

    }

    private static void pack() {
    }
}
