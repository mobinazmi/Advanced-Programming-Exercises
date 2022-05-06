import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("User");
        jFrame.setLocation(0,0);
        jFrame.setSize(800,900);
        GridLayout gridLayout=new GridLayout(2,2);
        JPanel jPanel=new JPanel(gridLayout);
        JTextField txtUsername=new JTextField(25);
        JTextField txtPassword=new JTextField(25);
        jPanel.add(txtUsername);
        jPanel.add(txtPassword);
        JButton btnOk=new JButton("ok");
        jPanel.add(btnOk);
        jFrame.add(jPanel);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame,"Are you sure?","check",JOptionPane.WARNING_MESSAGE);
            }
        });
        JFrame jFrame1=new JFrame("update");
        jFrame1.setLocation(0,0);
        jFrame1.setSize(400,800);
        jFrame1.setVisible(true);
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel1=new JPanel();
        jFrame1.add(jPanel1);
        JTextField txtName=new JTextField(25);
        JTextField txtEmail=new JTextField(25);
        jPanel1.add(txtName);
        jPanel1.add(txtEmail);
        JButton btnDone=new JButton("Done");
        jPanel1.add(btnDone);
        btnDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int item=JOptionPane.showConfirmDialog(jFrame,"Are you sure?","my message",JOptionPane.YES_NO_CANCEL_OPTION);
                if (item==0) {
                    try {
                        UserService.getInstance().edit(new UserEntityBuilder().setUsername(txtUsername.getText()).setPassword(txtPassword.getText()).setName(txtName.getText()).setEmail(txtEmail.getText()));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
