<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Staff Login Page</h3>
<form action="StaffController" method="get">
<label>Staff Name</label>
<input type="text" name="sname"><br>
<label>Password</label>
<input type="password" name="password"><br>
<input type="submit" value="Sign In!">
<a href="createStaff.jsp">Sign Up!</a>
</form>
</body>
</html>