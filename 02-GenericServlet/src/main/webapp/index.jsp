<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>

<style>
body{
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
}

form{
	width: 350px;
	margin: 50px auto;
	padding: 20px;
	background-color: white;
	border-radius: 10px;
	box-shadow: 0 0 10px lightgray;
}

h2{
	text-align: center;
	color: #0066cc;
}

input[type=text],
input[type=email],
input[type=number],
input[type=password]{
	width: 100%;
	padding: 10px;
	margin: 8px 0 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

input[type=submit]{
	width: 100%;
	padding: 10px;
	background-color: #0066cc;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
}

input[type=submit]:hover{
	background-color: #004c99;
}
</style>

</head>

<body>

<h2>Enter Details</h2>

<form action="/02-GenericServlet/read">

	Name:
	<input type="text" placeholder="Enter Name" name="username">

	Email:
	<input type="email" placeholder="Enter Email" name="email">

	Phone:
	<input type="number" placeholder="Enter Phone" name="phno">

	Password:
	<input type="password" placeholder="Enter Password" name="pwd">

	<input type="submit" value="Submit">

</form>

</body>
</html>