package Exercise;

import java.sql.*;


public class PatientCRUD {
	
	
	public static boolean insert(Patient p) {
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "insert into patient(Id,Name,Age,Address,Disease,Payment,DoctorName) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,p.getId());
			ps.setString(2, p.getName());
			ps.setInt(3, p.getAge());
			ps.setString(4, p.getAddress());
			ps.setString(5,p.getDistype());
			ps.setString(6, p.getPayment());
			ps.setString(7, p.getDoctor());
			
			ps.executeUpdate();
			
			f=true;
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return f;
		
	}
	
	
	
	public static void display() {
		
		try {
			Connection con = CP.createc();
			String query = "select * from patient ORDER BY id DESC LIMIT 1";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String Address = rs.getString(4);
				String Disease = rs.getString(5);
				String payment = rs.getString(6);
				String Doctor = rs.getString(7);
				System.out.println("----------------------------------------------");
				System.out.println("Patient ID : " + id + " \nPatient Name : " + name + " \nPatient Age : " + age + " \nPatient Address : " + Address + " \nPatient Disease Type : " + Disease + " \nPatient Payment status : " + payment + " \nPatient's Doctor: " + Doctor);
				System.out.println("----------------------------------------------");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
public static void displayAll() {
		
		try {
			Connection con = CP.createc();
			String query = "select * from patient ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String Address = rs.getString(4);
				String Disease = rs.getString(5);
				String payment = rs.getString(6);
				String Doctor = rs.getString(7);
				System.out.println("----------------------------------------------");
				System.out.println("Patient ID : " + id + " \nPatient Name : " + name + " \nPatient Age : " + age + " \nPatient Address : " + Address + " \nPatient Disease Type : " + Disease + " \nPatient Payment status : " + payment + " \nPatient's Doctor: " + Doctor);
				System.out.println("----------------------------------------------");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static boolean update(int val,String toUpdate,int id,Patient p) throws SQLException  {
		boolean f = false;
		try {
			Connection con = CP.createc();
			if(val == 1) {
				//Update Name
				
					String query = "update patient set name=? where id=? ";
					PreparedStatement ps = con.prepareStatement(query);
					
						ps.setString(1, toUpdate);
					
						ps.setInt(2, id);
					
					// id -> age , age = 10 , website--> age > 20
					
					//execute..
					int ans = ps.executeUpdate();
					if(ans>0)
					{
						f = true;
					}
			}
			if(val == 2) {
				//Update address
				
					String query = "update patient set address=? where id=? ";
					PreparedStatement ps = con.prepareStatement(query);
					
						ps.setString(1, toUpdate);
					
						ps.setInt(2, id);
					
					// id -> age , age = 10 , website--> age > 20
					
					//execute..
					int ans = ps.executeUpdate();
					if(ans>0)
					{
						f = true;
					}
			}
			if(val == 3) {
				//Update payment status
				
					String query = "update patient set payment=? where id=? ";
					PreparedStatement ps = con.prepareStatement(query);
					
						ps.setString(1, toUpdate);
					
						ps.setInt(2, id);
					
					
					
					//execute..
					int ans = ps.executeUpdate();
					if(ans>0)
					{
						f = true;
					}
			}
			
			
		}	
		catch(SQLException e) {
			System.out.println("Exception Occured");;
		}
		return f;
	}
	public static boolean delete(int pid) {
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "delete from patient where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, pid);
			
			int ans = ps.executeUpdate();
			if(ans>0)
			{
				f = true;
			}
			
		}
		catch (Exception e) {
				System.out.println(e);
		}
		return f;
	}
	
	
	

}
