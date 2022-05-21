import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Repository {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    public Repository () throws Exception{
        client=new MongoClient("localhost",27017);
        database=client.getDatabase("myDb");
        collection=database.getCollection("Orders");
    }
    public void save(Client client) throws Exception{
        Document document=new Document()
                .append("food",client.getFood())
                .append("drink",client.getDrink());
        collection.insertOne(document);
    }
    public void close() throws Exception{
        client.close();
    }}
