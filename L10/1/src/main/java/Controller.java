import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args){
        try {
            User user=(User) Naming.lookup("//localhost/User");
            System.out.println("Create account?");
            Scanner scanner=new Scanner(System.in);
            String answer=scanner.nextLine();
            switch (answer){
                case ("yes"):
                    UserE userE=new UserE();
                    System.out.println("Please enter your full name:");
                    userE.setName(scanner.nextLine());
                    System.out.println("Please enter a valid username:");
                    userE.setUsername(scanner.nextLine());
                    System.out.println("Please enter a password:");
                    userE.setPassword(scanner.nextLine());
                    user.create(userE);
                    break;
                case ("no"):
                    UserE userE1=new UserE();
                    System.out.println("Please enter your name:");
                    userE1.setName(scanner.nextLine());
                    System.out.println("Please enter your new username:");
                    userE1.setUsername(scanner.nextLine());
                    System.out.println("Please enter your new password");
                    userE1.setPassword(scanner.nextLine());
                    user.update(userE1);
                    break;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
