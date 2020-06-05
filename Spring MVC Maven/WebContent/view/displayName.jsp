<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome friend</title>
</head>
<body>
Hello ${name},
	Nice to meet you. Your team members are:
	<c:forEach var="member" items="${team}" >
		${member}
	</c:forEach>
</body>
</html>