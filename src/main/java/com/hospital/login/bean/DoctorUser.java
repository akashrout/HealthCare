package com.hospital.login.bean;

import java.util.Date;

public class DoctorUser {
	
	private String doctor_id;
	private String doctor_name;
	private String doctor_password;
	private String doctor_address;
	private String doctor_gender;
	private String specification;
	private String qualification;
	private Date dob;
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getDoctor_password() {
		return doctor_password;
	}
	public void setDoctor_password(String doctor_password) {
		this.doctor_password = doctor_password;
	}
	public String getDoctor_address() {
		return doctor_address;
	}
	public void setDoctor_address(String doctor_address) {
		this.doctor_address = doctor_address;
	}
	public String getDoctor_gender() {
		return doctor_gender;
	}
	public void setDoctor_gender(String doctor_gender) {
		this.doctor_gender = doctor_gender;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public DoctorUser(String doctor_id, String doctor_name, String doctor_password, String doctor_address,
			String doctor_gender, String specification, String qualification, Date dob) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doctor_password = doctor_password;
		this.doctor_address = doctor_address;
		this.doctor_gender = doctor_gender;
		this.specification = specification;
		this.qualification = qualification;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "DoctorUser [doctor_id=" + doctor_id + ", doctor_name=" + doctor_name + ", doctor_password="
				+ doctor_password + ", doctor_address=" + doctor_address + ", doctor_gender=" + doctor_gender
				+ ", specification=" + specification + ", qualification=" + qualification + ", dob=" + dob + "]";
	}
	
	
	

}
