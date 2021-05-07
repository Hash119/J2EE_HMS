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
                 &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" class="button" value="Return Welcome Page">
       </form><br>
    <body>
          
  

      <form action="Patient_DetailsRegister" method="post">
      
        <h1>Patient Details Registration</h1>
        
        <fieldset>
          <legend><span class="number"></span>Patient info</legend>
          
          <label for="Patient name">Patient name</label>
          <input type="text" id="Patient name" name="Patient_name">
          
          <label for="patient Diagnosis">patient Diagnosis</label>
          <input type="text" id="patient Diagnosis" name="patient_Diagnosis">
          
          <label for="Patient Address">Patient Address</label>
          <input type="text" id="Patient Address" name="Patient_Address">
          
          <label>Patient Age:</label>
          <input type="radio" id="under_13" value="under_13" name="user_age"><label for="under_13" class="light">Under 13</label><br>
          <input type="radio" id="over_13" value="over_13" name="user_age"><label for="over_13" class="light">13 or older</label><br><br><br>
          
          <label>Patient Gender:</label>
          <input type="radio" id="male" value="male" name="Gender"><label for="male" class="light">Male</label><br>
          <input type="radio" id="Female" value="Female" name="Gender"><label for="Female" class="light">Female</label>
        </fieldset>
        
        <label for="bio">patient Diagnosis Details:</label>
          <textarea id="patient Diagnosis Details" name="patient_Diagnosis_Details"></textarea>
        </fieldset
        
        <label for="Patient Address">Patient Contact Number</label>
          <input type="text" id="Patient Address" name="Patient_Contact_Number">
        
        <button type="submit">Add Patient Details</button>
      </form>
      
    </body>

</html>
