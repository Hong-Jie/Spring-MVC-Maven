<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome friend</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/w3.css">
</head>
<body>
<c:set var="gender" value="${user.gender}"/>
<c:set var="male" value="male"/>
<c:set var="female" value="female"/>
Hello 
<c:choose>
	<c:when test="${gender == male}">
	Mr.
	</c:when>
	<c:when test="${gender == female}">
	Ms.
	</c:when>
</c:choose>
${user.name}, welcome! <br/>
You're from ${user.country} <br/>
Thanks for leaving us the message: ${user.msg} <br/>
</body>
</html>