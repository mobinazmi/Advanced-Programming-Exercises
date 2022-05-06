import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main( String args[] ) {
        JFrame jFrame=new JFrame("view");
        GridLayout gridLayout=new GridLayout(2,2);
        jFrame.setLayout(gridLayout);
        jFrame.setLocation(0,0);
        jFrame.setSize(800,600);
        JButton create=new JButton("Create account");
        JButton logIn=new JButton("Log in");
        jFrame.add(create);
        jFrame.add(logIn);
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField txtName=new JTextField("Name",25);
                JTextField txtUsername=new JTextField("Username",25);
                JTextField txtPassword=new JTextField("Password",25);
                JTextField txtEmail=new JTextField("Email",25);
                JPanel jPanel=new JPanel();
                jPanel.add(txtName);
                jPanel.add(txtUsername);
                jPanel.add(txtPassword);
                jPanel.add(txtEmail);
                JButton next=new JButton("Done");
                jPanel.add(next);
                jFrame.add(jPanel);
                next.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int item=JOptionPane.showConfirmDialog(jFrame,"Are You Sure?","Done",JOptionPane.YES_NO_CANCEL_OPTION);
                        if (item==0){
                            try {
                                UserService.getInstance().save(new UserEntityBuilder().setName(txtName.getText()).setUsername(txtUsername.getText()).setPassword(txtPassword.getText()).setEmail(txtEmail.getText()));
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                            }
                    }
                });
            }
            });
        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField txtUsername=new JTextField(50);
                JTextField txtPassword=new JTextField(8);
                JPanel jPanel=new JPanel();
                jPanel.add(txtUsername);
                jPanel.add(txtPassword);
                JButton enter=new JButton("Log In");
                jPanel.add(enter);
                jFrame.add(jPanel);
                enter.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        UserService.getInstance().equals(new UserEntityBuilder().setUsername(txtUsername.getText()).setPassword(txtPassword.getText()));
                        System.out.println("Entered successfully.");
                    }
                });
            }
        });
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
