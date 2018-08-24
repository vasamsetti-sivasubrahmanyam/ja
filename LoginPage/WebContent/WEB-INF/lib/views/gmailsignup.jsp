<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
<div align="center">
<h2>Gmail signup</h2>
<table>
<form:form action="registerUser" method ="post" modelAttribute="gmailsignup">


<tr>
					<td><form:input path="firstName" size="30" /></td>
					<td><form:errors path="firstName" cssClass="error" /></td>
				</tr>
				<tr>
				
					<td><form:input path="lastName" size="30" /></td>
					<td><form:errors path="lastName" cssClass="error" /></td>
				</tr>
				
					<td><form:input path="middleName" size="30" /></td>
					<td><form:errors path="middleName" cssClass="error" /></td>
				</tr>
				
					<td><form:input path="userName" size="30" /></td>
					<td><form:errors path="userName" cssClass="error" /></td>
				</tr>
				<td><form:input path="dob" size="30" /></td>
					<td><form:errors path="dob" cssClass="error" /></td>
				</tr>
				<td><form:input path="age" size="30" /></td>
					<td><form:errors path="age" cssClass="error" /></td>
				</tr>
				<td><form:input path="phoneNumber" size="30" /></td>
					<td><form:errors path="phoneNumber" cssClass="error" /></td>
				</tr>
				<td><form:input path="alternatepPoneNumber" size="30" /></td>
					<td><form:errors path="alternatePhoneNumber" cssClass="error" /></td>
				</tr>
				<td><form:input path="state" size="30" /></td>
					<td><form:errors path="state" cssClass="error" /></td>
				</tr>
				</form:form>
				
				</table>
				</div>
</body>
</html>