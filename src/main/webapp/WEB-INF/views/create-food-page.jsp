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
		<h3>Add with quantity and nutrition:</h3>
		<form action="create-custom-food">
			<input type="text" name="name" placeholder="name"> <input
				type="number" placeholder="1.0" step="0.01" min="0" name="Quantity"
				required> <br><input list="unitChoice" name="quantityUnit" placeholder="Unit"
				required>
			<datalist id="unitChoice">
				<option value="cups">
				<option value="tsp">
				<option value="tbsp">
				<option value="oz">
			</datalist>
			<input type="number" placeholder="calories" step="1" min="0"
				name="calories" required> <br><input type="number"
				placeholder="sugar" step="1" min="0" name="sugar"> <input
				type="number" placeholder="carbs" step="1" min="0" name="carbs"
				required> <br><input type="number" placeholder="protein"
				step="1" min="0" name="protein" required> <input
				type="number" placeholder="fat" step="1" min="0" name="fat" required><br>
			<input type="submit" value="Add to pantry" class="btn btn-warning">
		</form>

		<h3>Add with quantity</h3>
		<form action="create-custom-food">
		<input type="text" name="name" placeholder="name">
			<input type="number" placeholder="1.0" step="0.01" min="0" name="quantity"
				required> <br><input list="unitChoice" name="quantityUnit" placeholder="Unit"
				required>
			<datalist id="unitChoice">
				<option value="cups">
				<option value="tsp">
				<option value="tbsp">
				<option value="oz">
			</datalist>
			<input type="submit" value="Add to pantry" class="btn btn-warning">
		</form>

		<h3>Add with only name (Note: the default value for measuring unit is oz):</h3>
		<form action="create-custom-food">
		<input type="text" name="name" placeholder="name">
		<input type="submit" value="Add to pantry" class="btn btn-warning">
		</form>
	</div>



</body>
</html>