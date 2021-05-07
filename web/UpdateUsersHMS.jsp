<%-- 
    Document   : UpadetUsersHMS
    Created on : Apr 22, 2021, 12:08:17 PM
    Author     : gulavita
--%>


<%@page import="Model.Users"%>
<%@page import="Model.DBcon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/Patient_DetailsRegisterHMS.css">
    </head>
      
    <body>
        <% Users user = new Users();
        out.println("<h1>Update Patient</h1>");
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        Users e =DBcon.getEmployeeById(id);
       
        
       out.println("<form action='UpdateUsers' method='Post'>");
       out.println("<table>");
       out.println("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
       out.println("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");
       out.println("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>"); 
       out.println("<tr><td>Password:</td><td><input type='password' name='password' value='"+e.getPassword()+"'/></td></tr>"); 
       out.println("<tr><td>Country:</td><td>");
       out.println("<select name='City' style='width: 150px'>");
       out.println("<option>Kaluthra</option>"); 
       out.println("<option>Galle</option>"); 
       out.println("<option>Kandy</option>");
       out.println("<option>Other</option>"); 
       out.println("</select>");
       out.println("</td></tr>");
       out.println("</table><br><br>");
       out.println("<tr><td colspan='3'><button type='submit'>Update Emplyee</button></td></tr>");
       out.println("</form>");
       out.close();
       HttpSession sessions =request.getSession();
       session.setMaxInactiveInterval(555);
       session.getMaxInactiveInterval();
       %>
    </body>
</html>
