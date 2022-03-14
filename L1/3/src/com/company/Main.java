package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Math {
            public int a, b, c, d, e, f;
            public int x, y;
            public int det;
            public void equations() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter a,b,c,d and e,f respectively: ");
                int[] arr = new int[6];
                for (int i = 0; i < 6; i++) {
                    arr[i] = scanner.nextInt();
                }
                a=arr[0];
                b=arr[1];
                c=arr[2];
                d=arr[3];
                e=arr[4];
                f=arr[5];
                if (a*d-b*c==0){
                    System.out.println("The equations are unsolvable.");
                }
                else System.out.println("The equations are solvable.");
                x=(e*d-b*f)/(a*d-b*c);
                y=(a*f-e*c)/(a*d-b*c);
                System.out.println("x is: "+x+" y is: "+y);
                }
            }
            Math math=new Math();
        math.equations();
        }
    }

