package com.company;

public class Prerequisites extends Credits {
    public void languageOfSpecialization() {
        super.languageOfSpecialization();
        System.out.println("Prerequisites: "+"General English");
    }
    public void socialAndPoliticalRights(){
        super.socialAndPoliticalRights();
        System.out.println("Prerequisites: "+"-");
    }
    public void generalMath2(){
        super.generalMath2();
        System.out.println("Prerequisites: "+"General math 1");
    }
    public void advancedProgramming(){
        super.advancedProgramming();
        System.out.println("Prerequisites: "+"Computers Basics");
    }
    public void differentialEquations(){
        super.differentialEquations();
        System.out.println("Prerequisites: "+"General math 1");
    }
    public void physics2(){
        super.physics2();
        System.out.println("Prerequisites: "+"General math 1");
    }
    public void logicCircuit(){
        super.logicCircuit();
        System.out.println("Prerequisites: "+"-");
    }
}
