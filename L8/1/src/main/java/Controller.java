import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("Recruitment Form");
        GridLayout gridLayout=new GridLayout(2,2);
        jFrame.setLayout(gridLayout);
        jFrame.setLocation(0,0);
        jFrame.setSize(800,800);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField txtName=new JTextField("Name",25);
        JTextField txtEmail=new JTextField("Email",25);
        JTextField txtNumber=new JTextField("Number",25);
        JTextField txtAddress=new JTextField("address",25);
        JTextField txtPE=new JTextField("Pe",25);
        JTextField txtPP=new JTextField("Pp",25);
        JTextField txtEducation=new JTextField("education",25);
        JPanel jPanel=new JPanel();
        jPanel.add(txtName);
        jPanel.add(txtEmail);
        jPanel.add(txtAddress);
        jPanel.add(txtNumber);
        jPanel.add(txtPE);
        jPanel.add(txtPP);
        jPanel.add(txtEducation);
        JButton done=new JButton("Done");
        jPanel.add(done);
        jFrame.add(jPanel);


        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int item=JOptionPane.showConfirmDialog(jFrame,"Are You sure?","check!",JOptionPane.YES_NO_CANCEL_OPTION);
                if (item==0){
                    try {
                        EmployeeService.getInstance().save(new EmployeeEntityBuilder().setName(txtName.getText()).setEmail(txtEmail.getText()).setAddress(txtAddress.getText()).setNumber(txtNumber.getText()).setEducation(txtEducation.getText()).setPreviousEmployer(txtPE.getText()).setPreviousPosition(txtPP.getText()));
                        System.out.println("saved");
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });


    }
}
