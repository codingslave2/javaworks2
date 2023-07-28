<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
</head>
<body>
	<h1>aaa</h1>
	<%
	try{
		int a = 10/1;
		
		out.print("정상 실행 1"+ a + "<br/>");
		
		int [] arr = {1, 2, 3, 4};
		out.print("정상 실행 2" + arr[2] + "<br/>");
		
		a = Integer.parseInt("1234");
		out.print("정상 실행 3" + a + "<br/>");
		

		// ArithmeticException - 수학적 에러 처리
	}catch(ArithmeticException e){
		out.print("수학적 에러 처리" + e.getMessage());
		
	}catch(ArrayIndexOutOfBoundsException e){
		out.print("인덱스 에러 처리" + e.getMessage());	
	
	}catch(Exception e){
		out.print("일반적 에러 처리" + e.getMessage());
	}
	%>
</body>
</html>