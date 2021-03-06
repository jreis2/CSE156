package com.data;

import java.util.ArrayList;

public class Person {
	private String personCode;
	private String lastName;
	private String firstName;
	private Address address;
	private String[] email;

	public Person(String personCode, String lastName, String firstName, Address address, String[] email) {
		super();
		this.personCode = personCode;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.email = email;
	}

	public Person() {
		super();
	}

	public void setEmail(String[] email) {
		this.email = email;
	}
	
	public String[] getEmail(){
		return this.email;
	}

	public void setAddress(Address address) {
		this.address = address;		
	}
	
	public Address getAddress(){
		return this.address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;		
	}
	
	public String getFirstName(){
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;		
	}
	
	public String getLastName(){
		return this.lastName;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;		
	}
	
	public String getPersonCode(){
		return this.personCode;
	}
	
}
