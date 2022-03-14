package com.company;

import java.util.Scanner;

public class Student {
    public static void getInfo() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        if (name != null && name.equals("Mobina")) {
            System.out.println("Your name is correct.");
        }else System.out.println("Your name is incorrect.");
        if (username != null && username.equals("mobinazimi")) {
            System.out.println("Your username is correct.");
        } else System.out.println("Your username is incorrect.");
        if (password!=null&&password.equals("2431382")){
            System.out.println("Your password is correct.");
        } else System.out.println("Your password is incorrect.");
    }
}
