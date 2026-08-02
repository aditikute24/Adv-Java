<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Demo JSP page</h1>

	<!-- Declaration Tag -->
	<%!
		int a = 10 ;
		public void greet()
		{
			return ;
		}
	%>
	<!-- Script-let Tag -->
	<%
		//String p = request.getParameter("fdajsk");
		int b = 20 ;//local variable
		int c = 30;
	%>
	<!-- Expression Tag -->
	<h2>a : <%=a %></h2>
	<h2>b : <%=b %></h2>
	<h2>c : <%=c %></h2>
	<h2>Greetings : <%=greet()%></h2>
</body>
</html>