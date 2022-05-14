import java.io.*;

public class Thread3 implements Runnable{
    public void showFile() throws IOException {
        File file=new File("/Users/mobina.zmi/Desktop/sample3.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String st;
        FileWriter fileWriter=new FileWriter("new.txt");
        while ((st = bufferedReader.readLine())!=null){
            fileWriter.write(st);
        }
    }
    @Override
    public void run() {
        try {
            showFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
