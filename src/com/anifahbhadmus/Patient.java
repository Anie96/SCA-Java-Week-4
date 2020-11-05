package com.anifahbhadmus;

enum Sex{
    Female,
    Male
}

public class Patient {

    String id;
    String name;
    String address;
    int age;
    String registrationDate;
    String purposeOfVisit;
    Sex sex;
    float bill = 0;

    Patient(String id, String name, String address, int age, String registrationDate, String purposeOfVisit, Sex sex){
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.registrationDate = registrationDate;
        this.purposeOfVisit = purposeOfVisit;
        this.sex = sex;
    }

    void UpdateBill(float amount){
        System.out.println("Updating Bill By : " + amount);
        this.bill += amount;
    }

    void PrintDetails(){
        System.out.println("Patient Details");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Sex: " + this.sex.name());
        System.out.println("Visit Purpose: " + this.purposeOfVisit);
        System.out.println("Registration Date: " + this.registrationDate);
        System.out.println('\n');
    }

}
