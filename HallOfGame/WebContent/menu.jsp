<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Model.Account" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hi!</title>
</head>
<body>

<% Account user = (Account)request.getAttribute("connectedAccount"); %>

<p>Menu</p>
<p>Vous êtes connecté!</p>
Salut <%= user.getUser() %>
</body>
</html>