

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
        &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" class="button" value="Return Welcome Page">
       </form><br>
    <body>
        <% Patient_Details Patient = new Patient_Details();
        out.println("<h1>Update Patient Details</h1>");
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        Patient_Details e =DBcon.getPatient_DetailsById(id);
        
       out.println("<form action='Update_Patient_DetailsHMS' method='Post'>");
      
        out.println("<h1>Update Patient Details</h1>");
        
        out.println("<fieldset>");
          out.println("<legend><span class='number'></span>Patient info</legend>");
          out.println("<input type='hidden' name='id' value='"+e.getPatient_Id()+"'/>");
          out.println("<label for='Patient name'>Patient name</label>");
          out.println("<input type='text' id='Patient name' name='Patient_name' value='"+e.getPatient_name()+"'>");
          
          out.println("<label for='patient Diagnosis'>patient Diagnosis</label>");
          out.println("<input type='text' id='patient Diagnosis' name='patient_Diagnosis' value='"+e.getPatient_Diagnosis()+"'>");
          
          out.println("<label for='Patient Address'>Patient Address</label>");
          out.println("<input type='text' id='Patient Address' name='Patient_Address'value='"+e.getPatient_Address()+"'>");
          
          out.println("<label>Patient Age:</label>");
          out.println("<input type='radio' id='under_13' value='"+e.getPatient_Age()+"' name='user_age'><label for='under_13' class='light'>Under 13</label><br>");
          out.println("<input type='radio' id='over_13' value='"+e.getPatient_Age()+"' name='user_age'><label for='over_13' class='light'>13 or older</label><br><br><br>");
          
          out.println("<label>Patient Gender:</label>");
          out.println("<input type='radio' id='male' value='"+e.getPatient_Gender()+"' name='Gender'><label for='male' class='light'>Male</label><br>");
          out.println("<input type='radio' id='Female' value='"+e.getPatient_Gender()+"' name='Gender'><label for='Female' class='light'>Female</label>");
         out.println("</fieldset>");
        
         out.println("<label for='bio'>patient Diagnosis Details:</label>");
         out.println("<textarea id='patient Diagnosis Details' name='patient_Diagnosis_Details'value='"+e.getPatient_Diagnosis_Details()+"'></textarea>");
         out.println("</fieldset>");
        
        out.println("<label for='Patient Contact Number'>Patient Contact Number</label>");
          out.println("<input type='text' id='Patient Contact Number' name='Patient_Contact_Number' value='"+e.getPatient_ContactNumber()+"'>");
        
        out.println("<button type='submit'>Update Patient Details</button>");
      out.println("</form>");
        
       
       out.close();
       HttpSession sessions =request.getSession();
       session.setMaxInactiveInterval(555);
            session.getMaxInactiveInterval();
       %>
    </body>
</html>
