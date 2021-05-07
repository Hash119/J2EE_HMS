<%-- 
    Document   : GetAllUserInformation
    Created on : Apr 22, 2021, 11:34:51 AM
    Author     : gulavita
--%>

<%@page import="Model.Patient_Details"%>
<%@page import="java.util.List"%>
<%@page import="Model.DBcon"%>
<%@page import="Model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="css/getall_D.css">
    </head>
    <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<button type='submit'>Return to Welcome Page</button>
       </form><br>
           <form action="Patient_DetailsRegisterHMS.jsp" method="post"> 
       &nbsp;&nbsp;&nbsp;&nbsp;
       <button type='submit'>Register Patient</button>
    </form><br>
    <body>
        <% 
       
        
        out.println("<h2>Register Patient Information</h2>");
        out.println("<form action='Update_Patient_DetailsHMS' method='Get'>");
        List<Patient_Details> list =DBcon.GetAllPatient_Details();
        out.println("<table border='2' width='100%'");
        out.println("<tr><th>Patient ID</th><th>Patient Name</th><th>patient Diagnosis</th><th>Patient Address</th><th>Patient Contact Number</th><th>Patient Age</th><th>Patient Gender</th><th>patient Diagnosis Details</th><th>Update</th><th>Delete</th></tr>");
        for(Patient_Details e:list){
        out.println("<tr><td>"+e.getPatient_Id()+"</td><td>"+e.getPatient_name()+"</td><td>"+e.getPatient_Diagnosis()+"</td><td>"+e.getPatient_Address()+"</td><td>"+e.getPatient_ContactNumber()+"</td><td>"+e.getPatient_Age()+"</td><td>"+e.getPatient_Gender()+"</td><td>"+e.getPatient_Diagnosis_Details()+"</td><td><a href='Update_Patient_DetailsHMS.jsp?id="+e.getPatient_Id()+"'>Update</a></td><td><a href='DeletePatient?Patient_id="+e.getPatient_Id()+"'>Delete</a></td></tr>");
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
