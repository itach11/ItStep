package com.aldebaran.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector 
{
	private static DbConnector instance =null; 
	
	private DbConnector()
	{}
	
	//Singleton get only 1 instance of the DB connection
	public static DbConnector getInstance()
	{
		if(instance==null)
			instance = new DbConnector();
		
		
		return instance;
	}

	public Connection connectToDatabase() {
		Connection conn = null;

		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:-Students.db");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return conn;
	}
  
}
