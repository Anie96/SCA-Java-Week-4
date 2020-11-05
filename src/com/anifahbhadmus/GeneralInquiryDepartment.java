package com.anifahbhadmus;

interface GeneralInquiryInterface {


    void makeInquiries(Patient p, String inquiry);

}

class GeneralInquiryDepartment implements GeneralInquiryInterface,DepartmentInterface {

    String departmentName = "General Inquiry Department";

    GeneralInquiryDepartment(){
        System.out.println("Welcome to the " + this.name());
    }

    public void makeInquiries(Patient p, String inquiry) {

        System.out.printf("The patient %s made an inquiry about %s", p.name, inquiry);
        System.out.println('\n');
        System.out.println("Inquiry has been responded to and completed");

    }

    public String name(){

        return this.departmentName;

    }

}