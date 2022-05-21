import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Access {
    protected Server() throws RemoteException {
    }

    @Override
    public boolean access() throws Exception {
        System.out.println("Connected to server. Start your transactions now.");
        System.out.println("Connection failed");
        return true;
    }
}
