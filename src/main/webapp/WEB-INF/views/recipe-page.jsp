<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">

</head>
<body>
<div align="center">
<h1>Recipe Options</h1>
</div>
<div class="container">
<table class="table">
  <tr>
  	<th>ID</th>
    <th>Name</th>
    <th>Image</th>
    <th>List of Missing Ingredients</th>
   <!-- <th>List of Used Ingredients</th> -->
  </tr>
  <c:forEach var="r" items="${test}">
  <tr>
    <td><a class="btn btn-secondary" href="${r.spoonacularSourceUrl }">${r.id}</a></td>
    <td>${r.title}</td>
    <td><img src="${r.image }"></td>
    <td>
    <c:forEach var="m" items="${r.missedIngredients}">
    ${m.name }<br>
    </c:forEach>
    
    </td>
   <!-- <td><c:forEach var="u" items="${r.userIngredients}">
    ${u.name }<br>
    </c:forEach></td> -->
  </tr>
  </c:forEach>
</table>
</div>

</body>
</html>