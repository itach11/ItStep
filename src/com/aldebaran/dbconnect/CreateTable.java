package com.aldebaran.dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	PreparedStatement  pstmt;
	
	public void createTable(Connection conn,String name) throws SQLException{
	       
		 
		 pstmt = conn.prepareStatement(" CREATE TABLE  ? IF NOT EXISTS?");
		 pstmt.setString(1, name);
       
		 ResultSet rs = pstmt.executeQuery();
      
	
	
}
}