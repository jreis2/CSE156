package com.fileReader;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.data.Address;
import com.data.Customer;
import com.data.Person;

public class FileReaderCustomer {
	public ArrayList<Customer> readCustomer() {
		Scanner sc = null;
			
			try {
				sc = new Scanner(new File("data/Customers.dat"));
				sc.nextLine(); 
				
				ArrayList<Customer> customerList = new ArrayList<Customer>();
				
				while(sc.hasNext()) {
					String line = sc.nextLine(); 
					String data[] = line.split(";");
					
					String customerCode = data[0];
					String customerType = data[1];
					String personCode 	= data[2];
					String customerName     = data[3];
					String addressArray[]	= data[4].split(",");
					String street 		= addressArray[0];
					String city 		= addressArray[1];
					String state 		= addressArray[2];
					String zip 			= addressArray[3];
					String country		= addressArray[4];

					
					
					Address address = new Address(street, city, state, zip, country);
					Person person = new Person();
					Customer customer = new Customer(customerCode, customerType, personCode, person, customerName, address);
				//	System.out.println(person);
					
					customerList.add(customer);
				}
				sc.close();
				return customerList;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}	
		}

}
