import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student student=new Student();
        Map map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your student number:");
        String s=scanner.nextLine();
        map.put("Student Number",s);
        System.out.println("Please enter your name:");
        String n=scanner.nextLine();
        map.put("Name",n);
        System.out.println("Please enter your GPA:");
        float g=scanner.nextFloat();
        map.put("GPA",g);
        student.setStudentNumber(s);
        student.setName(n);
        student.setGPA(g);
        System.out.println(student.getStudentNumber());
        System.out.println(student.getName());
        System.out.println(student.getGPA());
    }
}
