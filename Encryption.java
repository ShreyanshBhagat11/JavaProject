import javax.swing.*;
public class Encryption extends JFrame
{
    String encryptStr,decryptStr;
    private JLabel l;
    private JTextArea t1,t2;
    private JButton back,encrypt,decrypt;
    private JRadioButton r1,r2,r3;
    ButtonGroup bg = new ButtonGroup();
    public Encryption() {
        setVisible(true);
        setLayout(null);
        setTitle("Encryption & Decryption");
//        setLocationRelativeTo(null);
        setSize(1080, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Enter Text Here");
        t1 = new JTextArea("Select any method to encrypt the text and use same method to decrypt it !!");
        t2 = new JTextArea();

        r1 = new JRadioButton("Simple Cipher");
        r2 = new JRadioButton("Block Cipher");
        r3 = new JRadioButton("Sample Cipher");
        back = new JButton("BACK");
        encrypt = new JButton("ENCRYPT");
        decrypt = new JButton("DECRYPT");


        l.setBounds(350,20,350,40);
        t1.setBounds(40,140,980,158);
        t2.setBounds(40,328,980,158);
        r1.setBounds(40,90,300,40);
        r2.setBounds(380,90,300,40);
        r3.setBounds(720,90,300,40);
        back.setBounds(300,580,110,50);
        encrypt.setBounds(470,580,110,50);
        decrypt.setBounds(640,580,110,50);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.setFont(r1.getFont().deriveFont(35.0f));
        r2.setFont(r2.getFont().deriveFont(35.0f));
        r3.setFont(r3.getFont().deriveFont(35.0f));
        l.setFont (l.getFont().deriveFont (45.0f));
        t1.setFont (t1.getFont().deriveFont (30.0f));
        t2.setFont (t2.getFont().deriveFont (30.0f));
        t1.setLineWrap(true);        // Word Wrapping
        t2.setLineWrap(true);        // Word Wrapping
        t1.setWrapStyleWord(true);   // Word Wrapping
        t2.setWrapStyleWord(true);   // Word Wrapping
        add(l);
        add(back);
        add(t1);
        add(t2);
        add(encrypt);
        add(decrypt);
        add(r1);
        add(r2);
        add(r3);

        back.addActionListener( e ->
        {
            SecreteCodeGenerator s = new SecreteCodeGenerator();
            s.createUIComponents();
            dispose();
        });
        encrypt.addActionListener(e ->
        {
                if(r1.isSelected())
                {
                    // Encryption Code for Simple Cipher
                    String k = JOptionPane.showInputDialog(null,"Enter your key for encryption ", "Encryption Key", 3);
                    int key = Integer.parseInt(k);
                    String enStr = new Simple_Cipher().Simple(t1.getText(),key);
                    while(true)
                        if(key<=-10 || key>=30) {
                            JOptionPane.showMessageDialog(null, "Your key should be between -10 to 30 ");
                            k = JOptionPane.showInputDialog(null,"Enter your key for encryption ", "Encryption Key", 3);
                            key = Integer.parseInt(k);
                        }
                        else
                            break;
                    t2.setText(enStr);
                    add(t2);
                }
                else if(r2.isSelected())
                {
                    // Encryption Code for Block Cipher
                    encryptStr = new BlockCipher_Encrypt().blkEncrypt(t1.getText());
                    add(t2);
                    t2.setText(encryptStr);
                }
                else if(r3.isSelected())
                {
                    // Encryption Code for Sample Cipher
                }
                else
                    JOptionPane.showMessageDialog(null,"You have not selected any method  for encryption !");
        });
        decrypt.addActionListener(e ->
        {
                if (r1.isSelected())
                {
                    // Decryption Code for Simple Cipher
                    String k = JOptionPane.showInputDialog(null,"Enter your key for decryption ", "Decryption Key", 3);
                    int key = Integer.parseInt(k);
                    String decStr = new Simple_Cipher().Cipher(t1.getText(),key);
                    while(true)
                        if(key<=-10 || key>=30) {
                            JOptionPane.showMessageDialog(null, "Your key should be between -10 to 30 ");
                            k = JOptionPane.showInputDialog(null,"Enter your key for decryption ", "Decryption Key", 3);
                            key = Integer.parseInt(k);
                        }
                        else
                            break;
                    t2.setText(decStr);
                    add(t2);
                }
                else if (r2.isSelected()) {
                    // Decryption Code for Block Cipher
                    decryptStr = new BlockCipher_Decrypt().blkDecrypt(t1.getText());
                    add(t2);
                    t2.setText(decryptStr);
                }
                else if (r3.isSelected()) {
                    // Decryption Code for Sample Cipher
                }
                else
                    JOptionPane.showMessageDialog(null, "You have not selected any method  for decryption !");
        });
    }
}
