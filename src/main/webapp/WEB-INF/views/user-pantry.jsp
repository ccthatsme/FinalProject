<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Whats In Your Pantry!</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
</head>
<body>
<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
    <%@ include file="partials/header.jsp"%>
<div class="container">
<h1>Welcome to your Pantry</h1>
		<h1></h1>
		<h1>Add Items</h1>
		<form action="add-to-pantry">
		<input type="text" name="UPC Code" placeholder="UPC Code">
		<input type="submit" value="Add to Pantry">
		
		</form>
		
		<form action="search-by-keyword">
		<input type="text" name="keyword" placeholder="keyword">
		<input type="submit" value="Search by Keyword">
		
		</form>

		<h1>List of Pantry Items</h1>

		<table class="table">
			<tr>
				
				<th>ID</th>
				<th>Name</th>
				<th>Calories</th>
				<th>Protein</th>
				<th>Quantity</th>
				<th>Quantity Unit</th>
				<th>Add</th>
				<th>Subtract</th>
				<th>Delete</th>
				
			</tr>
			<c:forEach var="a" items="${user.pantry.pantryFood}">
		<tr>
			<td>${a.id}</td>
			<td>${a.name}</td>
			<td>${a.calories}</td>
			<td>${a.protein}</td>
			<td>${a.quantity}</td>
			<td>${a.quantityUnit}</td>
			<td><a class="btn btn-secondary" href="go-to-add-page?id=${a.id}"> add</a></td>
			<td><a class="btn btn-secondary" href="go-to-subtract-page?id=${a.id}"> subtract</a></td>
			<td><a class="btn btn-secondary" href="delete?id=${a.id}"> delete</a></td>
			
		</tr>
		</c:forEach>
		</table>
	</div>



</body>
</html>