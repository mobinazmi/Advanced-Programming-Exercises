
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
        MongoDatabase database=mongoClient.getDatabase("Practice");
        database.createCollection("3");
        MongoCollection<Document> collection=database.getCollection("3");
        Student student=new Student();
        System.out.println("1)enter new info 2)update info 3)delete info");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        int answer=scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println("Please enter your Student Number:");
                student.setStudentNumber(scanner.nextLong());
                System.out.println("Please enter your full name:");
                student.setName(scanner1.nextLine());
                System.out.println("Please enter your year of entrance:");
                student.setYear(scanner.nextInt());
                System.out.println("Please enter your GPA:");
                student.setgPA(scanner.nextFloat());
                Document document=new Document()
                        .append("StudentNumber",student.getStudentNumber())
                        .append("name",student.getName())
                        .append("entrance",student.getYear())
                        .append("GPA",student.getgPA());
                collection.insertOne(document);
                break;
            case 2:
                System.out.println("Please enter your student number:");
                String sn=scanner.nextLine();
                System.out.println("What do you want to update?");
                String update=scanner.nextLine();
                System.out.println("Please enter your new"+update);
                String n=scanner.nextLine();
                collection.updateOne(Filters.eq("StudentNumber",sn), Updates.set(update,n));
                break;
            case 3:
                System.out.println("Please enter your student number:");
                String stn=scanner.nextLine();
                collection.deleteOne(Filters.eq("StudentNumber",stn));
        }

    }
}
