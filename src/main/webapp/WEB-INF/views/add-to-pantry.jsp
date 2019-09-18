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

	Add how much ${food.name } to your pantry?
	<form action="add-amt">
<input type="hidden" value="${food.id }" name="food">
<input type="number" placeholder="1.0" step="0.01" min="0"
						name="qty" required>
					<input list="unitChoice" name="unitChoice" required> <datalist
							id="unitChoice">
							<option value="cups">
							<option value="tsp">
							<option value="tbsp">
							<option value="oz">
						</datalist>
					<input type="submit" class="btn btn-info"
						value="Add">
</body>
</html>