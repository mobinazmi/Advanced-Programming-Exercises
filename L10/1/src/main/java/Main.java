import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args){
        try {
            LocateRegistry.createRegistry(1099);
            Server server=new Server();
            Naming.rebind("User",server);
            System.out.println("Server is waiting for a request.");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
