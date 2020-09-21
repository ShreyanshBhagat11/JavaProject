import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Decryption extends JFrame {
    private JLabel l;
    private JTextField t1;
    private JButton back, decrypt;

    public Decryption() {
        setVisible(true);
        setLayout(null);
        setSize(850, 550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Enter Text Here");
        back = new JButton("BACK");
        back.setBounds(250, 450, 85, 50);
        l.setBounds(290, 25, 300, 80);
        l.setFont(l.getFont().deriveFont(35.0f));
        add(l);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
