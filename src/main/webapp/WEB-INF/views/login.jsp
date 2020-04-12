<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Player Return</title>
</head>
<body>
	<form method="post">
		<label>User Name: </label><input type="text" name="uname" required>
		<label>Password: </label><input type="password" name="pass" required>
		<button type="submit">Log In</button>
	</form>
	<a href="/create">First time playing? <strong>Create a
			player account!</strong></a>
	<br>
	<a href="/">Return to Home</a>
</body>
</html>