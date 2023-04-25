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
<form action="delete" method="post">
Enter Employee ID to delete
<input type="number" name="id"/>
<input type="submit" value="Delete"/>
</form>
${deleteMsg}


</body>
</html>