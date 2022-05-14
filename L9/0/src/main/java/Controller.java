
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Controller {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

        Reader reader = new Reader(queue);
        Writer writer = new Writer(queue);

        new Thread(reader).start();
        new Thread(writer).start();

    }

}