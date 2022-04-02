import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String n=scanner.nextLine();
        student.setName(n);
        System.out.println("Please enter your student number:");
        String sn=scanner.nextLine();
        student.setStudentNumber(sn);
        System.out.println("Please enter your father's name:");
        String f=scanner.nextLine();
        student.setFather(f);
        List<String> list=new ArrayList<>();
        System.out.println("Please enter your 5 scores:");
        String a=scanner.nextLine();
        String b= scanner.nextLine();
        String c= scanner.nextLine();
        String d= scanner.nextLine();
        String e= scanner.nextLine();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        System.out.println(student.getName());
        System.out.println(student.getStudentNumber());
        System.out.println(student.getFather());
        for (String s: list) {
            System.out.println(s);
        }
    }
}
