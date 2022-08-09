package com.cg.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudInsert {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Hiraj@";
		try {
			Connection c= DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			String query="INSERT INTO EMPLOYEE(ID,NAME,EMAIL,PASSWORD )VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 101);
			p.setString(2,"JHON");
			p.setString(3,"JHON@gmail.com");
			p.setString(4,"JHON@123");
			p.setInt(1, 102);
			p.setString(2,"JON");
			p.setString(3,"JON@gmail.com");
			p.setString(4,"JON@123");
			p.setInt(1, 103);
			p.setString(2,"JON");
			p.setString(3,"JON@gmail.com");
			p.setString(4,"JON@123");
			int r= p.executeUpdate();
			//if row>0 it means atleast some rows aree there 
			if(r>0) {
				System.out.println("A new user is Inserted Successfully");
				}
			c.close();
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}