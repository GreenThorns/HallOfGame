<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="style.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Hall Of Game</title>
</head>
<body>
<p>Hall Of Game!</p>

<form action="/HallOfGame/AccessDB" method="POST">
	Login:<Input type="text" name="user" id="user"><br>
	Password:<Input type="text" name="password" id="password"><br>
	
	<br><input type="submit" class="btn btn-success" value="Envoyer" id="login">
</form>
</body>
</html>