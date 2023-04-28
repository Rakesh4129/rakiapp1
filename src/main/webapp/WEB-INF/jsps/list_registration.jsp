<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All workers</title>
</head>
<h2>All Workers</h2>
<body>
<table border='1'>
<tr>
<th>ID</th>
<th>FirstName</th>
<th>LastName</th>
<th>City</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach var="worker"  items="${workers}">  

     <tr>
        <td>${worker.id }</td>
        <td>${worker.firstName }</td>
        <td>${worker.lastName }</td>
         <td>${worker.city }</td>
         <td>${worker.mobile }</td>
         <td><a href="delete?id=${worker.id }">delete</a></td>
         <td><a href="update?id=${worker.id }">update</a></td>
     </tr>
     
</c:forEach>  

</table>
</body>
</html>