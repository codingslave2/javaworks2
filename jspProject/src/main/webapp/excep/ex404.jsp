<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 error</title>
</head>
<body>
	<h1>404 에러 처리</h1>
	<%= exception.getMessage() %>
	<!-- exception 이용 시 isErrorPage="true" 필요 -->
</body>
</html>