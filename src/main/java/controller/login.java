package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String url = "jdbc:mysql://localhost:3306/electric";
		String username = "root";
		String pass = "Anella@1234567";
		String DB_DRIVER = "com.mysql.jdbc.Driver";
		
		try (
		    Connection connection = DriverManager.getConnection(url, username, pass);
		    PreparedStatement stmt = connection.prepareStatement("SELECT * FROM residents WHERE email = ? AND password = ?");
		) {
		    stmt.setString(1, email);
		    stmt.setString(2, password);
		    ResultSet rs = stmt.executeQuery();

		    if (rs.next()) {
		        // If a resident is found, set a session attribute and create a cookie
		        request.getSession().setAttribute("email", email);

		        Cookie emailCookie = new Cookie("email", email);
		        emailCookie.setMaxAge(60 * 60 * 24 * 30); // Set the cookie to expire after 30 days
		        response.addCookie(emailCookie);

		        response.sendRedirect(request.getContextPath() + "/Home.jsp");
		    } else {
		        // If no resident is found, show an error message
		        request.setAttribute("error", "Invalid email or password");
		        request.getRequestDispatcher("/login.jsp").forward(request, response);
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}


}
