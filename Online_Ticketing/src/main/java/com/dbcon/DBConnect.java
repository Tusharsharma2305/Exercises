package com.dbcon;
import java.sql.*;
public class DBConnect {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
				if(con==null) {
				Class.forName("org.postgresql.Driver");//Load the driver to JVM
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/onlinedb", "postgres", "Password");
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
