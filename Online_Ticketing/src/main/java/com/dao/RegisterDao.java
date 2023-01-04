package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Member;

public class RegisterDao {
	
	private Connection conn;

	public RegisterDao(Connection conn) {
		
		this.conn = conn;
	}

	
	public String insert(Member member)
	{
		
		
		String result = "Data entered successfully";
		String sql = "insert into passenger values(?,?,?,?,?,?)";
		
		
		
		try {
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setString(1, member.getFullname());
			ps.setString(2, member.getPhone());
			ps.setString(3, member.getAddress());
			ps.setString(4, member.getAadhar());
			ps.setString(5, member.getTdate());
			ps.setString(6, member.getRdate());
		
		
			ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}

}