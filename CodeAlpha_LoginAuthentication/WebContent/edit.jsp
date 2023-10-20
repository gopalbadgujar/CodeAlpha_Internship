<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
</head>

<%  User u=(User) request.getAttribute("user"); %>
<body>
<h1>Edit User Details Here...</h1>

<form action="up">
<pre>

User ID      : <input type="number" name="id" value="<%=u.getId()%>" hidden="true">

User Name    : <input type="text" name="name" value="<%=u.getName()%>" placeholder="Enter User Updated Name Here">

User Address : <input type="text" name="address" value="<%=u.getAddress()%>" placeholder="Enter User Updated Address Here">

User Birth   : <input type="date" name="birth" value="<%=u.getBirth()%>" placeholder="Enter User Updated Date of Birth Here">
         
User Email   : <input type="text" name="email" value="<%=u.getEmail()%>" placeholder="Enter User Updated Email Here">

User Mob.No  : <input type="number" name="mobNo" value="<%=u.getMobNo()%>" placeholder="Enter User Updated Mobile Number Here">

         
<button type="submit" value="update">UPDATE USER</button>

</pre>

</form>
</body>
</html>