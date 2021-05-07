

<%@page import="Model.Hospital_Details"%>
<%@page import="Model.Bill_Details"%>
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
    <form action="Hospital_Details_RegistrationHMS.jsp" method="post"> 
       &nbsp;&nbsp;&nbsp;&nbsp;
       <button type='submit'>Add Hospital Details</button>
    </form><br>
       </form><br>
    <body>
        <% 
       
        out.println("<h2> Added Hospital Details</h2>");
        out.println("<form action='Update_Bill_DetailsHMS' method='post'>");
        List<Hospital_Details> list =DBcon.GetAllHospital_Details();
        out.println("<table border='2' width='100%'");
        out.println("<tr><th>Hospital name</th><th>Hospital city</th><th>Hospital Address</th><th>Hospital Contact Number</th><th>Update</th><th>Delete</th></tr>");
        for(Hospital_Details e:list){
        out.println("<tr><td>"+e.getHospital_name()+"</td><td>"+e.getHospital_city()+"</td><td>"+e.getHosptal_Address()+"</td><td>"+e.getHospital_Contact_Number()+"</td><td><a href='Update_Hospital_DetailsHMS.jsp?id="+e.getHospital_Id()+"'>Update</a></td><td><a href='Delete_Hospital_Details?Hospital_Id="+e.getHospital_Id()+"'>Delete</a></td></tr>");
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
