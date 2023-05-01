package com.modelclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname,lname,address,email,password ,gender , subjects;
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	private long pnumber;
	public model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public model(int id, String fname, String lname, String address, String email, String password, String gender,
			long pnumber) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.pnumber = pnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPnumber() {
		return pnumber;
	}
	public void setPnumber(long pnumber) {
		this.pnumber = pnumber;
	}
	@Override
	public String toString() {
		return "model [id=" + id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", gender=" + gender + ", subjects=" + subjects + ", pnumber=" + pnumber
				+ "]";
	}
	
	
 	    
  	
}
	

