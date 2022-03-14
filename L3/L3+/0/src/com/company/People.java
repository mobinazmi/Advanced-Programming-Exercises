package com.company;

import java.util.Scanner;

public class People {
    public static void getInfo() throws RepetitiveException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your firstname, lastname and age respectively: ");
    String firstname1 = scanner.nextLine();
    String lastname1 = scanner.nextLine();
    int age1 = scanner.nextInt();
    Scanner scanner1=new Scanner(System.in);
        System.out.println("Please enter your firstname, lastname and age respectively: ");
    String firstname2 = scanner1.nextLine();
    String lastname2 = scanner1.nextLine();
    int age2 = scanner1.nextInt();
        if (firstname1 == firstname2 || lastname1 == lastname2 || age1 == age2) {
            throw new RepetitiveException("You are the same person!");
        }
    }
}

