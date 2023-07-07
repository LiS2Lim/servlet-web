<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="models.Health2" %>
<%
	Health2 h = (Health2) request.getAttribute("h");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= h.getHeight() %><br/>
	<%= h.getWeight() %><br/>
	<%= h.getBmi() %><br/>
	<%= h.getBodyType() %><br/>
</body>
</html>