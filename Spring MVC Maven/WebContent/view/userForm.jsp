<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">
Name: <form:input path="name"/>
<p/>
Gender: <form:radiobuttons path="gender" items="${genderMap}"/>
		<p/>
Country: <form:select path="country">
			 <form:option value="-" label="--Select your country--"/>
			 <form:options items="${countryMap}"/>
		 </form:select>
		 <p/>
Leave us a message:
		<form:textarea path="msg"/>
		<p/>
	<input type="submit" value="Submit">
</form:form>
</body>
</html>