<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorPage</title>
</head>
<body>
	<h1>errorPage</h1>
	<%= exception.getMessage() %>
	<!-- exception 이용 시 isErrorPage="true" 필요 -->
</body>
</html>