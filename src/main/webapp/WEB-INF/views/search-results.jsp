<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
</head>
<body>
<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
    <%@ include file="partials/header.jsp"%>
Item Name- ${response.food_name }<br>
Calories- ${response.nf_calories }<br>
Protein- ${response.nf_protein }<br>
Brand Name- ${response.brand_name }<br>
<form action="add-to-pantry">
<input type="hidden" value="${barcode }" name="barcode">
<input type="number" name="quantity" required>
<input list="unitChoice" name="unitChoice" required > <datalist
							id="unitChoice">
							<option value="cups">
							<option value="tsp">
							<option value="tbsp">
							<option value="oz">
						</datalist>
<input type="submit" value="Add to Pantry">
</form>
</body>
</html>