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
	<div>
		<%@ include file="partials/header.jsp"%>
		<h1>Recipe Options</h1>
	</div>
	<div class="container">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Image</th>
				<th>List of Missing Ingredients</th>
				<!-- <th>List of Used Ingredients</th> -->
			</tr>
			<c:forEach var="r" items="${recipeMap}">
				<tr>
					<td><a class="btn btn-warning" href="${r.value.sourceUrl }">
							${r.value.title}</a></td>
					<td><img src="${r.key.image }"></td>
					<td><c:forEach var="m" items="${r.key.missedIngredients}">
    ${m.name }<br>
						</c:forEach></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>