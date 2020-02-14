<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Customer Login Page</h3>
<form action="CustomerController" method="get">
<label>CustomerName</label>
<input type="text" name="cname"><br>
<label>Password</label>
<input type="password" name="password"><br>
<input type="submit" value="Sign In!">
<a href="createCustomer.jsp">Sign Up!</a>
</form>
</body>
</html>