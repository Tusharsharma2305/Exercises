package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {
		
		this.conn = conn;
	}

	public boolean register(User u) {
		boolean f = false;

		try {
			String query = "insert into users(name,email,phone,age,address,password) values(?,?,?,?,?,?) ";

			PreparedStatement ps = this.conn.prepareStatement(query);
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPhone());
			ps.setInt(4, u.getAge());
			ps.setString(5, u.getAddress());
			ps.setString(6, u.getPassword());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	public User login(String em, String psw) {
		User u = null;

		try {
			String sql = "select * from users where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, em);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setAge(rs.getInt(3));
				u.setAddress(rs.getString(4));
				u.setEmail(rs.getString(5));
				u.setPhone(rs.getString(6));
				u.setPassword(rs.getString(7));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return u;
	}
	
	public boolean update(User u) {
		 boolean f = false;
		 try {

	            String query = "update users set name=? , age=? , address=?  ,phone=? , password=? where  id =?";
	            PreparedStatement ps = this.conn.prepareStatement(query);
	           
	            ps.setString(1, u.getName());
	            ps.setInt(2, u.getAge());
	            ps.setString(3, u.getAddress());
	            ps.setString(4, u.getPhone());
	            ps.setString(5, u.getPassword());
	            ps.setInt(6, u.getId());

	            int ans = ps.executeUpdate();
	            if(ans>0) {
	            	 f = true;
	            }
	           

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return f;
	    }
	

}