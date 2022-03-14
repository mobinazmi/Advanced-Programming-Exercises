package com.company;


public class Main extends NumberException{

    public static void main(String[] args) {
        NumberException numberException=new NumberException();
        numberException.getString();
        try {
            numberException.check();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
