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
public class Doctor_Details {
    private int Doctor_Id, Hospital_Id;
    private String Speciality,Doctor_name,Doctor_Current_Address,Gender,Doctor_Payement,Doctor_Contact_number;

    public void setDoctor_Current_Address(String Doctor_Current_Address) {
        this.Doctor_Current_Address = Doctor_Current_Address;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDoctor_Current_Address() {
        return Doctor_Current_Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setDoctor_Id(int Doctor_Id) {
        this.Doctor_Id = Doctor_Id;
    }

    public void setHospital_Id(int Hospital_Id) {
        this.Hospital_Id = Hospital_Id;
    }

    public void setDoctor_name(String Doctor_name) {
        this.Doctor_name = Doctor_name;
    }

    public void setDoctor_Payement(String Doctor_Payement) {
        this.Doctor_Payement = Doctor_Payement;
    }

    public void setDoctor_Contact_number(String Doctor_Contact_number) {
        this.Doctor_Contact_number = Doctor_Contact_number;
    }

    public int getDoctor_Id() {
        return Doctor_Id;
    }

    public int getHospital_Id() {
        return Hospital_Id;
    }

    public String getDoctor_name() {
        return Doctor_name;
    }

    public String getDoctor_Payement() {
        return Doctor_Payement;
    }

    public String getDoctor_Contact_number() {
        return Doctor_Contact_number;
    }
    
}
