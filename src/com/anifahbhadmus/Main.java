package com.anifahbhadmus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    static ArrayList<Patient> patients = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        char selection;
        char userSelection;
        Patient firstPatient = new Patient("001ABH", "Bola Akinlaja", "2, Popo Road, Akeju Local Government, Lagos", 27, LocalDateTime.now().toString(),"Migraines",  Sex.Female);
        Patient secondPatient = new Patient("002ABH", "Alhaja Sekoni George", "10, Allen Road", 78, LocalDateTime.now().toString(), "Pain in bones", Sex.Female);
        Patient thirdPatient = new Patient("003ABH", "Tim Smith", "30, Frodsham Street", 27, LocalDateTime.now().toString(), "Fever", Sex.Male);

        //add to list
        patients.add(firstPatient);
        patients.add(secondPatient);
        patients.add(thirdPatient);



        do {
            System.out.print("Welcome to the Hospital. Enter your patient Id to proceed: ");
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String patientId = rd.readLine();


            //get patient from patients array
            //use the array list steam api
            Patient currentPatient = patients.stream().filter(patient ->  patient.id.equals(patientId))
                    .findAny()
                    .orElse(null);

            if (currentPatient != null) {
                currentPatient.PrintDetails();

                do {
                    System.out.print("Proceed to department. \n 1 - General Inquiries \n 2 - Accidents and Emergencies  \n 3 - Consultation \n 4 - Laboratory \n 5 - Billings \n 0 - Exit Setup");
                    System.out.println('\n');
                    System.out.print("Enter Option: ");
                    rd = new BufferedReader(new InputStreamReader(System.in));
                    String choice = rd.readLine();
                switch (choice) {
                    case "1":
                        GeneralInquiryDepartment g = new GeneralInquiryDepartment();
                        g.makeInquiries(currentPatient, "Test Inquiry");
                        break;
                    case "2":
                        AccidentAndEmergencyDepartment ae = new AccidentAndEmergencyDepartment();
                        ae.evaluatePatient(currentPatient);
                        break;
                    case "3":
                        ConsultationDepartment c = new ConsultationDepartment();
                        c.consultPatient(currentPatient);
                        c.diagnosePatient(currentPatient);
                        break;
                    case "4":
                        LaboratoryDepartment l = new LaboratoryDepartment();
                        l.runTests(currentPatient);
                        break;
                    case "5":
                        BillingDepartment b = new BillingDepartment();
                        System.out.println("Do you want to pay your bills or  apply for refund (P/R)");
                        char select = (char) rd.read();
                        if(select == 'P'){
                            b.pay(currentPatient);
                        }else if(select == 'R'){
                            b.refund(currentPatient);
                        }
                        break;
                    case "0":
                        System.out.println("You have chosen to exit. Bye...");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                    System.out.print("Do you want to visit another department (Y/N): ");
                    rd = new BufferedReader(new InputStreamReader(System.in));
                    selection =  (char) rd.read();

                } while(selection == 'Y');
            }
            else {
                System.out.println("Patient does not exist");
            }
            System.out.print("Do you want to test for another user (Y/N): ");
            rd = new BufferedReader(new InputStreamReader(System.in));
            userSelection = (char) rd.read();

        } while (userSelection == 'Y') ;

}}
