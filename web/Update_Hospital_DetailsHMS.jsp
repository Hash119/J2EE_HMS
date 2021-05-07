

<%@page import="Model.Hospital_Details"%>
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
                 &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" class="button" value="Return Welcome Page"><button type='submit'>Return to Welcome Page</button>
       </form><br>
 <body>

 <%     Hospital_Details Hospital = new Hospital_Details();
       
        String sid =request.getParameter("id");
        int id= Integer.parseInt(sid);
        Hospital_Details e =DBcon.getHospital_DetailsById(id);


         out.println("<form action='Update_Hospital_DetailsHMS' method='post'>");
      
        out.println("<h1>Hospital Details Registration</h1>");
        
        out.println("<fieldset>");
          out.println("<legend><span class='number'></span>Hospital info</legend>");
          out.println("<input type='hidden' name='id' value='"+e.getHospital_Id()+"'/>");
          
          out.println("<label for='Hospital_name'>Hospital name</label>");
          out.println("<input type='text' id='Hospital_name' name='Hospital_name' value='"+e.getHospital_name()+"'>");
          
          out.println("<tr><td>Hospital city</td>&nbsp;&nbsp;&nbsp;&nbsp;");
                        out.println("<select name='Hospital_city' style='width: 250px' value='"+e.getHospital_city()+"'>");
                         out.println("<option>Dehiwala</option>");
                         out.println("<option>Moratuwa</option>");
                         out.println("<option>Kotte</option>");
                         out.println("<option>Negombo</option>");
                         out.println("<option>Kandy</option>");
                         out.println("<option>Vavuniya</option>");
                         out.println("<option>Galle</option>");
                         out.println("<option>Manmunai North</option>");
                         out.println("<option>Dambulla</option>");
                         out.println("<option>Katana</option>");
                         out.println("<option>Kolonnawa</option>");
                         out.println("<option>Anuradhapura</option>");
                         out.println("<option>Ratnapura</option>");
                         out.println("<option>Kotte</option>");
                         out.println("<option>Kandy</option>");
                         out.println("<option>Badulla</option>");
                         out.println("<option>Badulla</option>");
                         out.println("<option>Matara</option>");
                         out.println("<option>Jaffna</option>");
                         out.println("<option>Puttalam</option>");
                         out.println("</select><br><br>");
          out.println("<label for='Hospital_Address'>Hospital Address</label>");
          out.println("<input type='text' id='Hospital_Address' name='Hospital_Address' value='"+e.getHosptal_Address()+"'>");
          
          out.println("<label for='Hospital_Contact_Number'>Hospital Contact Number</label>");
          out.println("<input type='text' id='Hospital_Contact_Number' name='Hospital_Contact_Number'value='"+e.getHospital_Contact_Number()+"'>");
                  out.println("</fieldset>");

         
        
        out.println("<button type='submit'>Update Hospital Details</button>");
      out.println("</form>");
      
    
          out.close();
          HttpSession sessions =request.getSession();
          session.setMaxInactiveInterval(555);
            session.getMaxInactiveInterval();
       %>
    </body>
</html>