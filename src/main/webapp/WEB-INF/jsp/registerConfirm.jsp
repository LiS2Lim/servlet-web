<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="models.User" %>

<%
	User user = (User) session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認</title>
</head>
<body>
	<p>user ID: <%= user.getUserId() %></p>
	<p>user Name: <%= user.getUserName() %></p>
	<div style="display:flex;">
		<a href="/servlet-jsp/register" style="margin-right:10px;">戻る</a>
		<form action="/servlet-jsp/register">
			<input type="hidden" name="action" value="done" />
			<input type="submit" value="登録" />
		</form>
	</div>
</body>
</html>