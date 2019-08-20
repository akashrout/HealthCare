package com.hospital.login.bean;

import java.util.Date;

public class PatientUser {
	
	private String patient_id;
	private String patient_name;
	private String patient_password;
	private String patient_address;
	private String patient_gender;
	private String problems;
	private Date dob;
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_password() {
		return patient_password;
	}
	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getPatient_gender() {
		return patient_gender;
	}
	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}
	public String getProblems() {
		return problems;
	}
	public void setProblems(String problems) {
		this.problems = problems;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public PatientUser(String patient_id, String patient_name, String patient_password, String patient_address,
			String patient_gender, String problems, Date dob) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_password = patient_password;
		this.patient_address = patient_address;
		this.patient_gender = patient_gender;
		this.problems = problems;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "PatientUser [patient_id=" + patient_id + ", patient_name=" + patient_name + ", patient_password="
				+ patient_password + ", patient_address=" + patient_address + ", patient_gender=" + patient_gender
				+ ", problems=" + problems + ", dob=" + dob + "]";
	}
	
	
	

}
