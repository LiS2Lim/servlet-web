<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>どこつぶへようこそ</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/navbar.jsp"/>
	<h1>どこつぶへようこそ</h1>
	<form action="/servlet-jsp/login" method="post">
		ユーザー名：<input type="text" name="name" /><br/>
		パスワード：<input type="password" name="password" /><br/>
		<input type="submit" value="ログイン" />
	</form>
	<c:forEach var="i" items="${list}">
		${i.toString()}
	</c:forEach>
</body>
</html>