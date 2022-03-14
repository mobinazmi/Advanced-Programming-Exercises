package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	class Library{
        public void lend(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the name of your desired book to lend: ");
            String getBook=scanner.nextLine();
            System.out.println(getBook+" is now lent to you:)");
        }
        public void recieve(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please name the book you want to return: ");
            String returnBook=sc.nextLine();
            System.out.println(returnBook+ " is now successfully returned:)");
        }
    }
    Library library=new Library();
    Scanner ab=new Scanner(System.in);
        System.out.println("Do you want to lend a book or return one?");
        String ask=ab.nextLine();
        switch (ask){
            case "lend":
                library.lend();
                break;
            case "return":
                library.recieve();
                break;
        }
    }
}
