$(document).ready(function(e){ //dès que le doc est chargé
	$('#loginform').submit(function(e){ //dès que le form est submit
		var website = "http://localhost:8080/HallOfGame/";
		//On récupère les valeurs entrées
		var user=$('#user').val();
		var pwd=$('#password').val();
		
		//On fait une requête ajax de type POST vers à l'url .../CheckCredentials
		$.ajax({
		    type: "POST",
		    url:"CheckCredentials",
		    data:{"user":user,"password":pwd},
		    success: function (data) { //Si la fonction s'est bien exécutée, on récupère les données de confirmation
		         if(data == "1"){ //Si le user et password sont bons, on lit les infos du cookie de session HoG
		        	 window.location.replace(website + "ReadCookies");
		         } else {
		        	 alert("Wrong Credentials");
		         }
		    }
		    
		});
	});	
});