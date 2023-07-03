<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

.button {
	background-color: #04AA6D;
	border: none;
	color: white;
	padding: 8px 16px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}

.container {
	text-align: center;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
<body>
	<h2 style="text-align: center; color: #04AA6D">CUSTOMER
		RELATIONSHIP MANAGER</h2>
	<div align="center">
		<table id="customers">

			<tr>
			    <th>Cid</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Action</th>
				<th>Action</th>
			</tr>
			<c:forEach var="customer" items="${customers}">
				<tr>
					<c:url var="updatelink" value="/customer/showFormUpdate">
                    <c:param name="customerId" value="${customer.CId}"></c:param>
					</c:url>
					<c:url var="deletelink" value="/customer/deleteCustomer">
                    <c:param name="customerId" value="${customer.CId}"></c:param>
					</c:url>
                   <td><c:out value="${customer.CId}" /></td>
					<td><c:out value="${customer.firstName}" /></td>
					<td><c:out value="${customer.lastName}" /></td>
					<td><c:out value="${customer.email}" /></td>
					<td><a href="${updatelink}">Update</a></td>
					<td><a href="${deletelink}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br>
	<br>
	<div class="container">
		<input type="button"
			onclick="window.location.href='./showform';return false"
			class="button" value="Save Customer">
	</div>
</body>
</html>