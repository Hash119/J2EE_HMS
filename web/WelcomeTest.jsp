<html>
<head>

    <link rel="stylesheet" href="css/style.css">
</head>

<body>
 <div class="login-wrap">
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Add Details</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Get Details</label>
            
            <div class="login-form" >
                <div class="sign-in-htm">
                    <div class="group"><br><br><br>
                        <form action="UserLogin" method="Get"> 
                          <input type="submit" class="button" value="Doctor Details Registation">
                        </form><br>
                        <form action="Patient_DetailsRegister" method="Get"> 
                          <input type="submit" class="button" value="Patient Details Registation">
                        </form><br>
                        <form action="Hospital_Details_Registration" method="Get"> 
                          <input type="submit" class="button" value="Hospital Details Registation">
                        </form><br>
                        <form action="Bill_Details_Register" method="Get"> 
                          <input type="submit" class="button" value="Bill Details Registation">
                        </form>
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-2">Get Details</a>
                    </div>
                </div>

                <div class="sign-up-htm">
                    <div class="group"><br><br><br>
                        <form action="Update_Doctor_DetailsHMS" method="Get"> 
                          <input type="submit" class="button" value="Get Doctor Details">
                        </form><br>
                        <form action="Update_Patient_DetailsHMS" method="Get"> 
                          <input type="submit" class="button" value="Get Patient Details">
                        </form><br>
                        <form action="Update_Hospital_DetailsHMS" method="Get"> 
                          <input type="submit" class="button" value="Get Hospital Details">
                        </form><br>
                        <form action="Update_Bill_Details" method="Get"> 
                          <input type="submit" class="button" value="Get Bill Details">
                        </form><br>
                        
                        <form action="UpdateUsers" method="Get"> 
                          <input type="submit" class="button" value="Get User Details">
                        </form>
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1">Add Details</a>

                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>

