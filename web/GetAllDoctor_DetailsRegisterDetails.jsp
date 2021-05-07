<%-- 
    Document   : GetAllUserInformation
    Created on : Apr 22, 2021, 11:34:51 AM
    Author     : gulavita
--%>


<%@page import="Model.Doctor_Details"%>
<%@page import="Model.Patient_Details"%>
<%@page import="java.util.List"%>
<%@page import="Model.DBcon"%>
<%@page import="Model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "javax.servlet.http.*" %>

<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="css/getall_D.css">
    </head>
    <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<button type='submit'>Return to Welcome Page</button>
       </form><br>
       <form action="Doctor_DetailsRegister.jsp" method="post"> 
       &nbsp;&nbsp;&nbsp;&nbsp;
       <button type='submit'>Doctor Data Register</button>
    </form><br> 
    <body>
        <% 
        out.println("<h2>Registered Doctor Information</h2>");
        out.println("<form action='Update_Doctor_Details' method='Get'>");
        List<Doctor_Details> list =DBcon.GetAllDoctor_Details();
        out.println("<table border='2' width='100%'");
        out.println("<tr><th>Doctor Id</th><th>Doctor_name</th><th>Doctor Monthly Payement</th><th>Doctor Contact number</th><th>Speciality</th><th>Doctor_Gender</th><th>Doctor Address</th><th>Update Doctor Details</th><th>Delete Doctor Details</th></tr>");
        for(Doctor_Details e:list){
        out.println("<tr><td>"+e.getDoctor_Id()+"</td><td>"+e.getDoctor_name()+"</td><td>"+e.getDoctor_Payement()+"</td><td>"+e.getDoctor_Contact_number()+"</td><td>"+e.getSpeciality()+"</td><td>"+e.getGender()+"</td><td>"+e.getDoctor_Current_Address()+"</td><td><a href='Update_Doctor_Details.jsp?id="+e.getDoctor_Id()+"'>Update</a></td><td><a href='Delete_Doctor_Details?Doctor_Id="+e.getDoctor_Id()+"'>Delete</a></td></tr>");
         }
         out.println("</table>");
         out.println("</form>");
         out.close(); 
            HttpSession sessions =request.getSession();
            session.setMaxInactiveInterval(555);
            session.getMaxInactiveInterval();
            %>
    </body>
</html>
