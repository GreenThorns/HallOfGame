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
			
			String user = request.getParameter("user");
			String password = request.getParameter("password");

	        System.out.println(user);
	        System.out.println(password);
	        
	        /*Cookie c_user = new Cookie("user", user);
			c_user.setMaxAge(60 * 60 * 24);
			response.addCookie(c_user);
			
			Cookie c_password = new Cookie("password", password);
			c_password.setMaxAge(60 * 60 * 24);
			response.addCookie(c_password);*/
	        
	        if(user.equals("admin") && password.equals("admin_pass")) {
	        	out.write("1");
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
