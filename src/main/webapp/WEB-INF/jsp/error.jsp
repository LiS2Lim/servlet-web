<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
	List<String> error = (List<String>)request.getAttribute("error");
	
	StringBuilder errs = new StringBuilder();
	for(String str: error) {
		errs.append("<p>"+str+"</p>");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error page</title>
</head>
<body>
	<div style="color:red;">
		<%= errs.toString() %>
	</div>
</body>
</html>