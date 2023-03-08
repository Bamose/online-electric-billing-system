package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class paid_customer
 */
public class paid_customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paid_customer() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Email = null;
		String phone = request.getParameter("phone");
		String paymentmethod = request.getParameter("paymentmethod");
		String month = request.getParameter("month");
		String accountnumber = request.getParameter("account");
	
		Cookie[] cookies = request.getCookies(); // retrieve all cookies from the request
		String email = null; // initialize a variable to hold the email address

		if (cookies != null) { // check if cookies exist
		  for (Cookie cookie : cookies) { // loop through all cookies
		    if (cookie.getName().equals("email")) { // check if cookie is the one containing the email address
		      email = cookie.getValue(); // retrieve the value of the email cookie
		      break; // exit the loop once the email cookie is found
		    }
		  }
		}

		if (email != null) { // check if email was retrieved successfully
		 Email = email;
		} else {
		  // handle case where email cookie was not found
		}

		String paid_amount = (String) request.getSession().getAttribute("paid_amount");
		reciept customer = new reciept();
		
		customer.setEmail(Email);
		customer.setPaymentmethod(paymentmethod);
		customer.setMonth(month);
		customer.setPaid_amount(paid_amount);
		customer.setPhonenumber(phone);
		customer.setAccountnumber(accountnumber);
		
		paymentdata pay = new paymentdata();
		pay.insert(customer);
	}

}
