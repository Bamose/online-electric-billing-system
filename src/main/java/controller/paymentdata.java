package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class paymentdata {
	String url = "jdbc:mysql://localhost:3306/electric";
	String username = "root";
	String password = "Anella@1234567";
	 String DB_DRIVER = "com.mysql.jdbc.Driver";
	
	public void insert(reciept member) {
		
		try {
			 Class.forName(DB_DRIVER);
			Connection connection = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO electric.paid_customer (paid_amount, month ,email ,accountnumber,paymentmethod,phonenumber) VALUES (?, ?, ?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, member.getPaid_amount());
            ps.setString(2, member.getMonth());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getAccountnumber());
            ps.setString(5, member.getPaymentmethod());
            ps.setString(6, member.getPhonenumber());
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
