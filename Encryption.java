import javax.swing.*;
import java.awt.*;

public class Encryption extends JFrame {
    String encryptStr, decryptStr, BaseEnc,BaseDec,enStr,decStr;
    private JLabel l;
    private JPanel panel;
    private JTextArea t1, t2;
    private JScrollPane sp1, sp2;
    private JButton back, encrypt, decrypt;
    private JRadioButton r1, r2, r3;
    ButtonGroup bg = new ButtonGroup();

    public Encryption() 
    {
        setVisible(true);
        setLayout(null);
        setTitle("Encryption & Decryption");
        setSize(1080, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("cyber-security(PS).jpg"))));
        setLayout(null);

        panel = new JPanel();
        l = new JLabel("Enter Text Here");
        l.setForeground(new Color(255, 255, 255));
        t1 = new JTextArea();
        t1.setText("Select any method to encrypt the text and use same method to decrypt it !!");
        t1.setCaretColor(Color.CYAN); // Cursor color change to cyan JTextArea 1
        
        t1.setForeground(new Color(255, 255, 255, 255));
        t1.setOpaque(false);
        t2 = new JTextArea();
        t2.setCaretColor(Color.CYAN); // Cursor color change to cyan for JTextArea 2
        t2.setForeground(new Color(255, 255, 255, 255));
        t2.setOpaque(false);

        r1 = new JRadioButton("Caesar Cipher");
        r1.setForeground(new Color(255, 255, 255));
        r1.setOpaque(false);
        r2 = new JRadioButton("Block Cipher");
        r2.setForeground(new Color(255, 255, 255));
        r2.setOpaque(false);
        r3 = new JRadioButton("Base-64 Cipher");
        r3.setForeground(new Color(255, 255, 255));
        r3.setOpaque(false);
        back = new JButton("BACK");
        encrypt = new JButton("ENCRYPT");
        decrypt = new JButton("DECRYPT");


        l.setBounds(350, 20, 350, 40);
        t1.setBounds(40, 160, 965, 160); // t1 setBounds
        sp1 = new JScrollPane(t1);  
        sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
        sp1.setBounds(40, 160, 980, 158); //scroll panel
        sp1.getViewport().setOpaque(false);
        sp1.setOpaque(false);
        sp1.setBorder(null);

        t2.setBounds(40, 388, 965, 158);
        sp2 = new JScrollPane(t2);  
        sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
        sp2.setBounds(40, 388, 980, 158); //scroll panel
        sp2.getViewport().setOpaque(false);
        sp2.setOpaque(false);
        sp2.setBorder(null);

        r1.setBounds(40, 90, 300, 40);
        r2.setBounds(380, 90, 300, 40);
        r3.setBounds(720, 90, 350, 40);
        back.setBounds(300, 580, 110, 50);
        encrypt.setBounds(470, 580, 110, 50);
        decrypt.setBounds(640, 580, 110, 50);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.setFont(r1.getFont().deriveFont(35.0f));
        r2.setFont(r2.getFont().deriveFont(35.0f));
        r3.setFont(r3.getFont().deriveFont(35.0f));
        l.setFont(l.getFont().deriveFont(45.0f));
        t1.setFont(t1.getFont().deriveFont(30.0f));
        t2.setFont(t2.getFont().deriveFont(30.0f));
        t1.setLineWrap(true);        // Word Wrapping
        t2.setLineWrap(true);        // Word Wrapping
        t1.setWrapStyleWord(true);   // Word Wrapping
        t2.setWrapStyleWord(true);   // Word Wrapping
        add(l);
        add(back);
        this.add(sp1);
        t1.setVisible(true);
        add(encrypt);
        add(decrypt);
        add(r1);
        add(r2);
        add(r3);

        back.addActionListener(e ->
        {
            SecreteCodeGenerator s = new SecreteCodeGenerator();
            s.createUIComponents();
            dispose();
        });
        encrypt.addActionListener(e ->
        {
            if (r1.isSelected())
            {
                // Encryption Code for Simple Cipher
                int key;
                String k;
                do {
                    k = JOptionPane.showInputDialog(null, "Enter your key for encryption ", "Encryption Key", 3);
                    try {
                        key = Integer.parseInt(k);
                        break;
                    }catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Your key should be an Integer");
                    }
                }while (true);
                enStr = new Caesar_Cipher().CaesarEncrpt(t1.getText(),key);
                while (true)
                    if (key <= -27 || key >= 27) {
                        JOptionPane.showMessageDialog(null, "Your key should be between -27 to 27 ");
                        k = JOptionPane.showInputDialog(null, "Enter your key for encryption ", "Encryption Key", 3);
                        key = Integer.parseInt(k);
                    } else
                        break;
                t2.setText(enStr);
                this.add(sp2);
            } else if (r2.isSelected()) {
                // Encryption Code for Block Cipher
                encryptStr = new BlockCipher_Encrypt().blkEncrypt(t1.getText());
                this.add(sp2);
                t2.setText(encryptStr);
            } else if (r3.isSelected()) {
                // Encryption Code for Base_64 Cipher
                BaseEnc = new Base_64().BaseEncrypt(t1.getText());
                this.add(sp2);
                t2.setText(BaseEnc);
            } else
                JOptionPane.showMessageDialog(null, "You have not selected any method  for encryption !");
        });
        decrypt.addActionListener(e ->
        {
            int key;
            String k;
            if (r1.isSelected()) {
                // Decryption Code for Simple Cipher
                do {
                    k = JOptionPane.showInputDialog(null, "Enter your key for decryption ", "Decryption Key", 3);
                    try {
                        key = Integer.parseInt(k);
                        break;
                    }catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "Your key should be an Integer");
                    }
                }while (true);
                decStr = new Caesar_Cipher().CaesarDecrypt(t1.getText(), key);
                while (true)
                    if (key <= -27 || key >= 27) {
                        JOptionPane.showMessageDialog(null, "Your key should be between -27 to 27 ");
                        k = JOptionPane.showInputDialog(null, "Enter your key for decryption ", "Decryption Key", 3);
                        key = Integer.parseInt(k);
                    } else
                        break;
                t2.setText(decStr);
                this.add(sp2);
            } else if (r2.isSelected()) {
                // Decryption Code for Block Cipher
                decryptStr = new BlockCipher_Decrypt().blkDecrypt(t1.getText());
                this.add(sp2);
                t2.setText(decryptStr);
            } else if (r3.isSelected()) {
                // Decryption Code for Base_64 Cipher
                BaseDec = new Base_64().BaseDecrypt(t1.getText());
                this.add(sp2);
                t2.setText(BaseDec);
            } else
                JOptionPane.showMessageDialog(null, "You have not selected any method  for decryption !");
        });
        setSize(1079, 719);
        setSize(1080, 720);
    }
}
