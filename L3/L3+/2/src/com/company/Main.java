package com.company;

public class Main extends Delta{

    public static void main(String[] args) {
        Delta delta=new Delta();
        delta.coefficients();
        try {
            delta.delta();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
