<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<link href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	

	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="#">Player App</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="/">Home </a></li>
					<li class="nav-item"><a class="nav-link" href="/players">Player </a></li>
					<li class="nav-item"><a class="nav-link" href="/greet">Greet </a></li>
					</ul>
				
			</div>
		</nav>

	</div>
	<div>

		<h4>${message}</h4>
		<br> <!-- <a href="/greet">Greet Me !</a> <a href="/tracks">Orchard
			Track !</a> -->
	</div>

</body>
</html>

<!-- java scriplets -->