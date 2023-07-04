<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Date" %>

<%
	String tody = new Date().toString();
%>

<!DOCTYPE html>
<html>
<head>
	<title>Hello</title>
</head>
<body>
	<h1>Hello jsp</h1>
	<p>today is <%= tody %></p>
</body>
</html>