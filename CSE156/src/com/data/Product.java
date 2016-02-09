package com.data;

public class Product {

	private String productCode;
	private String productType;
	private String productName;
	private String fee;
	private String activationFee;
	private String annualFee;
	private Person person;
	private String serviceFee;
	private Person personCode;
	
	public Product(String productCode, String productType, String productName, String fee) {
		// TODO Auto-generated constructor stub
		this.productCode=productCode;
		this.productType=productType;
		this.productName=productName;
		this.fee=fee;
	}
	public Product(String productCode, String productType, String productName, String activationFee,
			String annualFee){
		this.productCode = productCode;
		this.productType = productType;
		this.productName = productName;
		this.activationFee = activationFee;
		this.annualFee=annualFee;
	}
	
	public Product(String productCode, String productType, String productName, Person personCode,
			String serviceFee){
		this.productCode = productCode;
		this.productType = productType;
		this.productName = productName;
		this.personCode=personCode;
		this.serviceFee=serviceFee;
		
	}
	
	
	//getters and Setters 
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getActivationFee() {
		return activationFee;
	}
	public void setActivationFee(String activationFee) {
		this.activationFee = activationFee;
	}
	public String getAnnualFee() {
		return annualFee;
	}
	public void setAnnualFee(String annualFee) {
		this.annualFee = annualFee;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Person getPersonCode() {
		return personCode;
	}
	public void setPersonCode(Person personCode) {
		this.personCode = personCode;
	}
	
	
	
	
}
