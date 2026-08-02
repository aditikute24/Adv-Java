<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="myTag"%>

	<h1>JSTL TAGS</h1>

	<myTag:set var="a" value="10"></myTag:set>

	<h2>
		a :
		<myTag:out value="${a}"></myTag:out>
	</h2>

	<myTag:if test="${a%2==0}">a is even</myTag:if>

	<myTag:choose>
		<myTag:when test="${a > 10 }"> a is greater than 10</myTag:when>
		<myTag:when test="${a < 10 }"> a is less than 10</myTag:when>
		<myTag:otherwise>a is equal to 10</myTag:otherwise>
	</myTag:choose>

	<myTag:remove var="a" />
	
	<p>a scope is removed</p>
	<h2>
		a :
		<myTag:out value="${a}"></myTag:out>
	</h2>
	
	<%-- <myTag:redirect url="https://www.wikipedia.org/"></myTag:redirect> --%>
	
	<myTag:import url="https://www.facebook.com/"></myTag:import>
	
</body>
</html>