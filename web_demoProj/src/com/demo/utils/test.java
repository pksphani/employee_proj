package com.demo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class test {
public static void main(String[] args) {
	Connection conn = null;
	   Statement stmt = null;
	   
		Properties prop = new Properties();
		InputStream input = null;
		String className=null;
		String url=null;
		String dbUserName =null;
		String dbPassword =null;

		try {

			input = new FileInputStream("config.properties");

							// load a properties file // how it is reading from project root folder
			prop.load(input);

			// get the property value and print it out
			className =prop.getProperty("driverClassName");
			url=prop.getProperty("url");
			dbUserName=prop.getProperty("dbuser");
			dbPassword=prop.getProperty("dbpassword");

		} catch (IOException ex) {
			ex.printStackTrace();
		} 
		

	 
	
	//register the driver
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","demo_own","demo_own");
/*			if(conn!=null)
	      {
	    	  System.err.println("connection established");
	    	stmt=  conn.createStatement();
	    	
	    int result=	stmt.executeUpdate(" delete from employee where emp_id =4");
	    
	    if (result>0) {
			
	    	System.out.println("sucessfully deleted");
		} else {
      System.out.println("delete failed");
		}
	      }else{
	    	  System.err.println("connection not established");
	      }
*/		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
/*				finally {
				conn.close();
			}
			
*/		
	
	//return conn;			
	finally {if (input != null) {
		try {
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
System.out.println(className);

}
	
}
