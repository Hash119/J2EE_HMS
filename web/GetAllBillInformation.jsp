

<%@page import="Model.Bill_Details"%>
<%@page import="Model.Patient_Details"%>
<%@page import="java.util.List"%>
<%@page import="Model.DBcon"%>
<%@page import="Model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
       <link href="css/getall_D.css" rel="stylesheet" type="text/css"/>
    </head>
       
    </head>
    <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<button type='submit'>Return to Welcome Page</button>
       </form><br>
    <form action="Bill_DetailsHMS.jsp" method="post"> 
       &nbsp;&nbsp;&nbsp;&nbsp;
       <button type='submit'>Bill Details Register</button>
    </form><br> 
    <body>
        <% 
       
        
        out.println("<h2>Monthly Added Bill Details</h2>");
        out.println("<form action='Update_Bill_DetailsHMS' method='post'>");
        List<Bill_Details> list =DBcon.GetAllBill_Details();
        out.println("<table border='2' width='1000%'");
        out.println("<tr><th>Room bill Amount</th><th>Medicine bill Amount</th><th>Doctor bill Amoun</th><th>Total bill Amount</th><th>Update</th><th>Delete</th></tr>");
        for(Bill_Details e:list){
        out.println("<tr><td>"+e.getRoom_bill_Dteails()+"</td><td>"+e.getMedicine_bill_Dteails()+"</td><td>"+e.getDoctor_bill_Dteails()+"</td><td>"+e.getTotal_bill_Dteails()+"</td><td><a href='Update_Bill_DetailsHMS.jsp?id="+e.getBill_id()+"'>Update</a></td><td><a href='Delete_Bill_Details?Bill_id="+e.getBill_id()+"'>Delete</a></td></tr>");
         }
         out.println("</table>");
         out.println("</form>");
         out.close(); 
         HttpSession sessions =request.getSession();
         session.setMaxInactiveInterval(555);
         session.getMaxInactiveInterval();
        %>
         
         <% 
            
            %>
    </body>
</html>
