/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Bill_Details;
import Model.DBcon;
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
public class Update_Bill_Details extends HttpServlet {

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
          
           
           request.getRequestDispatcher("GetAllBillInformation.jsp").include(request, response);
            
             
         
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
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        Bill_Details e =new Bill_Details();
        String Room_bill_Details = request.getParameter("Room_bill_Details");
        String Doctor_bill_Details = request.getParameter("Doctor_bill_Details");
        String Medicine_bill_Details = request.getParameter("Medicine_bill_Details");
        String Total_bill_Details = request.getParameter("Total_bill_Details");
        
        
          e.setBill_id(id);
        e.setRoom_bill_Dteails(Room_bill_Details);
        e.setDoctor_bill_Dteails(Doctor_bill_Details);
        e.setMedicine_bill_Dteails(Medicine_bill_Details);
        e.setTotal_bill_Dteails(Total_bill_Details);
        
        
   
    
    
        int status= DBcon.UpdateBill_Details(e);
        if (status>0){
            out.println("Update Bill Details Successfully");
                RequestDispatcher req = request.getRequestDispatcher("LoginHMS.jsp");
                req.include(request, response);
        
        }else{
        out.println("You are not Update Bill Details Successfully");
                RequestDispatcher req = request.getRequestDispatcher("LoginHMS.jsp");
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
