import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Please enter your id:");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        String id=scanner.nextLine();
        System.out.println("Please enter your name:");
        String name=scanner.nextLine();
        System.out.println("Please enter your age:");
        int age=scanner1.nextInt();
        System.out.println("Please enter the car you want to purchase:");
        String car=scanner.nextLine();
        try {
            UserService.getInstance().save(new UserEntityBuilder().setId(id).setName(name).setAge(age).setCar(car));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
