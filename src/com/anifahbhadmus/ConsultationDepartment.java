package com.anifahbhadmus;

interface ConsultationInterface {

   void consultPatient(Patient p);
   void diagnosePatient(Patient p);

}

class ConsultationDepartment implements ConsultationInterface, DepartmentInterface {

   String departmentName  = "Consultation Department";



    ConsultationDepartment(){
        System.out.println("Welcome to the " + this.name());
    }

    public void consultPatient(Patient p) {
        System.out.printf("Starting consultation for patient: %s ", p.name);
        System.out.println("Consultation complete");
    }


    public void diagnosePatient(Patient p) {

        System.out.printf("Diagnosing patient: %s ", p.name);
        System.out.println('\n');
        System.out.println("Diagnosis complete");
    }

    public String name(){

        return this.departmentName;

    }

}