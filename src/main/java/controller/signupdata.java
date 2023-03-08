package controller;

import java.sql.*;

public class signupdata {
	String url = "jdbc:mysql://localhost:3306/electric";
	String username = "root";
	String password = "Anella@1234567";
	 String DB_DRIVER = "com.mysql.jdbc.Driver";
	
	public void insert(resident member) {
		
		try {
			 Class.forName(DB_DRIVER);
			Connection connection = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO electric.resident1 (uname, email,phone,address,password) VALUES (?, ?, ?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, member.getUname());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPhone());
            ps.setString(4, member.getAddress());
            ps.setString(5, member.getPassword());
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
