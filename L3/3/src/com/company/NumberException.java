package com.company;

import java.util.Scanner;

public class NumberException extends Exception {
    public NumberException(String msg) {
        super(msg);
    }

    public NumberException() {
    }

    public String text;

    public void getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your desired text.");
        text = scanner.nextLine();
    }

    public void check() throws NumberException {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                System.out.println(text.length());
            } else {
                throw new NumberException("It contains a number.");
            }
        }
    }
}


