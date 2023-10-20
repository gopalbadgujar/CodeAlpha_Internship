<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Page</title>
</head>
<script type="text/javascript">
	function editData() {
		alert(" U want to edit");
		document.mypage.action = "edit";
		document.mypage.submit();
	}

	function delData() {
		alert(" U want to delete");
		document.mypage.action = "del";
		document.mypage.submit();
	}
</script>

<%
	List<User> ulist = (List) request.getAttribute("ulist");
%>
<body>
<h1 style="color:red;">Login Successfully Done...</h1><br><br>


	<h1>User Details...</h1>

	<form name="mypage">

		<table border="4">

			<thead>
				<tr>
					<th>SELECT</th>
					<th>ID</th>
					<th>NAME</th>
					<th>BIRTH_DATE</th>
					<th>ADDRESS</th>
					<th>Email</th>
					<th>MOBILE</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>

			<tbody>
				<tr>
					<%
						for (User u : ulist) {
					%>
					<td><input type="radio" name="id" value="<%=u.getId()%>">
					</td>
					<td><%=u.getId()%></td>
					<td><%=u.getName()%></td>
					<td><%=u.getAddress()%></td>
					<td><%=u.getBirth() %></td>
					<td><%=u.getEmail() %></td>
					<td><%=u.getMobNo() %></td>
					<td><input type="submit" value="edit" onclick="editData()"></td>
					<td><input type="submit" value="delete" onclick="delData()"></td>

				</tr>
				<%
					}
				%>
			</tbody>

		</table>

	</form>


<br><br>
<pre>

<a href="register.jsp"><button type="submit">User Registration</button></a>



<a href="index.jsp"><button type="submit">Go Back To Login Page</button></a>



<a href="home.jsp"><button type="submit">Go Back To Home Page</button></a>


</pre>
</body>
</html>