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
public class Bill_Details {

        private int Bill_id, Patient_Id;
        private String Room_bill_Details, Doctor_bill_Details, Medicine_bill_Details, Total_bill_Details;

    public void setBill_id(int Bill_id) {
        this.Bill_id = Bill_id;
    }

    public void setPatient_Id(int Patient_Id) {
        this.Patient_Id = Patient_Id;
    }

    public void setRoom_bill_Dteails(String Room_bill_Dteails) {
        this.Room_bill_Details= Room_bill_Dteails;
    }

    public void setDoctor_bill_Dteails(String Doctor_bill_Dteails) {
        this.Doctor_bill_Details = Doctor_bill_Dteails;
    }

    public void setMedicine_bill_Dteails(String Medicine_bill_Dteails) {
        this.Medicine_bill_Details = Medicine_bill_Dteails;
    }

    public void setTotal_bill_Dteails(String Total_bill_Dteails) {
        this.Total_bill_Details = Total_bill_Dteails;
    }

    public int getBill_id() {
        return Bill_id;
    }

    public int getPatient_Id() {
        return Patient_Id;
    }

    public String getRoom_bill_Dteails() {
        return Room_bill_Details;
    }

    public String getDoctor_bill_Dteails() {
        return Doctor_bill_Details;
    }

    public String getMedicine_bill_Dteails() {
        return Medicine_bill_Details;
    }

    public String getTotal_bill_Dteails() {
        return Total_bill_Details;
    }

}

