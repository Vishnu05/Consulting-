package com.selfrespect.document.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client extends AbstractEntity {
	
	private static final long serialVersionUID = -6321180910534044216L;
	
	@Column
	String typeofClient;
	
	@Column
	Date ccDate;
	
	@Column
	String companyName;
	
	@Column
	String registrationName;
	
	@Column
	String registrationNumber;
	
	@Lob
	@Column
	byte[] rnumberDocument;
	
	@Column
	String gstNumber;
	
	@Lob
	@Column
	byte[] gstnumberDocument;
	
	@Column
	Date rDate;
	
	@Lob
	@Column
	byte[] rentalAgrement;
	
	@Column
	String co1Name;
	
	@Column
	String co2Name;
	
	@Column
	String co3Name;
	
	@Column
	String co4Name;
	
	@Column
	String co5Name;
	
	@Column
	Date co1Dob;
	
	@Column
	Date co2Dob;
	
	@Column
	Date co3Dob;
	
	@Column
	Date co4Dob;
	
	@Column
	Date co5Dob;
	
	
	@Column
	String pan1Number;
	
	@Column
	String pan2Number;
	
	@Column
	String pan3Number;
	
	@Column
	String pan4Number;
	
	@Column
	String pan5Number;
	
	@Lob
	@Column
	byte[] pan1Doc;
	
	@Lob
	@Column
	byte[] pan2Doc;
	
	@Lob
	@Column
	byte[] pan3Doc;
	
	@Lob
	@Column
	byte[] pan4Doc;
	
	@Lob
	@Column
	byte[] pan5Doc;
	
	@Column
	String aadharNumber1;
	
	@Column
	String aadharNumber2;
	
	@Column
	String aadharNumber3;
	
	@Column
	String aadharNumber4;
	
	@Column
	String aadharNumber5;
	
	@Lob
	@Column
	byte[] aadharNumber1Doc;
	
	@Lob
	@Column
	byte[] aadharNumber2Doc;
	
	@Lob
	@Column
	byte[] aadharNumber3Doc;
	
	@Lob
	@Column
	byte[] aadharNumber4Doc;
	
	@Lob
	@Column
	byte[] aadharNumber5Doc;
	
	
	@Column
	String contactNumber1;
	
	@Column
	String contactNumber2;
	
	@Column
	String contactNumber3;
	
	@Column
	String contactNumber4;
	
	@Column
	String contactNumber5;
	
	@Column
	String contactEmail1;
	
	@Column
	String contactEmail2;
	
	@Column
	String contactEmail3;
	
	@Column
	String contactEmail4;
	
	@Column
	String contactEmail5;
	
	@Column
	String registeredAddress;
	
	@Column
	String communictionAddress;
	
	@Column
	String bankName;
	
	@Column
	String bankbranchName;
	
	@Column
	String accountNumber;
	
	@Column
	String ifscNumber;
	
	@Lob
	@Column
	byte[] partnershipdeedDoc;
	
	@Lob
	@Column
	byte[] incorporationcertificateDoc;
	
	@Lob
	@Column
	byte[] moaDoc;
	
	@Lob
	@Column
	byte[] aoaDoc;
	
	@Column
	String directorName;
	
	@Column
	String directoridNumber;
	
	@Column
	String directorfatherName;
	
	@Column
	String directorspancardNumber;
	
	@Column
	String directorsaadharNumber;
	
	@Column
	String directorspresentAddress;
	
	@Column
	String directorspermanentAddress;
	
	@Column
	Date dateofAppointment;

	public String getTypeofClient() {
		return typeofClient;
	}

	public void setTypeofClient(String typeofClient) {
		this.typeofClient = typeofClient;
	}

	public Date getCcDate() {
		return ccDate;
	}

	public void setCcDate(Date ccDate) {
		this.ccDate = ccDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationName() {
		return registrationName;
	}

	public void setRegistrationName(String registrationName) {
		this.registrationName = registrationName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public byte[] getRnumberDocument() {
		return rnumberDocument;
	}

	public void setRnumberDocument(byte[] rnumberDocument) {
		this.rnumberDocument = rnumberDocument;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public byte[] getGstnumberDocument() {
		return gstnumberDocument;
	}

	public void setGstnumberDocument(byte[] gstnumberDocument) {
		this.gstnumberDocument = gstnumberDocument;
	}

	public Date getrDate() {
		return rDate;
	}

	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}

	public byte[] getRentalAgrement() {
		return rentalAgrement;
	}

	public void setRentalAgrement(byte[] rentalAgrement) {
		this.rentalAgrement = rentalAgrement;
	}

	public String getCo1Name() {
		return co1Name;
	}

	public void setCo1Name(String co1Name) {
		this.co1Name = co1Name;
	}

	public String getCo2Name() {
		return co2Name;
	}

	public void setCo2Name(String co2Name) {
		this.co2Name = co2Name;
	}

	public String getCo3Name() {
		return co3Name;
	}

	public void setCo3Name(String co3Name) {
		this.co3Name = co3Name;
	}

	public String getCo4Name() {
		return co4Name;
	}

	public void setCo4Name(String co4Name) {
		this.co4Name = co4Name;
	}

	public String getCo5Name() {
		return co5Name;
	}

	public void setCo5Name(String co5Name) {
		this.co5Name = co5Name;
	}
	
	

	public Date getCo1Dob() {
		return co1Dob;
	}

	public void setCo1Dob(Date co1Dob) {
		this.co1Dob = co1Dob;
	}

	public Date getCo2Dob() {
		return co2Dob;
	}

	public void setCo2Dob(Date co2Dob) {
		this.co2Dob = co2Dob;
	}

	public Date getCo3Dob() {
		return co3Dob;
	}

	public void setCo3Dob(Date co3Dob) {
		this.co3Dob = co3Dob;
	}

	public Date getCo4Dob() {
		return co4Dob;
	}

	public void setCo4Dob(Date co4Dob) {
		this.co4Dob = co4Dob;
	}

	public Date getCo5Dob() {
		return co5Dob;
	}

	public void setCo5Dob(Date co5Dob) {
		this.co5Dob = co5Dob;
	}

	public String getPan1Number() {
		return pan1Number;
	}

	public void setPan1Number(String pan1Number) {
		this.pan1Number = pan1Number;
	}

	public String getPan2Number() {
		return pan2Number;
	}

	public void setPan2Number(String pan2Number) {
		this.pan2Number = pan2Number;
	}

	public String getPan3Number() {
		return pan3Number;
	}

	public void setPan3Number(String pan3Number) {
		this.pan3Number = pan3Number;
	}

	public String getPan4Number() {
		return pan4Number;
	}

	public void setPan4Number(String pan4Number) {
		this.pan4Number = pan4Number;
	}

	public String getPan5Number() {
		return pan5Number;
	}

	public void setPan5Number(String pan5Number) {
		this.pan5Number = pan5Number;
	}

	public byte[] getPan1Doc() {
		return pan1Doc;
	}

	public void setPan1Doc(byte[] pan1Doc) {
		this.pan1Doc = pan1Doc;
	}

	public byte[] getPan2Doc() {
		return pan2Doc;
	}

	public void setPan2Doc(byte[] pan2Doc) {
		this.pan2Doc = pan2Doc;
	}

	public byte[] getPan3Doc() {
		return pan3Doc;
	}

	public void setPan3Doc(byte[] pan3Doc) {
		this.pan3Doc = pan3Doc;
	}

	public byte[] getPan4Doc() {
		return pan4Doc;
	}

	public void setPan4Doc(byte[] pan4Doc) {
		this.pan4Doc = pan4Doc;
	}

	public byte[] getPan5Doc() {
		return pan5Doc;
	}

	public void setPan5Doc(byte[] pan5Doc) {
		this.pan5Doc = pan5Doc;
	}

	public String getAadharNumber1() {
		return aadharNumber1;
	}

	public void setAadharNumber1(String aadharNumber1) {
		this.aadharNumber1 = aadharNumber1;
	}

	public String getAadharNumber2() {
		return aadharNumber2;
	}

	public void setAadharNumber2(String aadharNumber2) {
		this.aadharNumber2 = aadharNumber2;
	}

	public String getAadharNumber3() {
		return aadharNumber3;
	}

	public void setAadharNumber3(String aadharNumber3) {
		this.aadharNumber3 = aadharNumber3;
	}

	public String getAadharNumber4() {
		return aadharNumber4;
	}

	public void setAadharNumber4(String aadharNumber4) {
		this.aadharNumber4 = aadharNumber4;
	}

	public String getAadharNumber5() {
		return aadharNumber5;
	}

	public void setAadharNumber5(String aadharNumber5) {
		this.aadharNumber5 = aadharNumber5;
	}

	public byte[] getAadharNumber1Doc() {
		return aadharNumber1Doc;
	}

	public void setAadharNumber1Doc(byte[] aadharNumber1Doc) {
		this.aadharNumber1Doc = aadharNumber1Doc;
	}

	public byte[] getAadharNumber2Doc() {
		return aadharNumber2Doc;
	}

	public void setAadharNumber2Doc(byte[] aadharNumber2Doc) {
		this.aadharNumber2Doc = aadharNumber2Doc;
	}

	public byte[] getAadharNumber3Doc() {
		return aadharNumber3Doc;
	}

	public void setAadharNumber3Doc(byte[] aadharNumber3Doc) {
		this.aadharNumber3Doc = aadharNumber3Doc;
	}

	public byte[] getAadharNumber4Doc() {
		return aadharNumber4Doc;
	}

	public void setAadharNumber4Doc(byte[] aadharNumber4Doc) {
		this.aadharNumber4Doc = aadharNumber4Doc;
	}

	public byte[] getAadharNumber5Doc() {
		return aadharNumber5Doc;
	}

	public void setAadharNumber5Doc(byte[] aadharNumber5Doc) {
		this.aadharNumber5Doc = aadharNumber5Doc;
	}

	public String getContactNumber1() {
		return contactNumber1;
	}

	public void setContactNumber1(String contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	public String getContactNumber2() {
		return contactNumber2;
	}

	public void setContactNumber2(String contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}

	public String getContactNumber3() {
		return contactNumber3;
	}

	public void setContactNumber3(String contactNumber3) {
		this.contactNumber3 = contactNumber3;
	}

	public String getContactNumber4() {
		return contactNumber4;
	}

	public void setContactNumber4(String contactNumber4) {
		this.contactNumber4 = contactNumber4;
	}

	public String getContactNumber5() {
		return contactNumber5;
	}

	public void setContactNumber5(String contactNumber5) {
		this.contactNumber5 = contactNumber5;
	}

	public String getContactEmail1() {
		return contactEmail1;
	}

	public void setContactEmail1(String contactEmail1) {
		this.contactEmail1 = contactEmail1;
	}

	public String getContactEmail2() {
		return contactEmail2;
	}

	public void setContactEmail2(String contactEmail2) {
		this.contactEmail2 = contactEmail2;
	}

	public String getContactEmail3() {
		return contactEmail3;
	}

	public void setContactEmail3(String contactEmail3) {
		this.contactEmail3 = contactEmail3;
	}

	public String getContactEmail4() {
		return contactEmail4;
	}

	public void setContactEmail4(String contactEmail4) {
		this.contactEmail4 = contactEmail4;
	}

	public String getContactEmail5() {
		return contactEmail5;
	}

	public void setContactEmail5(String contactEmail5) {
		this.contactEmail5 = contactEmail5;
	}

	public String getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getCommunictionAddress() {
		return communictionAddress;
	}

	public void setCommunictionAddress(String communictionAddress) {
		this.communictionAddress = communictionAddress;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankbranchName() {
		return bankbranchName;
	}

	public void setBankbranchName(String bankbranchName) {
		this.bankbranchName = bankbranchName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscNumber() {
		return ifscNumber;
	}

	public void setIfscNumber(String ifscNumber) {
		this.ifscNumber = ifscNumber;
	}

	public byte[] getPartnershipdeedDoc() {
		return partnershipdeedDoc;
	}

	public void setPartnershipdeedDoc(byte[] partnershipdeedDoc) {
		this.partnershipdeedDoc = partnershipdeedDoc;
	}

	public byte[] getIncorporationcertificateDoc() {
		return incorporationcertificateDoc;
	}

	public void setIncorporationcertificateDoc(byte[] incorporationcertificateDoc) {
		this.incorporationcertificateDoc = incorporationcertificateDoc;
	}

	public byte[] getMoaDoc() {
		return moaDoc;
	}

	public void setMoaDoc(byte[] moaDoc) {
		this.moaDoc = moaDoc;
	}

	public byte[] getAoaDoc() {
		return aoaDoc;
	}

	public void setAoaDoc(byte[] aoaDoc) {
		this.aoaDoc = aoaDoc;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDirectoridNumber() {
		return directoridNumber;
	}

	public void setDirectoridNumber(String directoridNumber) {
		this.directoridNumber = directoridNumber;
	}

	public String getDirectorfatherName() {
		return directorfatherName;
	}

	public void setDirectorfatherName(String directorfatherName) {
		this.directorfatherName = directorfatherName;
	}

	public String getDirectorspancardNumber() {
		return directorspancardNumber;
	}

	public void setDirectorspancardNumber(String directorspancardNumber) {
		this.directorspancardNumber = directorspancardNumber;
	}

	public String getDirectorsaadharNumber() {
		return directorsaadharNumber;
	}

	public void setDirectorsaadharNumber(String directorsaadharNumber) {
		this.directorsaadharNumber = directorsaadharNumber;
	}

	public String getDirectorspresentAddress() {
		return directorspresentAddress;
	}

	public void setDirectorspresentAddress(String directorspresentAddress) {
		this.directorspresentAddress = directorspresentAddress;
	}

	public String getDirectorspermanentAddress() {
		return directorspermanentAddress;
	}

	public void setDirectorspermanentAddress(String directorspermanentAddress) {
		this.directorspermanentAddress = directorspermanentAddress;
	}

	public Date getDateofAppointment() {
		return dateofAppointment;
	}

	public void setDateofAppointment(Date dateofAppointment) {
		this.dateofAppointment = dateofAppointment;
	}
	
	

}
