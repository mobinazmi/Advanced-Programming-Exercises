import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;

import static com.mongodb.client.model.Filters.*;

public class UserRepository implements AutoCloseable{
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    public  UserRepository() throws Exception{
        mongoClient = new MongoClient( "localhost" , 27017 );
        System.out.println("Connected to the database successfully");
        database = mongoClient.getDatabase("myDb");
        collection=database.getCollection("00");
    }
    public void insert(UserEntityBuilder userEntity)throws Exception{
        Document document=new Document()
                .append("name",userEntity.getName())
                .append("username",userEntity.getUsername())
                .append("password",userEntity.getPassword())
                .append("email",userEntity.getEmail());
        collection.insertOne(document);
        System.out.println("Inserted successfully");
    }
    public void enter(UserEntityBuilder userEntity) throws Exception{
        Document document=collection.find(eq("username",userEntity.getUsername())).first();
        if (document.containsValue(userEntity.getPassword())){
            return;
        }else System.out.println("Username or password is invalid");
    }
    @Override
    public void close() throws Exception {
    }
}
