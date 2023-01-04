package com.entity;
public class Member {
	
	private String fullname, phone, address, aadhar, tdate, rdate;

	
	public Member() {
		super();
	}

	public Member(String fullname, String phno, String address, String aadhar, String tdate, String rdate) {
		super();
		this.fullname = fullname;
		this.phone = phno;
		this.address = address;
		this.aadhar = aadhar;
		this.tdate = tdate;
		this.rdate = rdate;
	}
	

	public Member(String fullname, String phone, String address, String aadhar) {
		super();
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
		this.aadhar = aadhar;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhno(String phno) {
		this.phone = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getTdate() {
		return tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
    


}