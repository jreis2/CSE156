package com.output;


import java.util.List;

import com.data.Customer;
import com.data.Person;
import com.data.Product;
import com.fileReader.FileReaderCustomer;
import com.fileReader.FileReaderPerson;
import com.fileReader.FileReaderProduct;
import com.fileWriter.JsonWriter;
import com.fileWriter.XMLWriter;

public class DataTransfer {

	public static void main(String[] args) {
			
		// Create a FlatFileReader object
		FileReaderPerson fp = new FileReaderPerson();

		List<Person> personList = fp.readPersons();
			
		// Write Person ArrayList into a Json file
		JsonWriter jWriter = new JsonWriter();
		jWriter.jsonPerson(personList);
			
		// Write Person ArrayList into an XML file
		 XMLWriter xmlWriter = new XMLWriter();
		 xmlWriter.xmlPerson(personList);
		
	
	// Create a FlatFileReader object
		FileReaderCustomer fc = new FileReaderCustomer();

		List<Customer> customerList = fc.readCustomer();
				
		// Write Person ArrayList into a Json file
		jWriter.jsonCustomer(customerList);
				
		// Write Person ArrayList into an XML file
		 xmlWriter.xmlCustomer(customerList);
		 
		 
		// Create a FlatFileReader object
			FileReaderProduct fpp = new FileReaderProduct();

			List<Product> productList = fpp.readProduct();
					
			// Write Person ArrayList into a Json file
			jWriter.jsonProduct(productList);
					
			// Write Person ArrayList into an XML file
			 xmlWriter.xmlProduct(productList);
		 
		 
		 
		}
	
	}

