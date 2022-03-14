package com.company;

import java.util.Scanner;

public class Math extends Division{
    public int x,y;
    public void getNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        x=scanner.nextInt();
        System.out.println("Please enter the second number: ");
        y=scanner.nextInt();
    }
    public void add(){
        int sum;
        sum=x+y;
        System.out.println("x+y: "+sum);
    }
    public void subtract(){
        int sub;
        sub=x-y;
        System.out.println("x-y: "+sub);
    }
    public void multiply(){
        int mul;
        mul=x*y;
        System.out.println("x*y: "+mul);
    }
    public void divide(){
        int div;
        div=x/y;
        System.out.println("x/y: "+div);
    }
}
