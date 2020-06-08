<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome friend</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/w3.css">
</head>
<body>
<table>
<form:form modelAttribute="user" action="addUser">
<tr><td> Name: <form:input path="name"/>
<form:errors path="name" cssStyle="color:red"></form:errors><td><tr>
<tr><td> Email: <form:input path="email"/>
<form:errors path="email" cssStyle="color:red"></form:errors><td><tr>
</form:form>
</table>
</body>
</html>