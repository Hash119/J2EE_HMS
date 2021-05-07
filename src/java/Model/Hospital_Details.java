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
public class Hospital_Details {
    private int  Hospital_Id,patient_Id;
    private String Hospital_city,Hospital_Address,Hospital_Contact_Number,Hospital_name;

    public void setHospital_name(String Hospital_name) {
        this.Hospital_name = Hospital_name;
    }

    public String getHospital_name() {
        return Hospital_name;
    }

    public void setHospital_Id(int Hospital_Id) {
        this.Hospital_Id = Hospital_Id;
    }

    public void setPatient_Id(int patient_Id) {
        this.patient_Id = patient_Id;
    }

    public void setHospital_city(String Hospital_city) {
        this.Hospital_city = Hospital_city;
    }

    public void setHosptal_Address(String Hosptal_Address) {
        this.Hospital_Address = Hosptal_Address;
    }

    public void setHospital_Contact_Number(String Hospital_Contact_Number) {
        this.Hospital_Contact_Number = Hospital_Contact_Number;
    }

    public int getHospital_Id() {
        return Hospital_Id;
    }

    public int getPatient_Id() {
        return patient_Id;
    }

    public String getHospital_city() {
        return Hospital_city;
    }

    public String getHosptal_Address() {
        return Hospital_Address;
    }

    public String getHospital_Contact_Number() {
        return Hospital_Contact_Number;
    }
    
    
}
