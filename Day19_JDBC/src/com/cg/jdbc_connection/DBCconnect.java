package com.cg.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCconnect {

	public static void main(String[] args) throws SQLException {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/cg";
		String dbUsername="root";
		String dbPassword="Hiraj@";
		String query="SELECT * FROM STUDENT";
		try {
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		Connection c= DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery(query);
		while(r.next()) {
			String data="";
			for (int i=1;i<=2;i++) {
				data=data+" "+r.getString(i);
			}
			System.out.println(data);
			}
		}
	catch(SQLException e) {
	
		System.out.println("Invalid");
		e.printStackTrace();
		
		}

	}
}