

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <link href="css/Hospital_registraion.css" rel="stylesheet" type="text/css"/>
    </head>
    <form action="WelcomeTest.jsp" method="post"> 
                 &nbsp;&nbsp;&nbsp;&nbsp;<button type='submit'>Return to Welcome Page</button>
       </form><br>
    <body>
          
  

      <form action="Hospital_Details_Registration" method="post">
      
        <h1>Hospital Details Registration</h1>
        
        <fieldset>
          <legend><span class="number"></span>Hospital info</legend>
          
          <label for="Hospital_name">Hospital name</label>
          <input type="text" id="Hospital_name" name="Hospital_name">
          
          <tr><td>Hospital city</td>&nbsp;&nbsp;&nbsp;&nbsp;
                        <select name="Hospital_city" style="width: 250px">
                         <option>Dehiwala</option>
                         <option>Moratuwa</option>
                         <option>Kotte</option>
                         <option>Negombo</option>
                         <option>Kandy</option>
                         <option>Vavuniya</option>
                         <option>Galle</option>
                         <option>Manmunai North</option>
                         <option>Dambulla</option>
                         <option>Katana</option>
                         <option>Kolonnawa</option>
                         <option>Anuradhapura</option>
                         <option>Ratnapura</option>
                         <option>Kotte</option>
                         <option>Kandy</option>
                         <option>Badulla</option>
                         <option>Badulla</option>
                         <option>Matara</option>
                         <option>Jaffna</option>
                         <option>Puttalam</option>
                         </select><br><br>
          <label for="Hospital_Address">Hospital Address</label>
          <input type="text" id="Hospital_Address" name="Hospital_Address">
          
          <label for="Hospital_Contact_Number">Hospital Contact Number</label>
          <input type="text" id="Hospital_Contact_Number" name="Hospital_Contact_Number">
                  </fieldset>

         
        
        <button type="submit">Add Hospital Details</button>
      </form>
      
    </body>

</html>

