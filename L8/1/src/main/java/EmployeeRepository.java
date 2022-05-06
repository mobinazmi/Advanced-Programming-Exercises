import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class EmployeeRepository implements AutoCloseable{
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    public EmployeeRepository() throws Exception{
        mongoClient=new MongoClient("localhost",27017);
        database=mongoClient.getDatabase("myDb");
        collection=database.getCollection("employees");
    }
    public void insert(EmployeeEntityBuilder employeeEntityBuilder) throws Exception{
        Document document=new Document();
        document.append("name",employeeEntityBuilder.getName())
                .append("email",employeeEntityBuilder.getEmail())
                .append("address",employeeEntityBuilder.getAddress())
                .append("pEmployer",employeeEntityBuilder.getPreviousEmployer())
                .append("number",employeeEntityBuilder.getNumber())
                .append("pPosition",employeeEntityBuilder.getPreviousPosition())
                .append("education",employeeEntityBuilder.getEducation());
        collection.insertOne(document);
        System.out.println("Inserted.");
    }
    @Override
    public void close() throws Exception {
    }
}
