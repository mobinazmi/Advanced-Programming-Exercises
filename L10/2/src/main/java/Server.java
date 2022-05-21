import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Service {
    protected Server() throws RemoteException {
    }

    @Override
    public void request(Client client) throws Exception {
        Repository repository=new Repository();
        repository.save(client);
        repository.close();
    }
}
