<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Account</title>
</head>
<body>
<h4>Email Address</h4>
<p>${user.email }</p>
<h4>
Auto-subtractions
</h4>
<c:forEach items="${user.pantry.autosubtraction }" var="subtraction">
<h5>${subtraction.food.name }</h5><br>
${subtraction.quantity } ${subtraction.quantityUnit } per day<br>

</c:forEach>

<form action="manage-subtractions">
<input type="submit" value="Manage Auto-subtractions">
</form>

</body>
</html>