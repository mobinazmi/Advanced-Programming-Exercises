import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MongoClient mongoClient=new MongoClient("localhost",27017);
        MongoCredential credential;
        credential=MongoCredential.createCredential("mobinazmi","Practice","1234".toCharArray());
        System.out.println("Connected success.");
        MongoDatabase database=mongoClient.getDatabase("Practice");
        database.createCollection("2+");
        MongoCollection<Document> collection=database.getCollection("2+");

        User user=new User();
        System.out.println("1)enter new info  2)delete info");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        int answer=scanner.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Please enter your id:");
                user.setId(scanner.nextLong());
                System.out.println("Please enter your full name:");
                user.setName(scanner1.nextLine());
                System.out.println("Please enter your national id number:");
                user.setIdNumber(scanner.nextLong());
                System.out.println("Please enter your father's name:");
                user.setfName(scanner1.nextLine());
                System.out.println("Please enter your status:");
                user.setStatus(scanner1.nextLine());
                System.out.println("Please enter the amount of your salary:");
                user.setSalary(scanner1.nextLine());
                System.out.println("Please enter your job experiences:");
                user.setExperience(scanner1.nextLine());
                Document document = new Document()
                        .append("id", user.getId())
                        .append("name", user.getName())
                        .append("idNumber", user.getIdNumber())
                        .append("father", user.getfName())
                        .append("status", user.getStatus())
                        .append("salary",user.getSalary())
                        .append("experiences",user.getExperience());
                collection.insertOne(document);
                break;
            case 2:
                System.out.println("Please enter your id:");
                long id=scanner.nextLong();
                collection.deleteOne(Filters.eq("id",id));
        }
    }
}
