import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MongoClient mongoClient=new MongoClient("localhost",27017);
        MongoCredential credential;
        credential=MongoCredential.createCredential("mobinazmi","Practice","1234".toCharArray());
        System.out.println("Connected to database.");
        MongoDatabase database=mongoClient.getDatabase("Practice");
        database.createCollection("1+++");
        System.out.println("Collection created.");
        MongoCollection<Document> collection=database.getCollection("1+++");
        User user=new User();
        System.out.println("1)create new user 2)update ");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        int answer=scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println("Please enter your username:");
                user.setUsername(scanner1.nextLine());
                System.out.println("Please enter your email:");
                user.setEmail(scanner1.nextLine());
                System.out.println("Please enter your password:");
                user.setPassword(scanner1.nextLine());
                System.out.println("Please enter your age:");
                user.setAge(scanner.nextInt());
                System.out.println("Please enter your education status:");
                user.setEducation(scanner1.nextLine());
                Document document=new Document()
                        .append("username",user.getUsername())
                        .append("email",user.getEmail())
                        .append("password",user.getPassword())
                        .append("age",user.getAge())
                        .append("education",user.getEducation());
                collection.insertOne(document);
                break;
            case 2:
                System.out.println("Please enter your username:");
                String un=scanner.nextLine();
                System.out.println("What do you want to update?");
                String answer1=scanner.nextLine();
                System.out.println("Please enter your new"+answer1);
                String update=scanner.nextLine();
                        collection.updateOne(Filters.eq("username",un),Updates.set(answer1,update));

        }
    }
}
