package com.hospital.login.bean;

import java.util.Date;

public class AdministratorUser {
	private String admin_name;
	private String admin_email;
	private String admin_password;
	private Date dob;
	private String gender;
	private String address;
	private String role;
	public AdministratorUser(String admin_name, String admin_email, String admin_password, Date dob, String gender,
			String address, String role) {
		super();
		this.admin_name = admin_name;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.role = role;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "AdministratorUser [admin_name=" + admin_name + ", admin_email=" + admin_email + ", admin_password="
				+ admin_password + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", role=" + role
				+ "]";
	}
	
	
	
	
}
