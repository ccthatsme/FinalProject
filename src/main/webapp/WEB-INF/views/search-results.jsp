<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
	<%@ include file="partials/header.jsp"%>
	Item Name- ${response.food_name }
	<br> Calories- ${response.nf_calories }
	<br> Protein- ${response.nf_protein }
	<br> Brand Name- ${response.brand_name }
	<br>
	<form action="add-to-pantry">
		<input type="hidden" value="${barcode }" name="barcode"> 
		<input	type="number" name="quantity" placeholder="quantity" required>
		 <input list="unitChoice" name="unitChoice" placeholder="Unit" required>
		<datalist id="unitChoice">
			<option value="cups">
			<option value="tsp">
			<option value="tbsp">
			<option value="oz">
		</datalist>
		<input type="submit" value="Add to Pantry" class="btn btn-warning">
	</form>
</body>
</html>