package com.selfrespect.document.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {

	private static final long serialVersionUID = -6321180910534044216L;

	@Column
	String firstName;

	@Column
	String lastName;

	@Column
	String aadharNo;
	
	@Lob
	@Column
	byte[] photo;
	
	@Column
	String panNo;
	
	@Column
	String mobileNo;
	
	@Column
	Date dob;
	
	@Column
	String email;
	
	@Column
	String otherContactNo;
	
	@Column
	String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOtherContactNo() {
		return otherContactNo;
	}

	public void setOtherContactNo(String otherContactNo) {
		this.otherContactNo = otherContactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
