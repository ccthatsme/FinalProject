<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">

</head>
<body>
<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
    <%@ include file="partials/header.jsp"%>
	welcome back, ${user.email }
	<form action="dashboard">
		<input type="submit" value="My dashboard">
	</form>
	<br>
	<form action="search">
		<input type="text" name="barcode"><input type="submit"
			value="search by barcode">
	</form>
	<form action="search-with-words">
		<input type="text" name="search-terms"> <input type="submit"
			value="Search by keyword">
	</form>
</body>
</html>