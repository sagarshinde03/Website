<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Home Page">
    <meta name="author" content="Sagar Shinde">
    <title>Home Page</title>
    <link href="http://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    	body {
		  padding-top: 5rem;
		}
		.starter-template {
		  padding: 3rem 1.5rem;
		  text-align: center;
		}
    </style>
    <script src="<c:url value="/resources/js/jquery-3.1.0.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
  </head>
  <body>
    <nav class="navbar navbar-fixed-top navbar-dark bg-inverse">
      <ul class="nav navbar-nav">
      	<div style="margin-left:20%">
      		<li class="nav-item">
	          <a class="nav-link" href="/home">Home</a>
	        </li>
	        <li class="nav-item active">
	          <a class="nav-link" href="/scores">Scores</a>
	        </li>
      	</div>
      	<div style="margin-left:50%">
      		<li class="nav-item">
      			<a class="nav-link"><sec:authentication property="name"/> <sec:authentication property="authorities"/></a>
      		</li>
      		<li class="nav-item">
      			<a class="nav-link" href="/logout">Logout</a>
      		</li>
      	</div>
      </ul>
    </nav>
	<sec:authorize access="hasRole('Admin')">
		<h1>This will be seen only by the admin</h1>
	</sec:authorize>
	<div class="container">
      <div class="starter-template">
      	<table align="center" class="table">
	      	<thead class="thead-default">
	      		<tr>
	      			<th>Difficulty Level</th>
					<th>Games Played</th>
					<th>Wins</th>
					<th>Losses</th>
					<th>Ties</th>
	      		</tr>
	      	</thead>
	      	<tbody>
	      		<c:forEach items="${ticTacToeList}" var="ticTacToe">
					<tr>
						<td align="left">${ticTacToe.levelDifficulty}</td>
						<td align="left">${ticTacToe.gamesPlayed}</td>
						<td align="left">${ticTacToe.wins}</td>
						<td align="left">${ticTacToe.losses}</td>
						<td align="left">${ticTacToe.ties}</td>
					</tr>
				</c:forEach>
	      	</tbody>
      	</table>
      </div>
    </div>
  </body>
</html>