package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Whose status are you looking for?");
        String st=scanner.nextLine();
        Status status=new Status();
        switch (st){
            case ("student"):status.student();
            break;
            case ("teacher"):status.teacher();
            break;
            case ("employee"):status.employee();
            break;
        }


            }
        }
