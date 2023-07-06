<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "models.Health" %>

<%
	Health h = (Health)request.getAttribute("h");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health check</title>
</head>
<body>
	あなたのBMPは「<%= h.getBmi() %>(<%= h.getTaikei() %>)」です。
</body>
</html>