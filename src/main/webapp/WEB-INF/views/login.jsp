<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta name="description" content="Login form">
	<meta name="author" content="Sagar Shinde">
    <title>Login form</title>
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
        <div class="panel panel-info" >
	        <div class="panel-heading">
	            <div class="panel-title">Login</div>
	            <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
	        </div>
	     	<div style="padding-top:30px" class="panel-body" >
	         	<font color="red">
					<span>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
				</font>
	         	<form id="loginform" class="form-horizontal" action="j_spring_security_check" method="POST">
	             	<div style="margin-bottom: 25px" class="input-group">
	                 	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i>
	                 	</span>
	                    <input id="login-username" type="text" class="form-control" name="j_username" value="" placeholder="Email">
	                </div>
	             	<div style="margin-bottom: 25px" class="input-group">
	                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
	                    <input id="login-password" type="password" class="form-control" name="j_password" placeholder="Password">
	                </div>
	                <div style="margin-top:10px" class="form-group">
	                    <div class="col-sm-12 controls">
	                        <button class="btn btn-primary" type="submit">Login</button>
	                    </div>
	                </div>
	                <div class="form-group">
	                    <div class="col-md-12 control">
	                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:150%" >
	                            Don't have an account!
	                        	<a href="/signup">Sign Up Here</a>
	                        </div>
	                    </div>
                	</div>
	            </form>
	        </div>                     
    	</div>  
    </div>
</body>
</html>