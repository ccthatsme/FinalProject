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
<!-- This is an include directive and allows us to reuse other files in our pages so we don't have to duplicate code -->
    <%@ include file="partials/header.jsp"%>
	<h1>${user.email }</h1>
	<br>
Set how much you want to add to this item when you buy it from your grocery list.
	<table>
		<tr>
			<th>Name</th>
			<th>Current Setting</th>
			<th>Quantity</th>
			<th>Unit</th>
			<th>Submit</th>
		</tr>
		<c:forEach items="${user.pantry.pantryFood }" var="food">
			<tr>
				<form action="change-grocery-setting" id="settingForm">
					<input type="hidden" value="${food.id }" name="food"> <input
						type="hidden" value="${user.pantry.id }" name="pantry">
					<td>${food.name }</td>
					<td>${food.purchaseQuantity } ${food.purchaseUnit }</td>
					<td><input type="number" placeholder="1.0" step="0.01" min="0"
						name="qty" required></td>
					<td><input list="unitChoice" name="unitChoice" required> <datalist
							id="unitChoice">
							<option value="cups">
							<option value="tsp">
							<option value="tbsp">
							<option value="oz">
						</datalist></td>
					<td><input type="submit" class="btn btn-primary"
						value="Change Grocery Setting"></td>
				</form>

			</tr>
		</c:forEach>
	</table>
</body>
</html>