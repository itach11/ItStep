package com.aldebaran.run;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import com.aldebaran.dbconnect.CreateTable;
import com.aldebaran.dbconnect.DbConnector;
import com.aldebaran.student.Student;

public class Startup {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("StudentData.txt"));
		String line ;
		Student student = null ; 
		ArrayList<Student > studentsList = new ArrayList<>();		
		try {
			
			line=br.readLine();
			
			while((line=br.readLine())!=null)
			{
				
				String [] arr = line.split("\\s+");
				
				studentsList.add(new Student(arr[0],arr[1],arr[2],arr[3],arr[4],
						arr[5],arr[6],arr[7],arr[8],arr[9],arr[10]));
				
				
				
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			br.close();
		}
		
		for (Student st : studentsList) {
			System.out.println(st.toString());
		}

	
	
		
		Connection conn = null;
	      
		  
		  try{
			  
			  DbConnector db = DbConnector.getInstance();
	       
	        conn  = db.connectToDatabase();
	        CreateTable ct = new CreateTable();
	        ct.createTable(conn,"Student");
	        
	        }catch(SQLException sqle){
	            sqle.printStackTrace();
	        }finally{
	            try{
	            if(conn != null)conn.close();
	            }catch(SQLException sqle){
	                sqle.printStackTrace();
	            }

	        }
		
		
		
		
		
	
	}

	
}
