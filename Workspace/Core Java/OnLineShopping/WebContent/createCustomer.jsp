<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create Customer Account</h2>
<form action="CustomerController" method="post">
<label>Customer Name</label>
<input type="text" name="cname"><br>
<label>Password</label>
<input type="password" name="password">
<br>
<input type="submit" value="Create Account">
<input type="reset" value="reset">
</form>
</body>
</html>