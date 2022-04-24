import java.util.Scanner;

public class Main {

        public static void main( String args[] ) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Do you have an account? 1)yes  2)no");
            int answer=scanner.nextInt();
            Scanner scanner1=new Scanner(System.in);
            switch (answer) {

                case 2:
                try {
                    System.out.println("Please enter your name, username, password and email respectively:");
                    UserService.getInstance().save(new UserEntityBuilder().setName(scanner1.nextLine()).setUsername(scanner1.nextLine()).setPassword(scanner1.nextLine()).setEmail(scanner1.nextLine()));

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
                case 1:
                try {
                    UserService.getInstance().equals(new UserEntityBuilder().setUsername(scanner.nextLine()).setPassword(scanner.nextLine()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

