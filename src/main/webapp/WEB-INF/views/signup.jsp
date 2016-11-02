<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Sign Up form</title>
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
		.form-control { margin-bottom: 10px; }
    </style>
</head>
<body>
	<div style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info" >
	        <div class="panel-heading">Sign up</div>
	     	<div style="padding-top:30px" class="panel-body">
	     		<form:errors style="color:red" path="user.*"/>
	         	<form class="form-horizontal" action="submitSignupDetails" method="POST">
	         		<div class="row">
			            <div class="col-xs-6 col-md-6">
			                <input class="form-control" name="firstname" placeholder="First Name" type="text" required autofocus />
			            </div>
			            <div class="col-xs-6 col-md-6">
			                <input class="form-control" name="lastname" placeholder="Last Name" type="text" required />
			            </div>
			        </div>
			        <input class="form-control" name="username" placeholder="Your Email" type="email" required />
			        <input class="form-control" name="password" placeholder="Password" type="password" required />
			        <input class="form-control" name="confirmPassword" placeholder="Confirm Password" type="password" required />
			        <button class="btn btn-primary" type="submit">Sign up</button>
	            </form>
	         </div>                     
    	</div>  
    </div>
</body>
</html>
