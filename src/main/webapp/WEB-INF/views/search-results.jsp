<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
</head>
<body>
Item Name- ${response.food_name }<br>
Calories- ${response.nf_calories }<br>
Protein- ${response.nf_protein }<br>
Brand Name- ${response.brand_name }<br>
<form action="add-to-pantry"><input type="hidden" value="${barcode }" name="barcode"><input type="submit" value="Add to Pantry"></form>
</body>
</html>