<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your Todos</h1>
<table border="1">
<caption>Your todos are</caption>
<thead>
<tr>
<th>Description</th>
<th>Target Date</th>
<th>Is is Date?</th>
</tr>
</thead>
<tbody>
JSTL for loop
<c:forEach items="${todo}" var="todo">
<tr>
<td>${todo.desc }</td>
<td>${todo.targetDate }</td>
<td>${todo.done }</td>
</tr>
</c:forEach>
</tbody>
</table>

</h4>
<h4>Your Name: ${name }</h4>
<a href="addtodo">click here</a>for add todo
</body>
</html>