package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Account;

/**
 * Servlet implementation class CheckCredentials
 */
@WebServlet("/CheckCredentials")
public class CheckCredentials extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckCredentials() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			
			//On récupère les données envoyés par ajaxlogin.js
			String user = request.getParameter("user");
			String password = request.getParameter("password");

	        System.out.println(user);
	        System.out.println(password);
	        
	        //Vérification des données
	        //VERIFICATION DATABASE ICI
	        if(user.equals("admin") && password.equals("admin_pass")) {
	        	
	        	//Si les données sont bonnes, on créé le cookie de session HoG
	        	Cookie c_user = new Cookie("HoG_user", user);
				c_user.setMaxAge(60 * 60 * 24);
				response.addCookie(c_user);
	        	
				//On envoie la donnée de confirmation à ajaxlogin.js (le "data" dans le success)
	        	out.write("1");
	        }
	        //Sinon on envoie aucune donnée de confirmation
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
