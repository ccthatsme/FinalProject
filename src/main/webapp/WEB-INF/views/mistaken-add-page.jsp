<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
</head>
<body>
	<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
	<%@ include file="partials/header.jsp"%>

	Oops! It looks like you already have this food. Did you mean to add more of it?
	<form action="add-amt">
<input type="hidden" value="${food.id }" name="food">
<input type="number" placeholder="1.0" step="0.01" min="0"
						name="qty">
					<input list="unitChoice" name="unitChoice"> <datalist
							id="unitChoice">
							<option value="cups">
							<option value="tsp">
							<option value="tbsp">
							<option value="oz">
						</datalist>
					<input type="submit" class="btn btn-primary"
						value="Add">
</body>
</html>