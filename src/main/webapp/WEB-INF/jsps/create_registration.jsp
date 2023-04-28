<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new workers</title>
</head>
<h2>New Workers</h2>
<body>
<form action="saveWorkers" method="post">
<pre>
firstName<input type="text" name="firstName">
lastName<input type="text" name="lastName">
city<input type="text" name="city">
mobile<input type="text" name="mobile">
<input type="submit" value="save">
</pre>

${msg}
</form>
</body>
</html>