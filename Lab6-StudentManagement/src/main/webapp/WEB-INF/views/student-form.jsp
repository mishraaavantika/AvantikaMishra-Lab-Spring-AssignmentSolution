<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Student</title>
<style type="text/css">
label {
	display: inline-block;
	width: 150px;
	font-size: 20px;
	margin-right: 20px;
	margin-bottom: 20px;
	color: green;
}

h1 {
	text-align: center;
	background-color: deepskyblue;
}

h2 {
	color: green;
	font-size: 35px;
	font-family: Tahoma, Verdana, sans-serif;
}

a {
	font-size: 25px;
	margin-left: 100px;
}

button {
	font-size: 20px;
	width: 100%;
	margin-left: 130px;
	background-color: lightblue;
}

input {
	width: 250px;
}
</style>
</head>

<body>

	<div class="container">

		<h3>Students Directory</h3>
		<hr>

		<p class="h4 mb-4">Enter Student</p>

		<form action="/Lab6StudentManagement/students/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Student.studentId}" /> <label
				for="firstName">First Name:</label> <input type="text"
				name="firstName" value="${ Student.firstName}"><br> <label
				for="lastName">Last Name:</label> <input type="text" name="lastName"
				value="${Student.lastName}"><br> <label for="course">Course:</label>
			<input type="text" name="course" value="${Student.course}"><br>
			<label for="country">Country:</label> <input type="text"
				name="country" value="${Student.country}"><br>
	</div>

	<button type="submit" class="btn btn-info col-2 width:100%">Save</button>

	</form>

	<hr>
	<a href="/Lab6StudentManagement/students/list">Back to Students
		List</a>

	</div>
</body>

</html>










