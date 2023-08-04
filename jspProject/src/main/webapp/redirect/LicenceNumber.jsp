<%@page import="java.time.LocalDate"%>
<%@page import="exercise.LicNum" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주민번호로 사람 구분</title>
</head>
<body>
	<form method="post">
	<tr>
		<td>
			<input type="text" name="lNum">			
		</td>
	</tr>
	<tr>
		<td>
			<input type="text" name="name">
			<button type="submit">입력</button>
		</td>
	</tr>
	</form>
	
	
    <%
        String LicNumInput = request.getParameter("licNumInput");

        if (LicNumInput != null && !LicNumInput.isEmpty()) {
            LicNum licNum = new LicNum(LicNumInput);

            out.println("성별: " + licNum.getGender() + "<br>");
            out.println("나이: " + licNum.getAge() + "세");
        }
    %>
	
</body>
</html>