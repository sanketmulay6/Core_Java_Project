package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee{

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/cg";
		String dbUsername="root";
		String dbPassword="Hiraj@";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to inert a rows
			String query="INSERT INTO EMPLOYEE (ID,Name,Salary)VALUES(?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 122);
			p.setString(2, "Ashi");
			p.setFloat(3, 36000);
			int r=p.executeUpdate();
			//if row>0 means at-least some rows are there
			if(r>0)
			{
				System.out.println("A new user is inserted successfully");
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}