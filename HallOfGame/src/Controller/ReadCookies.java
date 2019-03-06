package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Account;

/**
 * Servlet implementation class ReadCookies
 */
@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//On récupère les cookies du Browser
		Cookie[] cookies = request.getCookies();
		for (Cookie r_c : cookies) {
			if(r_c.getName().equals("HoG_user")) { //Si il y a un cookie de session HoG
				//On créé un objet Account qui contiendra toutes les informations de la DB qui sont liés à ce nom
				Account admin = new Account(r_c.getValue(),"admin_pass",1);
				request.setAttribute("connectedAccount", admin); //On ajoute l'objet à la requête
				
				//Redirection Menu
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/menu.jsp");
				rd.forward(request, response);
			} else {
				
			}
		}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
