<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create Staff Account</h2>
<form action="StaffController" method="post">
<label>Staff Name</label>
<input type="text" name="sname"><br>
<label>Password</label>
<input type="password" name="password">
<br>
<input type="submit" value="Create Account">
<input type="reset" value="reset">
</form>
</body>
</html>