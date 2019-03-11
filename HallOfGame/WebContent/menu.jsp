<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Model.Account" %>
<!DOCTYPE html>
<html>
<head>
<script src="Jquery/jquery-3.3.1.min.js"></script>
<script src="killCookie.js" type="text/javascript"></script>
<script src="AngularJS/angular.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Hi!</title>
</head>
<body>

<% Account user = (Account)request.getAttribute("connectedAccount"); %>

<p>Menu</p>
<p>Vous êtes connecté!</p>
Salut <%= user.getUser() %><br>
<button type="button" class="btn btn-danger" id="disconnect">Deconnexion</button>
</body>
</html>