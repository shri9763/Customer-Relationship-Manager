<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}
.container{
  text-align:center;
}
input[type=submit] {
	width: 100%;
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="text-align: center; color: #04AA6D">SAVE CUSTOMER</h2>
	<div>
		<form:form action="addcustomer" method="post"
			modelAttribute="customer">
			<form:hidden path="cId"/>
			<label for="fname">First Name</label>
			<form:input path="firstName" />
			<label for="lname">Last Name</label>
			<form:input path="lastName" />
			<label for="email">Email</label>
			<form:input path="email" />
			<input type="submit" value="Save Customer">
		</form:form>
	</div>
</body>
</html>