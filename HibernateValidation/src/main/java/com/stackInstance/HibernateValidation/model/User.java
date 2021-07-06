package com.stackInstance.HibernateValidation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int uId;
	
	// user name should not be null - or empty
	// user name should have atleast 4 char.
	@NotEmpty
	@Size(min = 4, message = "user name must be atleast of 4 char")
	private String uName;
	
	// email not be empty or null
	// email should be valid format
	@NotEmpty
	@Email
	private String uEmail;
	private String uCity;
	
	public User(int uId, String uName, String uEmail, String uCity) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uCity = uCity;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuCity() {
		return uCity;
	}
	public void setuCity(String uCity) {
		this.uCity = uCity;
	}
	
	

}
