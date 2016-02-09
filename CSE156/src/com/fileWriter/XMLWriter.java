package com.fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.data.Customer;
import com.data.Person;
import com.data.Product;
import com.thoughtworks.xstream.XStream;

public class XMLWriter {

	public void xmlPerson(List<Person> persons) {
		XStream  xstream = new XStream();
		
        File xmlOutput = new File("data/Persons.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		xstream.alias("person", Person.class); 
		for(Person aPerson : persons) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(aPerson);
			xmlPrintWriter.write(personOutput);
		}
		xmlPrintWriter.close();	
	}
	public void xmlCustomer(List<Customer> customerList) {
		XStream  xstream = new XStream();
		
        File xmlOutput = new File("data/Customer.xml");
		
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		
		xstream.alias("customer", Customer.class); 
		for(Customer aCustomer : customerList) {
			// Use toXML method to convert Person object into a String
			String customerOutput = xstream.toXML(aCustomer);
			xmlPrintWriter.write(customerOutput);
		}
		xmlPrintWriter.close();	
	}
	public void xmlProduct(List<Product> productList) {
		// TODO Auto-generated method stub
		XStream  xstream = new XStream();
		 File xmlOutput = new File("data/Products.xml");
		 
		 PrintWriter xmlPrintWriter = null;
		 
		 try {
				xmlPrintWriter = new PrintWriter(xmlOutput);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		 xmlPrintWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		 
		 xstream.alias("product", Product.class); 
			for(Product aProduct : productList) {
				// Use toXML method to convert Person object into a String
				String productOutput = xstream.toXML(aProduct);
				xmlPrintWriter.write(productOutput);
			}
			xmlPrintWriter.close();	
		}
		
	}

