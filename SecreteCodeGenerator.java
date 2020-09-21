import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecreteCodeGenerator extends JFrame {
    private JLabel l1,l2,l3;
    private  JRadioButton r1,r2,r3;
    private  JButton b;
    ButtonGroup bg = new ButtonGroup();
    public SecreteCodeGenerator(String s)
    {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(850,550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createUIComponents()
    {

         l1 = new JLabel("Encrypt Text");
         r1 = new JRadioButton();
         l2 = new JLabel("Decrypt Text");
         r2 = new JRadioButton();
         l3 = new JLabel("Generate random password");
         b = new JButton("OK");
         r3 = new JRadioButton();

//        r1.setIcon((ImageIcon)UIManager.getDefaults().get("radio.Icon"));

         l1.setBounds(110,40,300,80);
         r1.setBounds(600,60,100,50);
         l2.setBounds(110,140,300,80);
         r2.setBounds(600,167,40,30);
         l3.setBounds(20,240,700,80);
         r3.setBounds(600,267,40,30);
         b.setBounds(350,400,85,50);
        l1.setFont (l1.getFont().deriveFont (35.0f));
        l2.setFont (l2.getFont().deriveFont (35.0f));
        l3.setFont (l3.getFont().deriveFont (35.0f));
         add(l1);
         add(r1);
         add(l2);
         add(r2);
         add(l3);
         add(r3);
         add(b);
         bg.add(r1);
         bg.add(r2);
         bg.add(r3);

         b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                if(r1.isSelected())
                {
                    // Encryption Page
                    Encryption encrpt = new Encryption();
                    dispose();

                }
                else if(r2.isSelected())
                {
                    // Decryption Page
                }
                else if(r3.isSelected())
                {
                    // Generate random password
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"You have not selected any RadioButton");
                }
             }
         });

    }
    public static void main(String[] args) {
        SecreteCodeGenerator scg = new SecreteCodeGenerator(" Secret Code Generator ");
        scg.createUIComponents();



    }
}
