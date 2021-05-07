<html>
<head>

    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    
            <div class="login-wrap">
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
            
            <div class="login-form" >
                <div class="sign-in-htm">
                    <div class="group">
                        <form action="UserLogin" method="post"> 
                            <label for="user" class="label">Email</label>
                            <input id="user" type="text" name="email" class="input"><br>
                            <label for="pass" class="label">Password</label>
                            <input id="pass" type="password" name="password" class="input" data-type="password"><br>
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> Keep me Signed in</label><br><br>
                            <input type="submit" class="button" value="Sign In">
                        </form>
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-2">Register Account</a>
                    </div>
                </div>

                <div class="sign-up-htm">
                    <div class="group">
                        <form action="UsersRegister" method="post"> 
                        <label for="user" class="label">Name</label>
                        <input id="user" type="text" name="name" class="input"><br>
                        <label for="name" class="label">Email</label>
                        <input id="name" type="text" name="email" class="input"><br>
                        <label for="pass" class="label">Password</label>
                        <input id="pass" type="password" class="input" name="password" data-type="password"><br>
                        <tr><td>City</td>&nbsp;&nbsp;&nbsp;&nbsp;
                        <select name="City" style="width: 150px">
                         <option>Kaluthra</option>
                         <option>Galle</option>
                         <option>Kandy</option>
                         <option>Other</option>
                               </select><br><br>
                        <input type="submit" class="button" value="Sign Up">
                      </form>
                    </div>
                    <div class="hr"></div>
                    <div class="foot-lnk">
                        <label for="tab-1">Already Member?</a>

                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>
