import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class Thread2 extends Entity implements Runnable{
     private ObjectMapper objectMapper=new ObjectMapper();
    public String toJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(this);
    }
    public void show(){
        JFrame jFrame=new JFrame("showing info");
        jFrame.setLocation(0,0);
        jFrame.setSize(600,800);
        GridLayout gridLayout=new GridLayout(2,2);
        JPanel jPanel=new JPanel(gridLayout);
        MongoClient client=new MongoClient("localhost",27017);
        MongoDatabase database=client.getDatabase("myDb");
        MongoCollection collection=database.getCollection("Users");
        FindIterable<Document> iterable=collection.find();
        Iterator iterator=iterable.iterator();
        JTextArea textArea=new JTextArea();
        while (iterator.hasNext()){
            textArea=new JTextArea(iterator.next().toString());
        }
        jPanel.add(textArea);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        show();
    }
}
