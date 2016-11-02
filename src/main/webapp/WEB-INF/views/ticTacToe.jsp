<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html lang="en">
<head>
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
    <link href="<c:url value="/resources/css/ticTacToe.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-3.1.0.min.js" />"></script>
    <script src="<c:url value="/resources/js/ticTacToe.js" />"></script>
</head>
<body>
	<nav class="navbar navbar-fixed-top navbar-dark bg-inverse">
	  <ul class="nav navbar-nav">
		  <div style="margin-left:20%">
		  	<li class="nav-item">
		      <a class="nav-link" href="/home">Home</a>
		    </li>
		    <li class="nav-item">
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
	<div class="container">
			<form id="form-ticTacToe">
				<div class="starter-template">
					<div style="left:20%; width:10%; display:inline-block">
						<span>Difficulty:</span>
					</div>
					<div style="left:20%; width:10%; display:inline-block">
						<select name="difficulty" class="form-control">
						  <option value="easy">Easy</option>
						  <option value="hard">Medium</option>
						  <option disabled value="hard">Hard</option>
						</select>
					</div>
				</div>
				<div>
					<table align="center">
						<tr>
							<td><input class="form-control box" readOnly id="box1" name="box1" value="" /></td>
							<td><input class="form-control box" readOnly id="box2" name="box2" value="" /></td>
							<td><input class="form-control box" readOnly id="box3" name="box3" value="" /></td>
						</tr>
						<tr>
							<td><input class="form-control box" readOnly id="box4" name="box4" value="" /></td>
							<td><input class="form-control box" readOnly id="box5" name="box5" value="" /></td>
							<td><input class="form-control box" readOnly id="box6" name="box6" value="" /></td>
						</tr>
						<tr>
							<td><input class="form-control box" readOnly id="box7" name="box7" value="" /></td>
							<td><input class="form-control box" readOnly id="box8" name="box8" value="" /></td>
							<td><input class="form-control box" readOnly id="box9" name="box9" value="" /></td>
						</tr>
					</table>
				</div>
			</form>
	</div>
</body>
</html>