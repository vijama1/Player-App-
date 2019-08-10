<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Player Data</title>
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
					<li class="nav-item"><a class="nav-link" href="/tracks">Player
					</a></li>
					<li class="nav-item"><a class="nav-link" href="/greet">Greet
					</a></li>
				</ul>

			</div>
		</nav>

	</div>
	<div class="container">


		<div style="margin-top: 80px;" align="center">
			Welcome to Player page

			<div>

				<form:form method="post" name="addPlayerForm" modelAttribute="player"
					action="players/add">

					<table>
						

						<tr>
							<td>Name :</td>
							<td><input type="text" name="player_name"></td>
						</tr>
						<tr>
							<td>Category :</td>
							<td>
								<select name="category">
									<option id="batsmen"  value="batsmen">Batsmen</option>
									<option id="bowler">Bowler</option>
									<option id="allrounder">All-Rounder</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>Highest Score :</td>
							<td><input type="text" name="highestScore"></td>
						</tr>
						<tr>
							<td>Best Figures :</td>
							<td><input type="text" name="bestFigure"></td>
						</tr>
						<tr>
							<td>Team :</td>
							<td><input type="text" name="team.team_name"></td>
						</tr>

						<tr>
							<td></td>
							<td><input type="submit" class="btn btn-primary"
								value="Add Player" /></td>
							<td><input type="reset" class="btn btn-warning"
								value="Clear" /></td>
						</tr>
					</table>

				</form:form>

			</div>

			<hr>
			<table class="table table-striped">
				<thead class="thead-dark">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Category</th>
						<th>Highest Score</th>
						<th>Best Figures</th>
						<th>Team</th>
					</tr>

				</thead>

				<tbody>

					<c:forEach items="${players}" var="player">
						<tr>

							<td>${player.getPlayer_no()}</td>
							<td>${player.getPlayer_name()}</td>
							<td>${player.getCategory()}</td>
							<td>${player.getHighestScore()}</td>
							<td>${player.getBestFigure()}</td>
							<td>${player.getTeam().getTeam_name()}</td>
						</tr>


					</c:forEach>


				</tbody>


			</table>




		</div>

	</div>

</body>
</html>