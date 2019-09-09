<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome back, ${user.email }
<form action="search"><input type="text" name="barcode"><input type="submit" value="search by barcode"></form> 
<form action="search-with-words"><input type = "text" name = "search-terms">
<input type = "submit" value = "Search by keyword"></form>
</body>
</html>