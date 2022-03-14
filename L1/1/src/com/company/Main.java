package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	class Math{

        public int perimeter;
        public int surfaceArea;
        public void square(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the square length.");
            int length=scanner.nextInt();
perimeter=length*4;
surfaceArea=length*length;
            System.out.println("The perimeter is: "+perimeter);
            System.out.println("The surface area is: "+surfaceArea);
        }
        public void rectangular(){
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Please enter the rectangular length.");
            int length2=scanner2.nextInt();
            Scanner scanner3=new Scanner(System.in);
            System.out.println("Please enter the rectangular width.");
            int width2=scanner3.nextInt();
            perimeter=(length2+width2)*2;
            surfaceArea=length2*width2;
            System.out.println("The perimeter is: "+perimeter);
            System.out.println("The surface area is: "+surfaceArea);
        }
    }

        Math math=new Math();
            math.square();
            math.rectangular();
    }
}
