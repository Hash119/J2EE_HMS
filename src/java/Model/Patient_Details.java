/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gulavita
 */
public class Patient_Details {

    private int Patient_Id;
    private String Patient_name, patient_Diagnosis, Patient_Address, Patient_ContactNumber, Patient_Age, Patient_Gender, patient_Diagnosis_Details;

    public void setPatient_Diagnosis_Details(String patient_Diagnosis_Details) {
        this.patient_Diagnosis_Details = patient_Diagnosis_Details;
    }

    public String getPatient_Diagnosis_Details() {
        return patient_Diagnosis_Details;
    }

    public void setPatient_Id(int Patient_Id) {
        this.Patient_Id = Patient_Id;
    }

    public void setPatient_Age(String Patient_Age) {
        this.Patient_Age = Patient_Age;
    }

    public void setPatient_Gender(String Patient_Gender) {
        this.Patient_Gender = Patient_Gender;
    }

    public int getPatient_Id() {
        return Patient_Id;
    }

    public String getPatient_Age() {
        return Patient_Age;
    }

    public String getPatient_Gender() {
        return Patient_Gender;
    }

    public String getPatient_name() {
        return Patient_name;
    }

   

    public void setPatient_name(String Patient_name) {
        this.Patient_name = Patient_name;
    }

    public void setPatient_Diagnosis(String patient_Diagnosis) {
        this.patient_Diagnosis = patient_Diagnosis;
    }

    public void setPatient_Address(String Patient_Address) {
        this.Patient_Address = Patient_Address;
    }

    public void setPatient_ContactNumber(String Patient_ContactNumber) {
        this.Patient_ContactNumber = Patient_ContactNumber;
    }

    

    public String getPatient_Diagnosis() {
        return patient_Diagnosis;
    }

    public String getPatient_Address() {
        return Patient_Address;
    }

    public String getPatient_ContactNumber() {
        return Patient_ContactNumber;
    }

}
