<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_third</title>
</head>
<body>
<h1>03_third</h1>

<%!
	//delcaration : 클래스 정의부
	
	//맴버변수
	String name = "나는무너";
	int age = 49;
	boolean marriage = true;
	
	void meth_1(){
		System.out.println("meth_1() 실행");
	}
	
	//출력 구문 불가
	//System.out.println("meth_1() 실행");
	
	public void jspInit(){
		System.out.println("jspInit() 실행");
	}
	
	public void jspDestroy(){
		System.out.println("jspDestroy() 실행");
	}
%>

<%!
	//int age = 23; 맴버변수가 중첩이라 불가
	int [] arr = {11, 22, 33, 44, 55};
%>
<%
	System.out.println("scriptlet 실행:" +age);
	int age = 23; //지역변수라 맴버변수와 중첩가능
	System.out.println("scriptlet 실행:" +age);
	// int age = 17; 지역변 수 중첩 불가
	
	String str = "아기상어";
	System.out.println("scriptlet 실행:" +str);
	String str1 = "아기상어1";
	System.out.println("scriptlet 실행:" +str1);
	String str2 = "아기상어2";
	System.out.println("scriptlet 실행:" +str2);
	
	/*  메소드 안에서 메소드 정의 불가. --> scriptlet 은 _jspService()인 메소드 
		void meth_2(){
		System.out.println("meth_1() 실행");
	} 
	*/
	
	out.println("str:" + str);
	
%>



</body>
</html>