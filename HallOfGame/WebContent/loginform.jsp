<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="AngularJS/angular.min.js"></script>
<script src="Jquery/jquery-3.3.1.min.js"></script>
<script src="ajaxlogin.js" type="text/javascript"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="style.css">

<meta charset="ISO-8859-1">
<title>Hall Of Game</title>
</head>
<body>

<div data-ng-app="">
	<label>Input:</label>
	<input type="text" data-ng-model="toninput" placeholder="Enter something cool here">
	<hr>
		<h1>Hall of Game c'est {{toninput}}</h1>
</div>

<form id="loginform">
	Login:<Input type="text" name="user" id="user"><br>
	Password:<Input type="text" name="password" id="password"><br>
	
	<br><input type="submit" class="btn btn-success" value="Envoyer" id="login">
</form>
</body>
</html>