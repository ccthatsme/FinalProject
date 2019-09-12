<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center"><h1>Welcome to the Pantry App!</h1></div>
<br>
<br>
<div align="center">
<form action="login">
<input type="email" name="email" placeholder="user@website.com">
<input type="password" name="password" placeholder="password">
<input type="submit" value="submit">
</form>
<div class="invalid-feedback" style="color:red">Incorrect password. Please try again.</div>
</div>


</body>
</html>