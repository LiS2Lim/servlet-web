<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<body>
	 <form action="/servlet-jsp/register" method="post">
		User ID：<input type="text" name="userId" /><br/>
		User Password：<input type="password" name="userPassword" /><br/>
		User Name：<input type="text" name="userName" /><br/>
		<input type="submit"  value="確認" />
	</form>
</body>
</html>