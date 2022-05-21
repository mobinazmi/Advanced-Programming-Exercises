import java.rmi.Remote;

public interface Service extends Remote {
    void request(Client client) throws Exception;
}
