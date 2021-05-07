<%-- 
    Document   : Patient_DetailsRegisterHMS
    Created on : Apr 22, 2021, 6:36:40 PM
    Author     : gulavita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/Patient_DetailsRegisterHMS.css">
    </head>
    <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<button type='submit'>Return to Welcome Page</button>
       </form><br>
    <body>
          
  

      <form action="Bill_Details_Register" method="post">
      
        <h1>Bill Details</h1>
        
        <fieldset>
          <legend><span class="number"></span>Bill info</legend>
          
          <label for="Room_bill_Details">Room bill Amount</label>
          <input type="text" id="Room_bill_Details" name="Room_bill_Details">
          
          <label for="Medicine_bill_Details">Medicine bill Amount</label>
          <input type="text" id="Medicine_bill_Details" name="Medicine_bill_Details">
          
          <label for="Doctor_bill_Details">Doctor bill Amount</label>
          <input type="text" id="Doctor_bill_Details" name="Doctor_bill_Details">
          
        <label for="Total_bill_Details">Total bill Amount</label>
          <input type="text" id="Total_bill_Details" name="Total_bill_Details">
        </fieldset>
        
        <button type="submit">Add bill Details</button>
      </form>
      
        <% 
            HttpSession sessions =request.getSession();
            session.setMaxInactiveInterval(555);
            session.getMaxInactiveInterval();
            %>
    </body>

</html>
