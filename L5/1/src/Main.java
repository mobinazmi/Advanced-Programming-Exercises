import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String a=scanner.nextLine();
        System.out.println("Please enter your full name:");
        String b=scanner.nextLine();
        System.out.println("Please enter your password:");
        String c=scanner.nextLine();
        System.out.println("Please enter your age:");
        int d=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please enter your address:");
        String e=scanner1.nextLine();
        System.out.println("Please enter your phone number:");
        long f=scanner1.nextLong();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please enter your education status:");
        String g=scanner2.nextLine();
        User user = new UserBuilder().setUsername(a).setRealName(b).setPassword(c).setAge(d).setAddress(e).setPhoneNumber(f).setEducation(g).createUser();
        System.out.println(user.getUsername());
        System.out.println(user.getRealName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getPhoneNumber());
        System.out.println(user.getEducation());
    }
}
