

<%@page import="Model.Doctor_Details"%>
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
        <% Doctor_Details Doctor = new Doctor_Details();
       
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        Doctor_Details e =DBcon.getDoctor_DetailsById(id);
        
       out.println("<form action='Update_Doctor_DetailsHMS' method='Post'>");
      
        out.println("<h1>Hospital Details Update</h1>");
        
        out.println("<fieldset>");
          out.println("<legend><span class='number'></span>Doctor info</legend>");
          out.println("<input type='hidden' name='id' value='"+e.getDoctor_Id()+"'/>");
          out.println("<label for='Doctor name'>Doctor name</label>");
          out.println("<input type='text' id='Doctor name' name='Doctor_name' value='"+e.getDoctor_name()+"'>");
          out.println("<select name='Speciality' style='width: 250px' value='"+e.getSpeciality()+"'>");
                         out.println("<option>CHILD AND ADOLESCENT PHYCHIATRIST</option>");
                         out.println("<option>ANOMALY SCAN</option>");
                         out.println("<option>OBSTETRICIAN AND GYNAECOLOGIST</option>");
                         out.println("<option>GENERAL SURGEON</option>");
                         out.println("<option>UROLOGICAL SURGEON</option>");
                         out.println("<option>PAEDIATRICIAN</option>");
                         out.println("<option>NEURO PHYSICIAN</option>");
                         out.println("<option>PHYSICIAN</option>");
                         out.println("<option>PSYCHIATRIST</option>");
                         out.println("<option>NEURO PHYSICIAN</option>");
                         out.println("<option>OBSTETRICIAN AND GYNAECOLOGIST</option>");
                         out.println("<option>CONSULTANT JUDICIAL MEDICINE</option>");
                         out.println("<option>VASCULAR AND TRANSPLANT SURGEON</option>");
                         out.println("<option>WOUND CONSULTATION</option>");
                         out.println("<option>EYE SURGEON</option>");
                         out.println("<option>GASTROENTEROLOGIST SURGEON</option>");
                         out.println("<option>UROLOGIST</option>");
                         out.println("<option>GENERAL SURGEON</option>");
                         out.println("<option>ALLERGY SPECIALIST</option>");
                         out.println("<option>ANOMALY SCAN</option>");
                               out.println("</select><br><br>");
          out.println("<label for='Doctor Current Address'>Doctor Current Address</label>");
          out.println("<input type='text' id='Doctor Current Address' name='Doctor_Current_Address' value='"+e.getDoctor_Current_Address()+"'>");
          
          out.println("<label for='Doctor Monthly Payement'>Doctor Monthly Payement</label>");
          out.println("<input type='text' id='Doctor Monthly Payement' name='Doctor_Monthly_Payement'value='"+e.getDoctor_Payement()+"'>");
          
          out.println("<label>Doctor Gender:</label>");
          out.println("<input type='radio' id='male' value='"+e.getGender()+"' name='Gender'> <label for='male' class='light'>Male</label><br>");
          out.println("<input type='radio' id='Female' value='"+e.getGender()+"' name='Gender'> <label for='Female' class='light'>Female</label>");
         out.println("</fieldset>");
        
        
        
        out.println("<label for='Doctor Contact Number'>Doctor Contact Number</label>");
          out.println("<input type='text' id='Doctor Contact Number' name='Doctor_Contact_Number' value='"+e.getDoctor_Contact_number()+"'>");
        
        out.println("<button type='submit'>Update Doctor Details</button>");
      out.println("</form>");
      
        HttpSession sessions =request.getSession();
        session.setMaxInactiveInterval(555);
        session.getMaxInactiveInterval();
       out.close();
       %>
    </body>
</html>
