<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/w3.css">
</head>
<body>
	<h4> Home page: List of users in the project </h4>
	<hr/>
	<a href="${pageContext.request.contextPath}/addUser"> Add User </a>
	<table>
	<tr>
		<th> User ID </th>
		<th> Name </th>
		<th> Email </th>
	</tr>
	<c:forEach items="${users}" var="user">
		<tr>
			<th>${user.userID}</th>
			<th>${user.name}</th>
			<th>${user.email}</th>
		</tr>
	</c:forEach>
	</table>
</body>
</html>