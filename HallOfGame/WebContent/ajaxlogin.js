
$(document).ready(function(e){
	$('#loginform').submit(function(e){
		var website = "http://localhost:8080/HallOfGame/";
		var user=$('#user').val();
		var pwd=$('#password').val();
		
		$.ajax({
		    type: "POST",
		    url:"CheckCredentials",
		    data:{"user":user,"password":pwd},
		    success: function (data) {
		         if(data == "1"){
		        	 window.location.replace(website + "menu.jsp");
		         } else {
		        	 alert("Wrong Credentials");
		         }
		    }
		    
		});
	});	
});