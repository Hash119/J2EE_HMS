/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBcon;
import Model.Users;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;

/**
 *
 * @author gulavita
 */
public class UpdateUsers extends HttpServlet {

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
          
           
           request.getRequestDispatcher("GetAllUserInformation.jsp").include(request, response);
            
             
         
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
        String name=request.getParameter("name");
        String Email=request.getParameter("email");
        String password=request.getParameter("password");
        String City=request.getParameter("City");
        
        Users e= new Users();
        e.setId(id);
        e.setName(name);
        e.setEmail(Email);
        e.setPassword(password);
        e.setCity(City);
        
        int status= DBcon.UpdateUser(e);
        if (status>0){
            out.println("Update Successfully");
                RequestDispatcher req = request.getRequestDispatcher("LoginAndRegisterUsersHMS.jsp");
                req.include(request, response);
        
        }else{
             out.println("Sorry Unable to Update");
                
        
      
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
