<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<title>Oops!</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
	<%@ include file="partials/header.jsp"%>
<h1>Oops! Looks like something went wrong.</h1>
	${errorMessage }


	<a href="user-pantry" class="btn btn-info">Return home</a>
	</form>
</body>
</html>