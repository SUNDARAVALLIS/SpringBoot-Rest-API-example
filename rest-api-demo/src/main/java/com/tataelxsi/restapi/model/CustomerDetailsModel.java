package com.tataelxsi.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetailsModel {
    
	@Id
	@Column(name = "C_ID")
    private String customerId;
	
	@Column(name = "C_NAME")
    private String customerName;
	
	@Column(name = "C_NUMBER")
    private String customerMobileNumber;
	
	public CustomerDetailsModel() {}
	
	public CustomerDetailsModel(String customerId, String customerName, String customerMobileNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
    
    
}
