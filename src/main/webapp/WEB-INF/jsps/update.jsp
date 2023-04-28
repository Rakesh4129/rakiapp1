<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<h2>update workers</h2>
<body>
<form action="updateWork" method="post">
<pre>

<input type="hidden" name="id" value="${works.id }">

FirstName<input type="text" name="firstName" value="${works.firstName}">
lasttName<input type="text" name="lastName" value="${works.lastName}">
city<input type="text" name="city" value="${works.city}">
Mobile<input type="text" name="mobile" value="${works.mobile}">
<input type="submit" value="update">
</pre>

</form>

</body>
</html>