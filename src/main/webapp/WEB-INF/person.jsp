<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Driver License</title>
</head>
<style>
	h1 {
	text-align: center;
	margin-top: 50px;
	}
	
	.container {
	text-align: center;
	margin-top: 50px;
	}
</style>
<body>
	<h1>New Person</h1>
	<div class="container">
	<form:form method="POST" action="/persons/new" modelAttribute="person">
	    <form:label path="firstName">First Name: 
	    <form:errors path="firstName"/>
	    <form:input path="firstName"/></form:label>
	    
	    <br><br>
	    
	    <form:label path="lastName">Last Name: 
	    <form:errors path="lastName"/>
	    <form:input path="lastName"/></form:label>
	    
	    <br><br>
	    
	    <input type="submit" value="Create"/>
	</form:form>
	</div>
</body>
</html>