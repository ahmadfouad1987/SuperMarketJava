import javax.swing.*;

public class Welcome extends JFrame{
    private JPanel RootP1;
    private JLabel LableId;
    private JLabel LableEmail;
    private JLabel LablePhone;
    private JLabel LableAdrres;
    private JLabel WelcomLable;
    private JLabel LabelText;
    public Welcome(User a){
        add(RootP1);
        setTitle("SuperMarket");
        setSize(800,500);
        WelcomLable.setText("مرحبا بك في تطبيق الماركت");
        LableId.setText(String.valueOf("ID: "+a.id));
        LableEmail.setText("Email: "+a.email);
        LablePhone.setText("Phone: "+a.phone);
        LableAdrres.setText("Address: "+a.address);

    }
}
