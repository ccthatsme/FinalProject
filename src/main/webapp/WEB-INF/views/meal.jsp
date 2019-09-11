<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" rel="stylesheet" integrity="sha384-D/7uAka7uwterkSxa2LwZR7RJqH2X6jfmhkJ0vFPGUtPyBMF2WMq9S+f9Ik5jJu1" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Create a Meal</title>
</head>
<body>

<h1>What are you eating today?</h1>

<table class="container">
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
			<td><a class="btn btn-secondary" href="edit-meal?id=${a.id}">Add</a></td>
			
		</tr>
		</c:forEach>
		</table>
	</div>


</body>
</html>