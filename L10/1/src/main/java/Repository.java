import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class Repository {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    public Repository() throws Exception{
        client=new MongoClient("localhost",27017);
        database=client.getDatabase("myDb");
        collection=database.getCollection("Site");
    }
    public void insert(UserE user) throws Exception{
        Document document=new Document()
                .append("name",user.getName())
                .append("username",user.getUsername())
                .append("password",user.getPassword());
        collection.insertOne(document);
    }
    public void update(UserE user) throws Exception{
        collection.updateOne(Filters.eq("name",user.getName()), Updates.set("username",user.getName()), (UpdateOptions) Updates.set("password",user.getPassword()));
    }
    public void close() throws Exception{
        client.close();
    }
}
