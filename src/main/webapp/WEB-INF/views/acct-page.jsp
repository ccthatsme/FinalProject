<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Account</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">

</head>
<body>
	<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
	<%@ include file="partials/header.jsp"%>
	<h4>Email Address</h4>
	<p>${user.email }</p>
	<h4>Auto-subtractions</h4>
	<c:forEach items="${subtractions }" var="sub">
		<h5>${sub.food.name }</h5>
		<br>
${sub.quantity } ${sub.quantityUnit } per day<br>

	</c:forEach>

	<form action="manage-subtractions">
		<input type="submit" value="Manage Auto-subtractions">
	</form>

	<form action="manage-grocery-settings">
		<input type="submit" value="Manage Grocery Settings">
	</form>
	
</body>
</html>