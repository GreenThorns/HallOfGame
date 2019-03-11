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
			
			//On r�cup�re les donn�es envoy�s par ajaxlogin.js
			String user = request.getParameter("user");
			String password = request.getParameter("password");

	        System.out.println(user);
	        System.out.println(password);
	        
	        //V�rification des donn�es
	        //VERIFICATION DATABASE ICI
	        if(user.equals("admin") && password.equals("admin_pass")) {
	        	
	        	//Si les donn�es sont bonnes, on cr�� le cookie de session HoG
	        	Cookie c_user = new Cookie("HoG_user", user);
				c_user.setMaxAge(60 * 60 * 24);
				response.addCookie(c_user);
	        	
				//On envoie la donn�e de confirmation � ajaxlogin.js (le "data" dans le success)
	        	out.write("1");
	        }
	        //Sinon on envoie aucune donn�e de confirmation
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
