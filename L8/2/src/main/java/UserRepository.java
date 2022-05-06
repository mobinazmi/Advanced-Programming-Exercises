import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class UserRepository implements AutoCloseable{
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    public UserRepository() throws Exception{
        client=new MongoClient("localhost",27017);
        database=client.getDatabase("myDb");
        collection= database.getCollection("Users+");
    }

    public void update(UserEntityBuilder userEntityBuilder) throws Exception{
        collection.updateOne(Filters.eq("username",userEntityBuilder.getUsername()), Updates.set("email",userEntityBuilder.getEmail()));
    }

    @Override
    public void close() throws Exception {

    }
}
