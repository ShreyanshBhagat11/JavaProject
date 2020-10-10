import javax.swing.*;

public class Password extends JFrame {
    private JLabel l;
    private int len;
    private JTextField t1;
    private JButton back,generate;
    private String pass = "";
    public Password()
    {
        setVisible(true);
        setLayout(null);
        setTitle("Password Generation");
//        setLocationRelativeTo(null);
        setSize(1080,720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PassMethod();
    }
    public void PassMethod()
    {
        l = new JLabel("Password Generation");
        t1 = new JTextField("To generate password click on Generate Password");
        generate = new JButton("Generate Password");
        back = new JButton("BACK");
        l.setBounds(350,20,430,40);
        t1.setBounds(40,140,980,80);
        back.setBounds(350,580,100,50);
        generate.setBounds(520,580,150,50);
        t1.setFont (t1.getFont().deriveFont (30.0f));
        l.setFont (l.getFont().deriveFont (40.0f));
//        t1.setLineWrap(true);
//        t1.setWrapStyleWord(true);
        add(l);
        add(back);
        add(generate);
        add(t1);

        generate.addActionListener( e ->
        {
            String response = JOptionPane.showInputDialog(null,"Enter how much length password do you want ? ", "Password Generator", 3);
            len = Integer.parseInt(response);
            while(true)
                if(len<=3 || len>=20) {
                    JOptionPane.showMessageDialog(null, "Your password length should be greater than 3 and less than 20");
                    response = JOptionPane.showInputDialog(null,"Enter how much length password do you want ? ", "Password Generator", 3);
                    len = Integer.parseInt(response);
                }
                else
                    break;
            pass = new Pass_Generator().PassGenerate(len);
            t1.setText("Your Password is : "+pass.toString());
            add(t1);
        });
        back.addActionListener( e ->
        {
            new SecreteCodeGenerator().createUIComponents();
            dispose();
        });

    }

}
