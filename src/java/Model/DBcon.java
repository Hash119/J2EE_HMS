/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
   
/**
 *
 * @author HP
 */
public class DBcon {

    public static Connection getConnection(){
    Connection con= null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
     con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
    }
    catch(Exception e){System.out.println(e);}
    return con;
    }

      
    public boolean Verifyuser(String email, String password) throws SQLException, ClassNotFoundException{
        
        boolean verified = false;
        
      
        try {
            PreparedStatement ps = DBcon.getConnection().prepareStatement("select * from Users where email= ? and password= ?");
            ps.setString(1,email); 
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            verified = rs.next();
        }
            
         catch(SQLException e) {
         }
       
    
        return verified;
    }
    
public  static int AddEmp(Users e){ 
    
        int status =0;
        try {
           Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            
               "insert into users(name,email,password,City)values(?,?,?,?)");
           
            ps.setString(1,e.getName());
            ps.setString(2,e.getEmail());
            ps.setString(3,e.getPassword());
            ps.setString(4,e.getCity());
            status=ps.executeUpdate();
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
        return status;
    
    } 
public static int UpdateUser(Users e){
    
        int status = 0;
       try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
                              "update Users set name=?,Password=?,email =?,City=?  where ID =?");
            ps.setString(1,e.getName());
            ps.setString(2,e.getPassword());
            ps.setString(3,e.getEmail()); 
            ps.setString(4,e.getCity());
            ps.setInt(5, e.getId());
            
            status =ps.executeUpdate();
            
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
       
       return status;
}
public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=DBcon.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from Users where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    
    } 
public static List<Users> GetAllUser() {
       List<Users> list=new ArrayList<Users>();
        
        try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            "select * from Users");
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            Users e= new Users();
            e.setId(rs.getInt(1));
            e.setName(rs.getString(2));
            e.setEmail(rs.getString(4));
            e.setPassword(rs.getString(3));
            e.setCity(rs.getString(5));
            list.add(e);
            }
        con.close();
             } catch(Exception ex){ex.printStackTrace();}
         
         return list;
         
     }
public static  Users getEmployeeById(int id){  
        Users e=new Users();  
          
        try{  
            Connection con=DBcon.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Users where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2)); 
                e.setEmail(rs.getString(4)); 
                e.setPassword(rs.getString(3));  
                e.setCity(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
   
 
}
public static int AddDoctor_Details(Doctor_Details e){ 
    
        int status =0;
        try {
           Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            
               "insert into doctor_details(Doctor_name,Doctor_Payement,Doctor_Contact_number,Speciality,Doctor_Gender,Doctor_Address)values(?,?,?,?,?,?)");
           
            ps.setString(1,e.getDoctor_name());
            ps.setString(2,e.getDoctor_Payement()); 
            ps.setString(3,e.getDoctor_Contact_number());
            ps.setString(4,e.getSpeciality());
            ps.setString(5,e.getGender());
            ps.setString(6,e.getDoctor_Current_Address());
            
            status=ps.executeUpdate();
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
        return status;
}  

 public static int UpdateDoctor_Details(Doctor_Details e){
    
        int status = 0;
       try {
            Connection con= DBcon.getConnection();
           PreparedStatement ps =con.prepareStatement(
                              "update doctor_details set Doctor_name=?,Doctor_Payement=?,Doctor_Contact_number =?,Speciality=?,Doctor_Gender=?, Doctor_Address=?  where Doctor_Id =?");
            ps.setString(1,e.getDoctor_name());
            ps.setString(2,e.getDoctor_Payement());
            ps.setString(3,e.getDoctor_Contact_number());
            ps.setString(4,e.getSpeciality());
            ps.setString(5,e.getGender());
            ps.setString(6,e.getDoctor_Current_Address());
            ps.setInt(7, e.getDoctor_Id());
            
            status =ps.executeUpdate();
            
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
       
       return status;
           
    
    } 
 public static int deleteDoctor_Details(int Doctor_Id){  
        int status=0;  
        try{  
            Connection con=DBcon.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from doctor_details where Doctor_Id=?");  
            ps.setInt(1,Doctor_Id );  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    
    } 
 public static List<Doctor_Details> GetAllDoctor_Details() {
       List<Doctor_Details> list=new ArrayList<Doctor_Details>();
        
        try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            "select * from doctor_details");
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            Doctor_Details e= new Doctor_Details();
            e.setDoctor_Id(rs.getInt(1));
            e.setDoctor_name(rs.getString(3));
            e.setDoctor_Payement(rs.getString(4));
            e.setDoctor_Contact_number(rs.getString(5));
            e.setSpeciality(rs.getString(6));
            e.setGender(rs.getString(7));
            e.setDoctor_Current_Address(rs.getString(8));
            
            list.add(e);
            }
        con.close();
             } catch(Exception ex){ex.printStackTrace();}
         
         return list;
         
     }
 public static Doctor_Details getDoctor_DetailsById(int id){  
        Doctor_Details e=new Doctor_Details();  
          
        try{  
            Connection con=DBcon.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from doctor_details where Doctor_Id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setDoctor_Id(rs.getInt(1));  
                e.setDoctor_name(rs.getString(3)); 
                e.setDoctor_Payement(rs.getString(4)); 
                e.setDoctor_Contact_number(rs.getString(5));
                e.setSpeciality(rs.getString(6));
                e.setGender(rs.getString(7));
                e.setDoctor_Current_Address(rs.getString(8));
                  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
 

}  
 public static int AddHospital_Details(Hospital_Details e){ 
    
        int status =0;
        try {
           Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            
               "insert into hospital_details(Hospital_name,Hospital_city,Hospital_Address,Hospital_Contact_Number)values(?,?,?,?)");
           
            ps.setString(1,e.getHospital_name());
            ps.setString(2,e.getHospital_city());
            ps.setString(3,e.getHosptal_Address()); 
            ps.setString(4,e.getHospital_Contact_Number());
            status=ps.executeUpdate();
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
        return status;
}  
 public static int UpdateHospital_Details(Hospital_Details e){
    
        int status = 0;
       try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
                              "update hospital_details set Hospital_name=?,Hospital_city=?,Hospital_Address=?,Hospital_Contact_Number=?  where Hospital_Id =?");
            ps.setString(1,e.getHospital_name());
            ps.setString(2,e.getHosptal_Address());
            ps.setString(3,e.getHospital_Contact_Number());
            ps.setString(4,e.getHospital_city()); 
            ps.setInt(5,e.getHospital_Id());
            
            status =ps.executeUpdate();
            
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
       
       return status;
           
    
    } 
 public static int deleteHospital_Details(int Hospital_Id){  
        int status=0;  
        try{  
            Connection con=DBcon.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from Hospital_Details where Hospital_Id=?");  
            ps.setInt(1,Hospital_Id );
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    
    } 
 public static List<Hospital_Details> GetAllHospital_Details() {
       List<Hospital_Details> list=new ArrayList<Hospital_Details>();
        
        try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            "select * from hospital_details");
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            Hospital_Details e= new Hospital_Details();
            e.setHospital_Id(rs.getInt(1));
            e.setHospital_city(rs.getString(3));
            e.setHosptal_Address(rs.getString(4));
            e.setHospital_Contact_Number(rs.getString(5));
            e.setHospital_name(rs.getString(6));
            list.add(e);
            }
        con.close();
             } catch(Exception ex){ex.printStackTrace();}
         
         return list;
         
     }
 public static Hospital_Details getHospital_DetailsById(int id){  
        Hospital_Details e=new Hospital_Details();  
          
        try{  
            Connection con=DBcon.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from hospital_details where Hospital_Id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setHospital_Id(rs.getInt(1));
              e.setHospital_city(rs.getString(3));
             e.setHosptal_Address(rs.getString(4));
                  e.setHospital_Contact_Number(rs.getString(5));
                 e.setHospital_name(rs.getString(6)); 
                  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
   
}  
 public static int AddPatient_Details(Patient_Details e){ 
    
        int status =0;
        try {
            Connection con = DBcon.getConnection(); {
                PreparedStatement ps =con.prepareStatement(
                        "insert into patient_details(Patient_name,patient_Diagnosis,Patient_Address,Patient_Contact_Number,Patient_Age,Patient_Gender,patient_Diagnosis_Details)values(?,?,?,?,?,?,?)");
        
                ps.setString(1,e.getPatient_name());
                ps.setString(2,e.getPatient_Diagnosis());
                ps.setString(3,e.getPatient_Address());
                ps.setString(4,e.getPatient_ContactNumber());
                ps.setString(5,e.getPatient_Age());
                ps.setString(6,e.getPatient_Gender());
                ps.setString(7,e.getPatient_Diagnosis_Details());
                status=ps.executeUpdate();
                con.close();
            }
            }catch(SQLException ex){{}}
        return status;
}  
 public static int UpdatePatient_Details(Patient_Details e){
    
        int status = 0;
       try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
                              "update patient_details set Patient_name=?, patient_Diagnosis=?, Patient_Address=?,Patient_Contact_Number=?,Patient_Age=?, Patient_Gender=?, patient_Diagnosis_Details=?   where Patient_id=?");
            
            ps.setString(1,e.getPatient_name());
            ps.setString(2,e.getPatient_Diagnosis());
            ps.setString(3,e.getPatient_Address());
            ps.setString(4,e.getPatient_ContactNumber()); 
            ps.setString(5,e.getPatient_Age());
            ps.setString(6,e.getPatient_Gender());
            ps.setString(7,e.getPatient_Diagnosis_Details());
            ps.setInt(8, e.getPatient_Id());
            status =ps.executeUpdate();
            
            con.close();
            }catch(Exception ex){}
       
       return status;
           
    
    } 
 public static int deletePatient_Details(int Patient_id){  
        int status=0;  
        try{  
            Connection con=DBcon.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from patient_details where Patient_id=?");  
            ps.setInt(1,Patient_id );
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    
    } 
 public static List<Patient_Details> GetAllPatient_Details() {
       List<Patient_Details> list=new ArrayList<Patient_Details>();
        
        try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            "select * from patient_details");
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            Patient_Details e= new Patient_Details();
            e.setPatient_Id(rs.getInt(1));
            e.setPatient_name(rs.getString(2));
            e.setPatient_Diagnosis(rs.getString(3));
            e.setPatient_Address(rs.getString(4));
            e.setPatient_ContactNumber(rs.getString(5));
            e.setPatient_Age(rs.getString(6));
            e.setPatient_Gender(rs.getString(7));
            e.setPatient_Diagnosis_Details(rs.getString(8));
            list.add(e);
            }
        con.close();
             } catch(Exception ex){ex.printStackTrace();}
         
         return list;
         
     }
 public static Patient_Details getPatient_DetailsById(int id){  
        Patient_Details e =new Patient_Details();  
          
        try{  
            Connection con=DBcon.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from patient_details where Patient_id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setPatient_Id(rs.getInt(1));  
                e.setPatient_name(rs.getString(2)); 
                e.setPatient_Diagnosis(rs.getString(3)); 
                e.setPatient_Address(rs.getString(4)); 
                e.setPatient_ContactNumber(rs.getString(5));
                e.setPatient_Age(rs.getString(6));
                e.setPatient_Gender(rs.getString(7));
                e.setPatient_Diagnosis_Details(rs.getString(8));
                  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
 

 }
 public static int AddBill_Details(Bill_Details e){ 
    
        int status =0;
        try {
           Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            
               "insert into bill_details(Room_bill_Dteails,Doctor_bill_Dteails,Medicine_bill_Dteails, Total_bill_Dteails )values(?,?,?,?)");
           
            ps.setString(1,e.getRoom_bill_Dteails());
            ps.setString(2,e.getDoctor_bill_Dteails()); 
            ps.setString(3,e.getMedicine_bill_Dteails());
            ps.setString(4,e.getTotal_bill_Dteails());
            status=ps.executeUpdate();
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
        return status;
}  
 public static int UpdateBill_Details(Bill_Details e){
    
        int status = 0;
       try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
                              "update bill_details set Room_bill_Dteails=?,Doctor_bill_Dteails=?,Medicine_bill_Dteails=?,Total_bill_Dteails=? where Bill_id =?");
            ps.setString(1,e.getRoom_bill_Dteails());
            ps.setString(2,e.getDoctor_bill_Dteails());
            ps.setString(3,e.getMedicine_bill_Dteails());
            ps.setString(4,e.getTotal_bill_Dteails()); 
            ps.setInt(5, e.getBill_id());
            
            status =ps.executeUpdate();
            
            con.close();
            }catch(Exception ex){ex.printStackTrace();}
       
       return status;
           
    
    } 
 public static int deleteBill_Details(int Bill_id){  
        int status=0;  
        try{  
            Connection con=DBcon.getConnection();
            PreparedStatement ps=con.prepareStatement("delete from bill_details where Bill_id=?");  
            ps.setInt(1,Bill_id );
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    
    } 
 public static List<Bill_Details> GetAllBill_Details() {
       List<Bill_Details> list=new ArrayList<Bill_Details>();
        
        try {
            Connection con= DBcon.getConnection();
        PreparedStatement ps =con.prepareStatement(
            "select * from bill_details");
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            Bill_Details e= new Bill_Details();
            e.setBill_id(rs.getInt(1));
            e.setRoom_bill_Dteails(rs.getString(3));
            e.setDoctor_bill_Dteails(rs.getString(4));
            e.setMedicine_bill_Dteails(rs.getString(5));
            e.setTotal_bill_Dteails(rs.getString(6));
            list.add(e);
            }
        con.close();
             } catch(Exception ex){ex.printStackTrace();}
         
         return list;
         
     }
 public static Bill_Details getBill_DetailsById(int id){  
        Bill_Details e =new Bill_Details();  
          
        try{  
            Connection con=DBcon.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from bill_details where Bill_id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setBill_id(rs.getInt(1));  
                e.setRoom_bill_Dteails(rs.getString(3)); 
                e.setDoctor_bill_Dteails(rs.getString(4)); 
                e.setMedicine_bill_Dteails(rs.getString(5)); 
                e.setTotal_bill_Dteails(rs.getString(6));
                  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
 

 }
}

