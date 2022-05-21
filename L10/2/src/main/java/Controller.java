import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args){
        try {
            Service service=(Service) Naming.lookup("//localhost/Client");
            Client client=new Client();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter your food order:");
            client.setFood(scanner.nextLine());
            System.out.println("Please enter your drink:");
            client.setDrink(scanner.nextLine());
            System.out.println("Ready to pay now!");
            service.request(client);
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
