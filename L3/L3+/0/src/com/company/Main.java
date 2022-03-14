package com.company;

public class Main extends People {

    public static void main(String[] args) {

        try {
            getInfo();
        }
        catch (RepetitiveException e){
            e.printStackTrace();
        }


    }
}

