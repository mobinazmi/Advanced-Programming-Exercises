package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        class Student{
            public int i;
            public void calculateGPA() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter the number of your courses: ");
                int n;
                n = scanner.nextInt();
                double[] grades = new double[n];
                System.out.println("Please enter your grades: ");
                for (i = 0; i < n; i++) {
                    grades[i] = scanner.nextDouble();
                }
                double[] credits = new double[n];
                System.out.println("Please enter the credits: ");
                for (i = 0; i < n; i++) {
                    credits[i] = scanner.nextDouble();
                }
                double sum=0d;
                for (i=0;i<n;i++){
                    sum+=credits[i];
                }
                double v=0d;
                for (i = 0; i < n; i++) {
                    v = (grades[i] * credits[i]) + v;
                }
                double gpa=0d;
                gpa=v/sum;
                System.out.println("Your GPA is: " + gpa);
                if (gpa>=10)
                    System.out.println("PASS;)");
                else System.out.println("FAILED;(");
            }
        }
        Student student=new Student();
        student.calculateGPA();
    }
}
