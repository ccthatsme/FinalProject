<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Whats In Your Pantry!</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
	<%@ include file="partials/header.jsp"%>
	<div class="container">
		<h1>Welcome to your Pantry</h1>
		<h1></h1>
		<h1>Add Items</h1>
		<form action="search">
			<input type="text" name="barcode" placeholder="UPC Code"
				class="form-control"> <input type="submit"
				class="btn btn-primary" value="Search">

		</form>

		<!-- <form action="search-by-keyword">
		<input type="text" name="keyword" placeholder="keyword">
		<input type="submit" value="Search by Keyword">
		
		</form> -->

		<h1>Your Grocery List</h1>

		<form action="buy-selected">
			<c:forEach items="${groceries }" var="item">
		${item.name }<br>
				<td><input type="checkbox" name="check" value="${item.name }">
					Check to Add<br><br></td>
			</c:forEach>

			<input type="submit" value="Buy Selected" class="btn btn-warning">
		</form>
		<a href="buy-all" class="btn btn-warning">Buy All</a>
	</div>

</body>
</html>