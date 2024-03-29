<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataBases</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>This is a dynamic web page</h1>
		<!-- Create -->
		<a href="formPerson.jsp">
			<input class="btn btn-success" type="button" value="Add Person">
		</a>
		<a href="formPhrase.jsp">
			<input class="btn btn-success" type="button" value="Add Phrase">
		</a>
		
		<!-- Read -->
		<a href="persons.jsp">
			<input class="btn btn-primary" type="button" value="View Persons">		
		</a>
		<a href="phrases.jsp">
			<input class="btn btn-primary" type="button" value="View Phrases">
		</a>
		
		<!-- Update -->
		<a href="">
			<input class="btn btn-warning" type="button" value="Update Person">
		</a>
		<a href="">
			<input class="btn btn-warning" type="button" value="Update Phrase">
		</a>
		
		<!-- Delete -->
		<a href="">
			<input class="btn btn-danger" type="button" value="Delete Person">
		</a>
		<a href="">
			<input class="btn btn-danger" type="button" value="Delete Phrase">
		</a>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>