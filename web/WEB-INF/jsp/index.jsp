<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}


.container {
  padding: 16px;
}

span.pwd {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.pwd {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}

.center {
  margin: auto;
  width: 40%;
  padding: 100px;
  background-color:darkgray;

}
.form{
    background-color: white;  
}
</style>
<script>
    if(document.cookie!='null'){
        alert("Enter valid credentials!!")
        document.cookie='null'
    }
    </script>
</head>
<body class="center">

    <h4>LOGIN HERE:</h4>
    <form action="abc" method="post" class="form">

  <div class="container">
    <label for="uname"><b>Username</b></label><br>
    <input type="text" placeholder="Enter Username" name="uname" required><br>

    <label for="pwd"><b>Password</b></label><br>
    <input type="password" placeholder="Enter Password" name="pwd" required><br>
        
    <button type="submit" style="width: 80px">Login</button><br>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <!--<span class="pwd">Forgot <a href="#">password?</a></span>-->
  </div>
  <hr>
  <a href="content/register.html">Sign up</a>
</form>

</body>
<h6> Enter Valid Loin credentials to login and submit your response,Irrelevant or wrong credentials will not lead to required page.</h6>
</html>

