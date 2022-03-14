package com.company;

import java.util.Scanner;

public class Main extends CoreRequisites {
    public static void main(String[] args) {
        var a=new CoreRequisites();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of the course: ");
        String name=scanner.nextLine();
        switch (name){
            case ("Language of Specialisation"):
                a.languageOfSpecialization();
                break;
            case ("Social and Political Rights"):
                a.socialAndPoliticalRights();
                break;
            case ("General Math 2"):
                a.generalMath2();
                break;
            case ("Advanced Programming"):
                a.advancedProgramming();
                break;
            case ("Differential Equations"):
                a.differentialEquations();
                break;
            case ("Physics 2"):
                a.physics2();
                break;
            case ("Logic Circuit"):
                a.logicCircuit();
                break;
        }
    }
}
