package com.Try.Hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HotelManagement")
public class Hotel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "First_Name",length = 20)
	private String FirstName;
	
	@Column(name = "Middle_Name",length = 30)
	private String MiddleName;
	
	@Column(name = "Last_Name",length = 30)
	private String LastName;
	
	@Column(name = "Aadhar_No",length = 15)
	private int AadharNo;
	
	@Column(name = "Phone_No",length = 15)
	private int PhoneNo;
	
	@Column(name = "Email",length = 30)
	private String email;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String firstName, String middleName, String lastName, int aadharNo, int phoneNo, String email) {
		super();
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		AadharNo = aadharNo;
		PhoneNo = phoneNo;
		this.email = email;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(int aadharNo) {
		AadharNo = aadharNo;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
}
