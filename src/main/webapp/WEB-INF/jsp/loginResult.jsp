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
<title>Insert title here</title>
</head>
<body>
	<h1>どこつぶログイン</h1>
	<h4>ログインに成功しました</h4>
	<h4>ようこそ<%= user.getName() %>>さん</h4>
	<a href="#">つぶやきの投稿閲覧へ</a>
</body>
</html>