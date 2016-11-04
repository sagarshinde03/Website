$(document).ready(function($) {
	$( ".box" ).bind( "click", function(e) {
		e.currentTarget.value = "X";
		e.currentTarget.disabled = true;
		var data = [];
		var disabled = $("#form-ticTacToe").find(':input:disabled').removeAttr('disabled');
		data = $("#form-ticTacToe").serializeArray();
		disabled.attr('disabled','disabled');
		$.ajax({
		    url : '/home/ticTacToe/nextMove',
		    type : 'POST',
		    data: data,
		    success : function(data) {
		    	if(data.box1!="") {
		    		$("#box1")[0].value=data.box1;
		    		$("#box1")[0].disabled = true;
		    	}
		    	if(data.box2!="") {
		    		$("#box2")[0].value=data.box2;
		    		$("#box2")[0].disabled = true;
		    	}
		    	if(data.box3!="") {
		    		$("#box3")[0].value=data.box3;
		    		$("#box3")[0].disabled = true;
		    	}
		    	if(data.box4!="") {
		    		$("#box4")[0].value=data.box4;
		    		$("#box4")[0].disabled = true;
		    	}
		    	if(data.box5!="") {
		    		$("#box5")[0].value=data.box5;
		    		$("#box5")[0].disabled = true;
		    	}
		    	if(data.box6!="") {
		    		$("#box6")[0].value=data.box6;
		    		$("#box6")[0].disabled = true;
		    	}
		    	if(data.box7!="") {
		    		$("#box7")[0].value=data.box7;
		    		$("#box7")[0].disabled = true;
		    	}
		    	if(data.box8!="") {
		    		$("#box8")[0].value=data.box8;
		    		$("#box8")[0].disabled = true;
		    	}
		    	if(data.box9!="") {
		    		$("#box9")[0].value=data.box9;
		    		$("#box9")[0].disabled = true;
		    	}
		        if(data.message!=null){
		        	alert(data.message);
		        	document.getElementById("form-ticTacToe").reset();
		        	$("#form-ticTacToe").find(':input:disabled').removeAttr('disabled');
		        }
		    },
		    error : function(request,error)
		    {
		        alert("Internal error :(");
		    }
		});
	});
});