<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Bank Application</title>
<style type="text/css">
.center{
text-align: center;
height: 250px;
margin-top: 200px;
}

</style>
</head>
<body style="background-image: url('https://skillsandeducationgroupawards.co.uk/wp-content/uploads/2023/03/counselling-2-1.png'); background-size: cover;" >
<form action="log">
<div class="center">
<h2 style="font-family: monospace; font-size: xx-large;">WELCOME TO USER LOGIN</h2>

<input type="text" placeholder=" Enter Your User Name " name="username"><br><br>
<input type="password" placeholder=" Enter Your Password " name="password"><br><br>
<input type="submit" value="Login"><br><br>
Don't have an account? <a href="register.jsp"> Create New Account</a><br><br>

<a href="home.jsp"> Go To Home Page</a>
</div>
</form>


</body>
</html>