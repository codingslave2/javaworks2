<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays" %> <!-- Arrays 클래스 import 추가 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg</title>
</head>
<body>
<%
	String [] noArr = request.getParameterValues("no");
%>


	<h1>numReg</h1>
	no:<%=request.getParameter("no") %><br/>
	noArr:<%=Arrays.toString(noArr) %><br/>
	
	
	
	
	
</body>
</html>