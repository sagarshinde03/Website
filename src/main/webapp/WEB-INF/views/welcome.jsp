<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <script src="<c:url value="/resources/js/jquery-3.1.0.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
</head>
<body>
	<div id="signupsuccess" style="margin: auto; margin-top:50px; width: 50%;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="form-group">
        	<div class="col-md-12 control" align="justify" style="font-size:180%">
                <span>This website has been created for anyone who likes playing games. 
                You have to create an account website. Then you can play games and check how many games were won/lost/tied. 
                Currently there is only Tic-Tac-Toe but I am planning to introduce few more.</span>
            </div>
            <div class="col-md-12 control">
                <div style="border-top: 1px solid#888; padding-top:15px; font-size:150%" >
                	<a style="font-size:150%" href="/signup">Signup</a>
                	<br>
                	<a style="font-size:150%" href="/login">Login</a>
                </div>
            </div>
            <p align="right">
            	<a style="font-size:150%" target="_blank" href="/about-me">About the developer</a>
            </p>
       	</div>
    </div>
	<div>
		<h1></h1>
	</div>
</body>
</html>