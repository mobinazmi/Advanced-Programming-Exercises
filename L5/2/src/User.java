import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private long id;
    private long phone;
    private static User user=new User();
    public static User getInstance(){return user;}
    private User(){}
    Scanner scanner=new Scanner(System.in);
    public void fullName(){
        System.out.println("Please enter your full name:");
        name=scanner.nextLine();
    }
    public void age(){
        System.out.println("Please enter your age:");
        age=scanner.nextInt();
    }
    public void idNumber(){
        System.out.println("Please enter your ID number:");
        id=scanner.nextLong();
    }
    public void phone(){
        System.out.println("Please enter your cell number:");
        phone=scanner.nextLong();
    }
    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
        System.out.println(phone);

    }
}
