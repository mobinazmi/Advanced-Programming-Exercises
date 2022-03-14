package com.company;

import java.util.Scanner;

public class Delta extends Exception{
    public int a,b,c;
    public void coefficients(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a,b,c respectively:");
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
    }
    public void delta() throws DeltaException{
        int delta=(b^2)-(4*a*c);
        if (delta<0){
            throw new DeltaException("The equation has no answers.");
        }
        if (delta==0){
            System.out.println("x is: "+(-b)/(2*a));
        }
        if (delta>0){
            double r=Math.sqrt(delta);
            double x1,x2;
            x1=(-b+r)/(2*a);
            x2=(-b-r)/(2*a);
            System.out.println("x could be both: "+x1+" and "+x2);
        }
    }
}
