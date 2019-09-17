<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	<h1>${user.email }</h1>
	<br>

	<h2>Current AutoSubtractions</h2>
	<c:forEach items="${subtractions }" var="sub">
		<h5>${sub.food.name }</h5>
		<br>
${sub.quantity } ${sub.quantityUnit } per day<br>

	</c:forEach>

	<table>
		<tr>
			<th>Name</th>
			<th>Quantity</th>
			<th>Unit</th>
			<th>Submit</th>
		</tr>
		<c:forEach items="${user.pantry.pantryFood }" var="food">
			<tr>
				<form action="add-auto" id="addForm">
					<input type="hidden" value="${food.id }" name="food"> <input
						type="hidden" value="${user.pantry.id }" name="pantry">
					<td>${food.name }</td>
					<td><input type="number" placeholder="1.0" step="0.01" min="0"
						name="qty" required></td>
					<td><input list="unitChoice" name="unitChoice" placeholder="Unit" required>
						<datalist id="unitChoice">
							<option value="cups">
							<option value="tsp">
							<option value="tbsp">
							<option value="oz">
						</datalist></td>
					<td><input type="submit" class="btn btn-warning"
						value="Add Autosubtraction"></td>
				</form>

			</tr>
		</c:forEach>
	</table>
</body>
</html>