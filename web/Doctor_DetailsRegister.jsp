

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/Doctor_details.css">
        
        
    </head>
     <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<button type='submit'>Return to Welcome Page</button>
       </form><br>
    <body>
          
        
       
        
      <form action='Doctor_DetailsRegister' method='post'>
      
      <h1>Doctor Details Registration</h1>
        
     <fieldset>
         <legend><span class='number'></span>Doctor info</legend>
          
          <label for='Doctor name'>Doctor name</label>
         <input type='text' id='Doctor name' name='Doctor_name'>
          
         <tr><td>Speciality</td>&nbsp;&nbsp;&nbsp;&nbsp;
                      <select name='Speciality' style='width: 250px'>
                        <option>CHILD AND ADOLESCENT PHYCHIATRIST</option>");
                         <option>PAEDIATRICIAN</option>
                       <option>ANOMALY SCAN</option>
                        <option>OBSTETRICIAN AND GYNAECOLOGIST</option>");
                        <option>GENERAL SURGEON</option>
                      <option>UROLOGICAL SURGEON</option>
                        <option>PAEDIATRICIAN</option>
                        <option>NEURO PHYSICIAN</option>
                 <option>PHYSICIAN</option>
                     <option>PSYCHIATRIST</option>
                        <option>NEURO PHYSICIAN</option>
                      <option>OBSTETRICIAN AND GYNAECOLOGIST</option>
                 <option>CONSULTANT JUDICIAL MEDICINE</option>
                        <option>VASCULAR AND TRANSPLANT SURGEON</option>
                         <option>WOUND CONSULTATION</option>
                         <option>EYE SURGEON</option>
                         <option>GASTROENTEROLOGIST SURGEON</option>
                        <option>UROLOGIST</option>
                    <option>GENERAL SURGEON</option>
                         <option>ALLERGY SPECIALIST</option>
                        <option>ANOMALY SCAN</option>
                               </select><br><br>
          
         
          
          <label for='Doctor Address'>Doctor Current Address</label>
        <input type='text' id='Doctor Address' name='Doctor_Address'>
          
         <label for='Doctor Monthly Payement'>Doctor Monthly Payment</label>
          <input type='text' id='Doctor Monthly Payement' name='Doctor_Monthly_Payement'>
         
          
        <label>Doctor Gender:</label>
      <input type='radio' id='male' value='male' name='Gender'><label for='male' class='light'>Male</label><br>
         <input type='radio' id='Female' value='Female' name='Gender'><label for='Female' class='light'>Female</label><br><br>
        
        
          <label for='Doctor Contact Number'>Doctor Contact Number</label>
          <input type='text' id='Doctor Contact Number' name='Doctor_Contact_Number'>
        
   <button type='submit'>Add Doctor Details</button>
      </form>
      
      <% 
            HttpSession sessions =request.getSession();
            session.setMaxInactiveInterval(555);
            session.getMaxInactiveInterval();
            %>   
      
    </body>

</html>
