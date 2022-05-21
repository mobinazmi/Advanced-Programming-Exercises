import java.rmi.Remote;

public interface Access extends Remote {
    boolean access() throws Exception;
}
