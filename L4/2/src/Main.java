import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        user.name=scanner.nextLine();
        System.out.println("Please enter your last name:");
        user.family=scanner.nextLine();
        System.out.println("Please enter your age:");
        user.age=scanner.nextInt();
        System.out.println("The name is: "+user.name);
        System.out.println("The last name is: "+user.family);
        System.out.println("The age is: "+user.age);
        User user1=null;
        User user2=null;
        User user3=null;
        try {
            user1=(User) user.clone();
            user2=(User) user.clone();
            user3=(User) user.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Clone not supported.");
        }
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
