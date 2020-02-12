<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to HTML Page</h1>
<%!int a,b,sum; %>
<%
a=10;
b=20;
	sum = a+b;
	out.println("Welcome to JSP");
	
%>
<h2>Welcome</h2>
<br>
<%
out.println("<br>Sum of two number is "+sum);
%>

<%

%>
<br>
Sum of two number is <%=10+20 %>
<br>
<font color="red">the value of a is <%=10 %> and b is <%=b %>
and their sum is   <%=sum %></font>
</body>
</html>


