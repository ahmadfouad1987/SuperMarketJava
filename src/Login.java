import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel RootPanel;
    private JTextField textField1;
    private JButton Loginid;
    private JPasswordField passwordField1;
    private JButton registerButton;
    JFrame frame;
    public Login(){
        add(RootPanel);
        setTitle("SuperMarket");
        setSize(400,200);


        Loginid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String a=textField1.getText();
                //JOptionPane.showMessageDialog(frame, "T");
                //Welcome welcome=new Welcome(a);
               // welcome.setVisible(true);
                //Login.super.dispose();

            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register register=new Register();
                register.setVisible(true);
                Login.super.dispose();
            }
        });
    }
}
