/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBcon;
import Model.Doctor_Details;
import Model.Hospital_Details;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
public class Hospital_Details_Registration extends HttpServlet {

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
        
        Cookie ck[]=request.getCookies();
         if(ck!=null){
         String email= ck[0].getValue();
          
         if(!email.equals("")||(email!=null)) {
          
           out.println("Welcome");
           request.getRequestDispatcher("Hospital_Details_RegistrationHMS.jsp").include(request, response);
            
             
         
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
        Hospital_Details e =new Hospital_Details();
        String Hospital_name = request.getParameter("Hospital_name");
        String Hospital_city = request.getParameter("Hospital_city");
        String Hospital_Address = request.getParameter("Hospital_Address");
        String Hospital_Contact_Number = request.getParameter("Hospital_Contact_Number");
        
       
        e.setHospital_name(Hospital_name);
        e.setHospital_city(Hospital_city);
        e.setHosptal_Address(Hospital_Address);
        e.setHospital_Contact_Number(Hospital_Contact_Number);
        
         int status= DBcon.AddHospital_Details(e);
        if (status>0){
            out.println("Register Hospital Details Successfully");
                RequestDispatcher req = request.getRequestDispatcher("GetAll_Hospital_DetailsHMS.jsp");
                req.include(request, response);
        
        }else{
        out.println("You are not Register Hospital Details Successfully");
                RequestDispatcher req = request.getRequestDispatcher("GetAll_Hospital_DetailsHMS.jsp");
                req.include(request, response);
        
      
        }
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
