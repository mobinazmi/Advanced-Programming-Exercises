import java.rmi.Remote;

public interface User extends Remote {
    void create(UserE user) throws Exception;
    void update(UserE user) throws Exception;
}
