package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter the second one: ");
        int b= ab.nextInt();
        Scanner bc=new Scanner(System.in);
        System.out.print("Enter your demand amongst: " +
                "1)addition " +
                "2)subtraction " +
                "3)multiplication " +
                "4)division ");
        String demand= bc.nextLine();
        switch (demand){
            case "addition":
                System.out.println(a+b);
                break;
            case "subtraction":
if (a>b){
    System.out.println(a-b);
}
else
    System.out.println(b-a);
break;
            case "multiplication":
                System.out.println(a*b);
                break;
            case "division":
                System.out.println(a/b);
                break;
        }
    }
}
