<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/servlet-jsp/health2" method="post">
		<input type="text" name="height" />(cm)<br/>
		<input type="text" name="weight" />(kg)<br/>
		<input type="submit" value="計算" />
	</form>
</body>
</html>