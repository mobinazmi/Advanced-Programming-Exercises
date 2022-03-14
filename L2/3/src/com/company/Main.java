package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int input=scanner.nextInt();
        Define define=new Define();
        if (input/2==0){
            define.isEven();
        }
        else define.isOdd();
        if (input>0){
            define.isPositive();
        }
        if (input<0){
            define.isNegative();
        }
        if (input==0)
            define.isZero();
    }
}
