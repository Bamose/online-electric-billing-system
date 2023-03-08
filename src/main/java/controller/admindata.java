package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class admindata {
	  private static final String URL = "jdbc:mysql://localhost:3306/electric";
	    private static final String USER = "root";
	    private static final String PASSWORD = "Anella@1234567";

	    public static List<admintable> getpaidcustomers() throws SQLException {
	        Connection conn = null;
	        PreparedStatement stmt = null;
	        ResultSet rs = null;
	        List<admintable> customers = new ArrayList<>();

	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            stmt = conn.prepareStatement("SELECT electric.resident1.uname, electric.paidcustomer.email,electric.paidcustomer.address electric.paidcustomer.paid_amount"
	            		+ "FROM paidcustomer"
	            		+ "LEFT JOIN Orders ON electric.paidcustomer.email = electric.resident1.email"
	            		+ "WHERE electric.paidcustomer.email is NOT NULL");
	            rs = stmt.executeQuery();

	            while (rs.next()) {
	                admintable customer = new admintable();
	                customer.setName("uname");
	                customer.setEmail("email");
	                customer.setAddress("address");
	                customer.setPaid_amount("paid_amount");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            if (rs != null) rs.close();
	            if (stmt != null) stmt.close();
	            if (conn != null) conn.close();
	        }

	        return customers;
	    }
	}

