package com.company;

public class Define implements MyInteger{
    @Override
    public void isEven() {
        System.out.println("Your input is even.");
    }

    @Override
    public void isOdd() {
        System.out.println("Your input is odd.");
    }

    @Override
    public void isPositive() {
        System.out.println("Your input is positive.");
    }

    @Override
    public void isNegative() {
        System.out.println("Your input is negative.");
    }

    @Override
    public void isZero() {
        System.out.println("Your input is zero.");
    }
}
