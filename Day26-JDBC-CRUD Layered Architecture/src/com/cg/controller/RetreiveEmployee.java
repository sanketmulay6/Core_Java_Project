package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetreiveEmployee
{
	public static void main(String[] args) throws SQLException {
	String dbURL="jdbc:mysql://localhost:3306/cg";
	String dbUsername="root";
	String dbPassword="Hiraj@";
	try
	{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		//To retrieve a data 
		String query="SELECT * FROM EMPLOYEE";
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery(query);
		//int count=0;
		while(r.next())
		{
			int id=r.getInt(1);
			String name=r.getString(2);
			float salary=r.getFloat(3);
			
			String output="User :%d- %s %f";
			System.out.println(String.format(output, id,name,salary));
		}
		c.close();
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	

	}


}