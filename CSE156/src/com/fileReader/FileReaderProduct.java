package com.fileReader;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.data.Customer;
import com.data.Person;
import com.data.Product;

public class FileReaderProduct {
	public ArrayList<Product> readProduct() {
		Scanner sc = null;
			
			try {
				sc = new Scanner(new File("data/Products.dat"));
				sc.nextLine(); 
				
				ArrayList<Product> productList = new ArrayList<Product>();
				
				while(sc.hasNext()) {
					String line = sc.nextLine(); 
					String data[] = line.split(";");
					String fee= null;
//					String productCode = data[0];
//					String productType = data[1];
//					String productName = data[2];
					 String activationFee=null;
					switch(data[1]){
						case "E":
							String productCode = data[0];
							String productType = data[1];
							String productName = data[2];
							fee	   = data[3];
							if(data.length==3){
								fee=data[3];
								
							}
							Product equipment = new Product(productCode, productType, productName, fee);
							productList.add(equipment);
							break;
						case "S":
							 productCode 			= data[0];
							 productType 			= data[1];
							 productName 			= data[2];
							 activationFee   = data[3];
							 if(data.length==3){
								 activationFee=data[3];
							 }
							 String annualFee 		= data[4];
							 Product service = new Product(productCode, productType, productName, activationFee, annualFee);
							 productList.add(service);
							break;
						case "C":
							 productCode	   = data[0];
							 productType 	   = data[1];
							 productName	   = data[2];
							 String personCode = data[3];
							 String serviceFee = data[4];
							 Product consultation = new Product(productCode, productType, productName, personCode, serviceFee);
							 System.out.println(consultation);
							 productList.add(consultation);
							break;
					}
					
					
					//Product product = new Product(productCode, productType, productName, fee, activationFee, annualFee, personCode, serviceFee);
					
					//productList.add(product);
				}
				sc.close();
				return productList;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}	
		}

}

