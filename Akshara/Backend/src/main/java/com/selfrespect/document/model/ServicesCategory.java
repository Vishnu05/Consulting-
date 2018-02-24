package com.selfrespect.document.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "servicescategory")
public class ServicesCategory extends AbstractEntity {
	
	private static final long serialVersionUID = -6321180910534044219L;
	
	@Column
	String servicecategoryname;
	
	@Column
	String servicecategorydescription;

	public String getServicecategoryname() {
		return servicecategoryname;
	}

	public void setServicecategoryname(String servicecategoryname) {
		this.servicecategoryname = servicecategoryname;
	}

	public String getServicecategorydescription() {
		return servicecategorydescription;
	}

	public void setServicecategorydescription(String servicecategorydescription) {
		this.servicecategorydescription = servicecategorydescription;
	}

	
	
	
	

}
