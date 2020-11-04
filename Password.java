import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {
    private JLabel l;
    private int len;
    private JTextArea t1;
    private JButton back, generate;
    private String pass = "";

    public Password() {
        setVisible(true);
        setLayout(null);
        setTitle("Password Generation");
//        setLocationRelativeTo(null);
        setSize(1080, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PassMethod();
    }

    public void PassMethod() {
        setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("cyber-security(PS).jpg"))));
        setLayout(null);
        l = new JLabel("Password Generation");
        l.setForeground(new Color(255, 255, 255, 255));
        t1 = new JTextArea("To generate password click on Generate Password");
        t1.setForeground(new Color(255, 255, 255, 255));
        t1.setOpaque(false);
        generate = new JButton("Generate Password");
        back = new JButton("BACK");
        l.setBounds(350, 20, 430, 40);
        t1.setBounds(40, 140, 980, 80);
        back.setBounds(350, 580, 100, 50);
        generate.setBounds(520, 580, 150, 50);
        t1.setFont(t1.getFont().deriveFont(30.0f));
        l.setFont(l.getFont().deriveFont(40.0f));
//        t1.setLineWrap(true);
//        t1.setWrapStyleWord(true);
        add(l);
        add(back);
        add(generate);
        add(t1);

        generate.addActionListener(e ->
        {
            int len = 0;
            String response;
            do {
                response = JOptionPane.showInputDialog(null, "Enter how much length password do you want ? ", "Password Generator", 3);
                try {
                    if (response == null)
                        break;
                    len = Integer.parseInt(response);
                    break;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Your key should be an Integer");
                }
            } while (true);
            while (true)
                if (len <= 3 || len >= 20) {
                    JOptionPane.showMessageDialog(null, "Your password length should be greater than 3 and less than 20");
                    response = JOptionPane.showInputDialog(null, "Enter how much length password do you want ? ", "Password Generator", 3);
                    len = Integer.parseInt(response);
                } else
                    break;
            pass = new Pass_Generator().PassGenerate(len);
            t1.setText("Your Password is : " + pass);
            add(t1);
        });
        back.addActionListener(e ->
        {
            new SecreteCodeGenerator().createUIComponents();
            dispose();
        });
        setSize(1079, 719);
        setSize(1080, 720);
    }
}
