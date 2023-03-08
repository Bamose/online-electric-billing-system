package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Signup
 */
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	signupdata signupdata = new signupdata();
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		resident Resident = new resident();
		
		
		if(request.getParameter("resident") != null) {
			Resident.setUname(uname);
			Resident.setEmail(email);
			Resident.setPhone(phone);
			Resident.setAddress(address);
			Resident.setPassword(password);
			
			signupdata.insert(Resident);
			request.getRequestDispatcher("/login.jsp").forward(request, response);;
	
			
		}
	}

}
