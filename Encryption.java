import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encryption extends JFrame
{
    private JLabel l;
    private JTextArea t1;
    private JButton back,encrypt,decrypt;
    public Encryption()
    {
        setVisible(true);
        setLayout(null);
        setSize(850,550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Enter Text Here");
        t1 = new JTextArea();

        back = new JButton("BACK");
        encrypt = new JButton("ENCRYPT");
        decrypt = new JButton("DECRYPT");

        back.setBounds(200,450,95,50);
        encrypt.setBounds(350,450,95,50);
        decrypt.setBounds(500,450,95,50);
        l.setBounds(290,25,300,40);
        t1.setBounds(30,130,770,158);

        l.setFont (l.getFont().deriveFont (35.0f));
        t1.setFont (t1.getFont().deriveFont (20.0f));
        t1.setLineWrap(true);        // Word Wrapping
        t1.setWrapStyleWord(true);
        add(l);
        add(back);
        add(t1);
        add(encrypt);
        add(decrypt);

        back.addActionListener( e ->
        {
            SecreteCodeGenerator s = new SecreteCodeGenerator(" Secret Code Generator ");
            s.createUIComponents();
            dispose();
        });
    }
}
