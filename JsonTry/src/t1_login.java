
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class t1_login {
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("Login");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        pack();

        JLabel userlable = new JLabel("帳號:");
        panel.add(userlable);

        JTextField usertext = new JTextField(20);
        panel.add(usertext);

        JLabel passlable = new JLabel("密碼:");
        panel.add(passlable);

        JPasswordField password = new JPasswordField(20);
        panel.add(password);

        JButton button = new JButton("登入");
        panel.add(button);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == button)
                {
                    frame.dispose();
                    t1_counter c  = new t1_counter();
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
