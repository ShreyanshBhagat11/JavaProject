import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecreteCodeGenerator extends JFrame {
    private JLabel l1,l3;
    private  JRadioButton r1,r3;
    private  JButton b;
    ButtonGroup bg = new ButtonGroup();

    public SecreteCodeGenerator()
    {
        setLayout(null);
        setVisible(true);
        setTitle("Secret Code Generator");
        setSize(1080,720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createUIComponents()
    {
        setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("cyber-security(PS).jpg"))));
        setLayout(null);

         l1 = new JLabel("Encrypt Text or Decrypt Text");
         l1.setForeground(new Color(255,255,255));
         r1 = new JRadioButton();
         r1.setOpaque(false);
//         l2 = new JLabel("Decrypt Text");
//         r2 = new JRadioButton();
         l3 = new JLabel("Generate random password");
        l3.setForeground(new Color(255,255,255));
         b = new JButton("OK");
         r3 = new JRadioButton();
        r3.setOpaque(false);

//        r1.setIcon((ImageIcon)UIManager.getDefaults().get("radio.Icon"));

         l1.setBounds(45,160,650,80);
         r1.setBounds(850,192,35,35);
//         l2.setBounds(110,140,300,80);
//         r2.setBounds(600,167,40,30);
         l3.setBounds(45,340,850,80);
         r3.setBounds(850,372,35,35);
         b.setBounds(500,560,100,50);
        l1.setFont (l1.getFont().deriveFont (45.0f));
//        l2.setFont (l2.getFont().deriveFont (45.0f));
        l3.setFont (l3.getFont().deriveFont (45.0f));

        l1.setVisible(true);
         add(l1);
         add(r1);
//         add(l2);
//         add(r2);
         add(l3);
         add(r3);
         add(b);
         bg.add(r1);
         bg.add(r3);

         b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                if(r1.isSelected())
                {
                    // Encryption & Decrypt Page
                    new Encryption().setLocationRelativeTo(null);
                    dispose();
                }
//                else if(r2.isSelected())
//                {
//                    // Decryption Page
//                }
                else if(r3.isSelected())
                {
                    // Generate random password
                    new Password().setLocationRelativeTo(null);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"You have not selected any RadioButton");
                }
             }
         });
        setSize(1079,719);
        setSize(1080,720);

    }
    public static void main(String[] args) {
        SecreteCodeGenerator scg = new SecreteCodeGenerator();
        scg.createUIComponents();
    }
}

