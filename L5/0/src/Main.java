import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Calculate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your desired phrase.");
            array[0]= scanner.nextLine();
            array[1]=scanner.nextLine();
            array[2]=scanner.nextLine();
        Calculate calculate=CalculateFactory.getCalculate(Calculate.array[1]);
        calculate.calc();
        }

    @Override
    public void calc() {

    }
}
