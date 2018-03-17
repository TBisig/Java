<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The Code</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h2 class="red">${errors}</h2>
	<h1>What is the Code?</h1>
	<form action="/submit" method="POST">
		<input type="text" name="code" />
		<button>Try Code</button>
	</form>
</body>
</html>