package com.anifahbhadmus;

 interface BillingInterface {
     void pay(Patient p);
     void refund(Patient p);
}

class BillingDepartment implements BillingInterface, DepartmentInterface{



    String departmentName = "Billing Department";



    BillingDepartment(){
        System.out.println("Welcome to the " + this.name());
    }

    public void pay(Patient p){
        //pay and reset bill
        System.out.printf("The patient: %s is paying $ %s", p.name, p.bill);
        p.bill = 0;
        System.out.println('\n');
        System.out.println("Completing payment...");
    }


    public void refund(Patient p) {
        System.out.printf("The patient: %s is requesting a refund of $ %s", p.name, p.bill);
        System.out.println('\n');
        if(p.bill == 0){
        System.out.println("Processing refund request");
        }else{
            System.out.println("Could not process refund request");
        }
    }


    public String name(){

        return this.departmentName;

    }
}
