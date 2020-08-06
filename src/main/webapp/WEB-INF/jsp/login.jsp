<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font style="color:red">${ message }</font></h1>
<form method="post" action="welcomePage">
<pre>
Name    <input type="text" name="name"><br>
Password<input type="password" name="pwd"><br>
<input type="submit" value="submit">
</pre>

</form>
</body>
</html>