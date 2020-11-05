package com.anifahbhadmus;




interface LaboratoryInterface {

    void runTests(Patient p);

}
class LaboratoryDepartment implements LaboratoryInterface, DepartmentInterface{

    String departmentName  = "Laboratory Department ";

  LaboratoryDepartment(){
      System.out.println("Welcome to the " + this.name());
  }


    public void runTests(Patient p) {
        System.out.printf("Running tests on patient %s", p.name);
        System.out.println("Lab tests completed and results updated");
        System.out.println("Updating laboratory test costs");
        p.UpdateBill(500);
    }

    public String name(){
        return this.departmentName;

    }
}
