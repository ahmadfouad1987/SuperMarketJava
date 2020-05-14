import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{
    private JTextField emailid;

    private JTextField phoneid;
    private JTextField addressid;
    private JPanel RegisterRoot;
    private JButton registerButton;
    private JPasswordField passwordField1;

    public Register(){
        add(RegisterRoot);
        setTitle("تسجيل مستخدم جديد");
        setSize(400,200);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user=new User();
                user.id=112;
                user.email=emailid.getText();
                user.pass=passwordField1.getText();
                user.phone=phoneid.getText();
                user.address=addressid.getText();
                Welcome welcome=new Welcome(user);
                welcome.setVisible(true);
                Register.super.dispose();

            }
        });
    }

}
