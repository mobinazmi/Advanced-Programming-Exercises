package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desired number: ");
        int TheNumber = sc.nextInt();
        int n;
        Scanner mn = new Scanner(System.in);
        System.out.print("how many numbers are in the array? ");
        n = mn.nextInt();
        int arr[] = new int[10];
        System.out.print("type the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = mn.nextInt();
        }
        int sum = 0;
        for (int x : arr) {
            if (x == TheNumber) {
                sum = sum + 1;
            }
        }
            if (sum !=0)
            {
                System.out.println("true and the number of time is: "+sum);
            }
            else
                System.out.println("false.");
        }
    }

