<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" rel="stylesheet" integrity="sha384-D/7uAka7uwterkSxa2LwZR7RJqH2X6jfmhkJ0vFPGUtPyBMF2WMq9S+f9Ik5jJu1" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
    <%@ include file="partials/header.jsp"%>
<h1>How much are you using?</h1>
<form action="edit-selection">
${food } <input type="hidden" value="${food }" name="id">
<input type="number" name="quantity" placeholder="how much you are using here">


</form>
</body>
</html>