<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%
	//Today
	String today = new SimpleDateFormat("MM月dd日").format(new Date());
	
	//Lucky Text
	String[] arr = { "超すっきり","すっきり","最悪" };
	int index = (int)(Math.random() * 3);
	String lucky = arr[index];

%>

<!DOCTYPE html>
<html lang="ja">
<head>
	<title>すっきり占い</title>
</head>
<body>
	<p><%= today %>の運勢は「<%= lucky %>」です</p>
</body>
</html>