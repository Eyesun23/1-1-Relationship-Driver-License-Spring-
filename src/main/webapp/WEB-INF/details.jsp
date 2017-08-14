<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Profile Page</title>
</head>
<style>
	h1 {
	text-align: center;
	margin-top: 50px;
	}
	
	p {
	text-align: center;
	margin-top: 50px;
	}
</style>
<body>
	<h1><c:out value="${person.fullName}"/></h1>
	<p>License Number: <c:out value="${person.license.number}"/></p>
	<p>State: <c:out value="${person.license.state}"/></p>
	<p>Expiration Date: <fmt:formatDate pattern="MM/dd/yyyy" value="${person.license.expiration_date}"/></p>
</body>
</html>