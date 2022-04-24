import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import static com.mongodb.client.model.Filters.*;


public class UserRepository implements AutoCloseable {
    private MongoClient mongoClient;
    private MongoCredential mongoCredential;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Document document;
    public UserRepository() throws Exception {
        mongoClient = new MongoClient("localhost", 27017);
        mongoCredential = MongoCredential.createCredential("mobinazmi", "myDb",
                "1234".toCharArray());
        System.out.println("Connected to the database successfully");
        database = mongoClient.getDatabase("myDb");
        database.createCollection("11");
        System.out.println("Collection created successfully");
        collection = database.getCollection("11");
    }
    public void insert(UserEntityBuilder userEntityBuilder)throws Exception{
        Document document=new Document()
                .append("username",userEntityBuilder.getUsername())
                .append("password",userEntityBuilder.getPassword())
                .append("paycheck",userEntityBuilder.getPaycheck())
                .append("volume",userEntityBuilder.getVolume());
        collection.insertOne(document);
    }
    public void update(UserEntityBuilder userEntityBuilder) throws Exception{
        Document document=new Document();
        collection.updateOne(Filters.eq(document), Updates.set("paycheck",userEntityBuilder.getPaycheck()));
        collection.updateOne(Filters.eq(document),Updates.set("volume",userEntityBuilder.getVolume()));
        collection.insertOne(document);
        System.out.println("Inserted");
    }
        @Override
        public void close () throws Exception {

        }
    }

