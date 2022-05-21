import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements User {
    protected Server() throws RemoteException {
    }

    @Override
    public void create(UserE user) throws Exception {
        Repository repository=new Repository();
        repository.insert(user);
        repository.close();
    }

    @Override
    public void update(UserE user) throws Exception {
        Repository repository=new Repository();
        repository.update(user);
        repository.close();
    }
}
