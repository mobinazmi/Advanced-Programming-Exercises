import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoCredential credential;
        credential = MongoCredential.createCredential("mobinazmi", "Practice", "1234".toCharArray());
        System.out.println("Connected to database successfully");
        MongoDatabase database = mongoClient.getDatabase("Practice");
        database.createCollection("0");
        System.out.println("Collection created successfully");
        MongoCollection<Document> collection=database.getCollection("0");
        FirstTimeUser firstTimeUser = new FirstTimeUser();
        OldUser oldUser = new OldUser();
        System.out.println("Are you a first time user?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case ("Yes"):
                System.out.println("Please enter your full name:");
                firstTimeUser.setName(scanner.nextLine());
                System.out.println("Please enter your email address:");
                firstTimeUser.setEmail(scanner.nextLine());
                System.out.println("Please enter your username:");
                firstTimeUser.setUsername(scanner.nextLine());
                System.out.println("Please enter your password:");
                firstTimeUser.setPassword(scanner.nextLine());
                Document document=new Document()
                        .append("name",firstTimeUser.getName())
                        .append("email",firstTimeUser.getEmail())
                        .append("username",firstTimeUser.getUsername())
                        .append("password",firstTimeUser.getPassword());
                collection.insertOne(document);
                System.out.println("Your account is successfully created:)");
                break;
            case ("No"):
                System.out.println("Please enter your username:");
                oldUser.setUsername(scanner.nextLine());
                System.out.println("Please enter your password:");
                oldUser.setPassword(scanner.nextLine());
                System.out.println("Your connection was successful:)");

                }
        }
    }


