/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBcon;
import Model.Patient_Details;
import Model.Users;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gulavita
 */
public class Update_Patient_DetailsHMS extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
       
 Cookie ck[]=request.getCookies();
         if(ck!=null){
         String email= ck[0].getValue();
          
         if(!email.equals("")||(email!=null)) {
          
           
           request.getRequestDispatcher("GetAllPatientInformation.jsp").include(request, response);
            
             
         
         }
         }else{
         out.println("Please Login First");
         request.getRequestDispatcher("LoginAndRegisterUsersHMS.jsp").include(request, response);
         } 	
		 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        String Patient_name = request.getParameter("Patient_name");
        String patient_Diagnosis = request.getParameter("patient_Diagnosis");
        String Patient_Address = request.getParameter("Patient_Address");
        String user_age = request.getParameter("user_age");
        String Gender = request.getParameter("Gender");
        String patient_Diagnosis_Details = request.getParameter("patient_Diagnosis_Details");
        String Patient_Contact_Number = request.getParameter("Patient_Contact_Number");
        Patient_Details e= new Patient_Details();
        e.setPatient_Id(id);
        e.setPatient_name(Patient_name);
        e.setPatient_Diagnosis(patient_Diagnosis);
        e.setPatient_Address(Patient_Address);
        e.setPatient_ContactNumber(Patient_Contact_Number);
        e.setPatient_Diagnosis_Details(patient_Diagnosis_Details);
        
    // compare selected value 
    if ("under_13".equals(user_age)|| "over_13".equals(user_age)) {
      e.setPatient_Age(user_age);
                 }
    if ("male".equals(Gender)|| "Female".equals(Gender)){
        e.setPatient_Gender(Gender);
                    }
        
        int status= DBcon.UpdatePatient_Details(e);
        if (status>0){
            out.println("Update Successfully");
                RequestDispatcher req = request.getRequestDispatcher("GetAllPatientInformation.jsp");
                req.include(request, response);
        
        }else{
             out.println("Sorry Unable to Update");
             RequestDispatcher req = request.getRequestDispatcher("Update_Patient_DetailsHMS.jsp");
                req.include(request, response);
                
        
      
        }
        out.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
