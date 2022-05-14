import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Thread1 implements Runnable{
    JFrame jFrame=new JFrame("get info");
    GridLayout gridLayout=new GridLayout(3,1);
    JPanel jPanel=new JPanel(gridLayout);
    Entity user=new Entity();
    public void UI() throws JsonProcessingException {

        jFrame.setLocation(0,0);
        jFrame.setSize(600,800);
        JTextField txtName=new JTextField(25);
        JTextField txtLast=new JTextField(25);
        JTextField txtEmail=new JTextField(25);
        jPanel.add(txtName);
        jPanel.add(txtLast);
        jPanel.add(txtEmail);
        user.setFirstName(txtName.getText());
        user.setLastName(txtLast.getText());
        user.setEmail(txtEmail.getText());
        user.toJson();
        JButton done=new JButton("Done");
        jPanel.add(done);
        jFrame.add(jPanel);

            done.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int item = JOptionPane.showConfirmDialog(jFrame, "Are you sure?", "Done", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (item == 1) {
                        MongoClient client = new MongoClient("localhost", 27017);
                        MongoDatabase database = client.getDatabase("myDb");
                        MongoCollection collection = database.getCollection("Users");
                        Document document = new Document()
                                .append("name", user.getFirstName())
                                .append("lastName", user.getLastName())
                                .append("email", user.getEmail());
                        collection.insertOne(document);
                    }
                }
            });

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void run() {
        try {
            UI();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
