<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Whats In Your Pantry!</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
</head>
<body>
<h1>Welcome to your Pantry</h1>
<table>
<div class="container">
		<h1></h1>
		<h1>Add Items</h1>
		<form action="add-to-pantry">
		<input type="text" name="UPC Code" placeholder="UPC Code">
		<input type="submit" value="Add to Pantry">
		
		</form>

		<h1>List of Pantry Items</h1>
		<table class="table">
			<tr>
				
				<th>ID</th>
				<th>Brand Name</th>
				<th>Calories</th>
				<th>Protein</th>
				<th>Quantity</th>
				<th>Quantity Unit</th>
				
			</tr>
			<c:forEach var="a" items="${test.results}">
		<tr>
			<td>${a.id}</td>
			<td>${a.brandName}</td>
			<td>${a.calories}</td>
			<td>${a.protein}</td>
			<td>${a.quantity}</td>
			<td>${a.quantityUnit}</td>
		</tr>
		</c:forEach>
		</table>
	</div>



</body>
</html>