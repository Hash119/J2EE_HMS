<%-- 
    Document   : GetAllUserInformation
    Created on : Apr 22, 2021, 11:34:51 AM
    Author     : gulavita
--%>

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
           <form action="LoginAndRegisterUsersHMS.jsp" method="post"> 
       &nbsp;&nbsp;&nbsp;&nbsp;
       <button type='submit'>Add Employee</button>
    </form><br>
    <body>
        <% 
       
        
        out.println("<h2>User Details<center></h2>");
        out.println("<form action='UpdateUsers' method='Post'>");
        List<Users> list =DBcon.GetAllUser();
        out.println("<table border='2' width='100%'");
        out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th><th>City</th><th>Update</th><th>Delete</th></tr>");
        for(Users e:list){
        out.println("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getEmail()+"</td><td>"+e.getPassword()+"</td><td>"+e.getCity()+"</td><td><a href='UpdateUsersHMS.jsp?id="+e.getId()+"'>Update</a></td><td><a href='DeleteUsers?id="+e.getId()+"'>Delete</a></td></tr>");
         }
         out.println("</table>");
         //out.println("</form>");
         out.close(); 
        HttpSession sessions =request.getSession();
        session.setMaxInactiveInterval(555);
        session.getMaxInactiveInterval();
        %>
    </body>
</html>
