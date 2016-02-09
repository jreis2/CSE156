package com.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.data.Address;
import com.data.Customer;
import com.data.Person;

public class FileReaderPerson {
	public ArrayList<Person> readPersons() {
		Scanner sc = null;
			
			try {
				sc = new Scanner(new File("data/Persons.dat"));
				sc.nextLine(); 
				
				ArrayList<Person> personList = new ArrayList<Person>();
				
				while(sc.hasNext()) {
					String line = sc.nextLine(); 
					String data[] = line.split(";");
					String email[] = null;
					
					String personCode = data[0];
					String name[] 		= data[1].split(",");
					String lastName 	= name[0];
					String firstName 	= name[1];
					String addressArray[]	= data[2].split(",");
					if(data.length == 4){
						email 	    = data[3].split(",");
					}
					String street 		= addressArray[0];
					String city 		= addressArray[1];
					String state 		= addressArray[2];
					String zip 			= addressArray[3];
					String country		= addressArray[4];
					
					
					
					Address address = new Address(street, city, state, zip, country);
					
					
					Person person = new Person(personCode, lastName, firstName, address, email);
//					System.out.println(person);
//					System.out.println("");
					
					personList.add(person);
				}
				sc.close();
				return personList;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}	
		}

}
