<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
<title>Create a Meal</title>
</head>
<body>
<%@ include file="partials/header.jsp"%>
<div class="container">
<h1>What are you eating today?</h1>
<form action="edit-meal">
<table class="table">
			<tr>
				
				<th>ID</th>
				<th>Name</th>
				<th>Calories</th>
				<th>Protein</th>
				<th>Quantity</th>
				<th>Quantity Unit</th>
				<th>Add To Meal</th>
				
				
			</tr>
			<c:forEach var="a" items="${list}">
		<tr>
			
			<td>${a.id}</td>
			<td>${a.name}</td>
			<td>${a.calories}</td>
			<td>${a.protein}</td>
			<td>${a.quantity}</td>
			<td>${a.quantityUnit}</td>
			<td><input type="checkbox" name="check" value="${a.name }"> Check to Add<br></td>
			<%-- <td><a class="btn btn-secondary" href="edit-meal?id=${a.id}">Add</a></td> --%>
			
		</tr>
		</c:forEach>
		</table>
		<h4>How many recipes do you want to show?</h4>
		<input type="number" name="items" placeholder="Number of Recipes" required>
		<br>
		<input type="submit" name="Add All">
		</form>
	</div>
	


</body>
</html>