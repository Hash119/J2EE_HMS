

<%@page import="Model.Bill_Details"%>
<%@page import="Model.Patient_Details"%>
<%@page import="Model.Users"%>
<%@page import="Model.DBcon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/Patient_DetailsRegisterHMS.css">
    </head>
      <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" class="button" value="Return Welcome Page"><button type='submit'>Return to Welcome Page</button>
       </form><br>
    <body>
        <% Bill_Details Bill = new Bill_Details();
       
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        Bill_Details e =DBcon.getBill_DetailsById(id);
        
       out.println("<form action='Update_Bill_Details' method='Post'>");
      
        out.println("<h1>Update Patient Details</h1>");
        
        out.println("<fieldset>");
          out.println("<legend><span class='number'></span>Bill info</legend>");
          out.println("<input type='hidden' name='id' value='"+e.getBill_id()+"'/>");
          out.println("<label for='Room_bill_Details'>Room bill Amount</label>");
          out.println("<input type='text' id='Room_bill_Details' name='Room_bill_Details' value='"+e.getRoom_bill_Dteails()+"'/>");
         
          out.println("<label for='Medicine_bill_Details'>Medicine bill Amount</label>");
          out.println("<input type='text' id='Medicine_bill_Details' name='Medicine_bill_Details'value='"+e.getMedicine_bill_Dteails()+"'/>");
          out.println("<label for='Doctor_bill_Details'>Doctor bill Amount</label>");
          out.println("<input type='text' id='Doctor_bill_Details' name='Doctor_bill_Details'value='"+e.getDoctor_bill_Dteails()+"'/>");
          out.println("<label for='Total_bill_Details'>Total bill Amount</label>");
          out.println("<input type='text' id='Total_bill_Details' name='Total_bill_Details'value='"+e.getTotal_bill_Dteails()+"'/>");
         
           out.println("<button type='submit'>Update Bill Details</button>");
          out.println("</form>");
          
       HttpSession sessions =request.getSession();
       session.setMaxInactiveInterval(555);
       session.getMaxInactiveInterval();
       out.close();
       %>
    </body>
</html>
