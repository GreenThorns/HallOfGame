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
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Cette fonction se lance dès qu'on arrive sur le site ou qu'on recharge la page
		
		boolean cookie_found = false;
		//On récupère les cookies du Browser et on regarde si on en a un qui appartient à HoG
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie r_c : cookies) {
				if(r_c.getName().equals("HoG_user")) {
					cookie_found = true;
					//Le Cookie existe donc on passe directement à sa lecture
					RequestDispatcher rd_readcookies = request.getRequestDispatcher("/ReadCookies");
					rd_readcookies.forward(request, response);
				}
			}
			
			//Si il y a des cookies mais aucun qui appartient à HoG, on passe au formulaire de connexion
			if(cookie_found) {
				
			} else {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginform.jsp");
				rd.forward(request, response);
			}
		//Si il n'y a aucun cookies, on passe au formulaire de connexion	
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginform.jsp");
			rd.forward(request, response);
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
