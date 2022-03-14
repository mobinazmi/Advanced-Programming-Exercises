package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n= sc.nextInt();
        int array[]=new int[n];
        System.out.print("Enter the array: ");
        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int sum=0;
        for (int x:array)
        {
            if (x>sum)
                sum=x;
        }
        System.out.println("the maximum object is: "+sum);
    }

}
