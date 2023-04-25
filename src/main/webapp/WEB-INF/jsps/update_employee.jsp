<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<form action="update" method="post">
<pre>
ID<input type="number" name="id" value="${emp.getId()}">
Name<input type="text" name="name" value="${emp.getName()}"/>
Email<input type="email" name="email" value="${emp.getEmail()}"/>
Email<input type="text" name="mobile" value="${emp.getMobile()}"/>
<input type="submit" value="Update">
</pre>
</form>

${msg}
</body>
</html>