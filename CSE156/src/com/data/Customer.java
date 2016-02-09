package com.data;

import com.data.Person;

public class Customer {
	private String customerCode;
	private String customerType;
	private String customerName;
	private Address address;
	private Person person;
	private String personCode;
	

	public Customer(String customerCode, String customerType, String personCode,Person person, String customerName, Address address) {
		super();
		this.customerCode = customerCode;
		this.customerType = customerType;
		this.personCode = personCode;
		this.person = person;
		this.customerName = customerName;
		this.address = address;
	}
	
	public void setPerson(Person person){
		this.person = person;
	}
	
	public Person getPerson(){
		return this.person;
	}
	
	public void setCustomerCode(String customerCode){
		this.customerCode = customerCode;
	}
	
	public String getCustomerCode(){
		return this.customerCode;
	}
	
	public void setCustomerType(String customerType){
		this.customerType = customerType;
	}
	
	public String getCustomerType(){
		return this.customerType;
	}
	
	public void setPersonCode(String personCode){
		this.personCode = personCode;
	}
	
	public String getPersonCode(){
		return this.personCode;
	}
	
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	
	public String getCustomerName(){
		return this.customerName;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	public Address getAddress(){
		return this.address;
	}
	
}
