<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include > A</title>
</head>
<body>
	<h2>include > a</h2>
	<script type="text/javascript">
		alert("ХАХАХА")
		// location.href="jspB.jsp"; // alert 후 페이지 전환
	</script>

<%	

	request.setAttribute("pname", "ccc");
	// redirect = client를 거쳐서 전송됨
	// response.sendRedirect("jspB.jsp"); // alert 로딩없이 바로 페이지 전환

%>

<jsp:include page="jspB.jsp/age=20">

</body>
</html>