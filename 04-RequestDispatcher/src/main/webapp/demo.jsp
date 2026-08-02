<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Scanner"%>
<%@page import="com.tyss.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Demo JSP page</h1>
	<h2>Person Details</h2>
	<h3>Name : ${pname}</h3>
	<h3>Age : ${page}</h3>

	<h2>Student ==> ${stud}</h2>

	<%
	Student stud = new Student("Mangi", "mangi@gmail.com", 456789);

	Scanner s = new java.util.Scanner(System.in);
	%>

</body>
</html>