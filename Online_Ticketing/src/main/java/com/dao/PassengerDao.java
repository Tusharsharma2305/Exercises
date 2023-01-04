package com.dao;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Member;

public class PassengerDao {
	
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

	
	public String insert(Member member)
	{
		
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into passenger values(?,?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, member.getFullname());
		ps.setString(2, member.getPhone());
		ps.setString(3, member.getAddress());
		ps.setString(4, member.getAadhar());
		
		
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}


}
