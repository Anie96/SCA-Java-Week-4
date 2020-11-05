package com.anifahbhadmus;

import java.util.Random;

interface AccidentAndEmergencyInterface{

    void evaluatePatient(Patient p);
    void stabilizePatient(Patient p);
}


class AccidentAndEmergencyDepartment implements AccidentAndEmergencyInterface{

    float evaluationCost = 300;
    float stabilizationCost = 0;

    String departmentName = "Accident And Emergency Department";
    Random rd = new Random();



    AccidentAndEmergencyDepartment(){
        System.out.println("Welcome to the " + this.name());
    }

    public void evaluatePatient(Patient p){

        System.out.printf("Evaluating patient id: %s, name: %s", p.id, p.name);
        System.out.println('\n');
        System.out.printf("Evaluation Cost: %s", this.evaluationCost);
        System.out.println('\n');
        p.UpdateBill(evaluationCost);
        int stabilzeSelect = rd.nextInt(5);
        if(stabilzeSelect > 0 ) {
            stabilizePatient(p);
        }
        else System.out.println("Patient cannot be stabilized...");
        System.out.println("Evaluation Complete...");

    }


    public void stabilizePatient(Patient p){
        System.out.println('\n');
        System.out.println("Stabilizing Patient...");
        System.out.printf("Stabilization Cost: %s", this.stabilizationCost);
        System.out.println('\n');
        System.out.println("Stabilization Complete...");
        System.out.println('\n');
    };


   public String name(){

        return this.departmentName;

    }
}