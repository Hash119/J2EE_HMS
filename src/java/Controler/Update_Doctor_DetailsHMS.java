/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBcon;
import Model.Doctor_Details;
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
public class Update_Doctor_DetailsHMS extends HttpServlet {

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
          
          
           request.getRequestDispatcher("GetAllDoctor_DetailsRegisterDetails.jsp").include(request, response);
            
             
         
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
        Doctor_Details e =new Doctor_Details();
        String Doctor_name = request.getParameter("Doctor_name");
        String Doctor_Monthly_Payement = request.getParameter("Doctor_Monthly_Payement");
        String Doctor_Contact_Number = request.getParameter("Doctor_Contact_Number");
        String Speciality = request.getParameter("Speciality");
        String Gender = request.getParameter("Gender");
        
        String Doctor_Current_Address = request.getParameter("Doctor_Current_Address");
        
        e.setDoctor_Id(id);
        e.setDoctor_name(Doctor_name);
        e.setDoctor_Payement(Doctor_Monthly_Payement);
        e.setDoctor_Contact_number(Doctor_Contact_Number);
        e.setSpeciality(Speciality);
        e.setDoctor_Current_Address(Doctor_Current_Address);
        
       
        
    // compare selected value 
    
    if ("male".equals(Gender)|| "Female".equals(Gender)){
        e.setGender(Gender);
                    }
    
    
        int status= DBcon.UpdateDoctor_Details(e);
        if (status>0){
            out.println("Update Doctor Details Successfully");
                RequestDispatcher req = request.getRequestDispatcher("GetAllDoctor_DetailsRegisterDetails.jsp");
                req.include(request, response);
        
        }else{
        out.println("You are not Update Details Successfully");
                RequestDispatcher req = request.getRequestDispatcher("Update_Doctor_Details.jsp");
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
