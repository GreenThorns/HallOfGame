$(document).ready(function(){
	$("#disconnect").click(function(){
		var website = "http://localhost:8080/HallOfGame/";
		$.ajax({
			type: "GET",
			url:"KillCookies",
			success: function (data) { 
			    window.location.replace(website);  
			}
			    
		});	
	});
});