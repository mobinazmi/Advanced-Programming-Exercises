import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements AutoCloseable{
    private MongoClient mongoClient;
    private MongoCredential mongoCredential;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    public  UserRepository() throws Exception {
        mongoClient = new MongoClient("localhost", 27017);
        mongoCredential = MongoCredential.createCredential("mobinazmi", "myDb",
                "1234".toCharArray());
        System.out.println("Connected to the database successfully");
        database = mongoClient.getDatabase("myDb");
        database.createCollection("22");
        System.out.println("Collection created successfully");
        collection = database.getCollection("22");
    }
    public void insert(UserEntityBuilder userEntityBuilder)throws Exception{
        Document document=new Document()
                .append("id",userEntityBuilder.getId())
                .append("name",userEntityBuilder.getName())
                .append("age", userEntityBuilder.getAge())
                .append("car",userEntityBuilder.getCar());
        collection.insertOne(document);
    }
    @Override
    public void close() throws Exception {

    }
}
