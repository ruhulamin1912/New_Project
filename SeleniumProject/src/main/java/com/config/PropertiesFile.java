package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
	
	public static void readProperties() throws IOException {
		FileInputStream inpts = new FileInputStream("C:\\Users\\skyxt\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\com\\config\\config.properties");
		Properties obj = new Properties();
			obj.load(inpts); //Load the propertyfile
			
			//Get property file by using obj.getproperty then use String Variable 
			String browsername = obj.getProperty("Browser");
			System.out.println(" Browser Name is :: " + browsername);
			//Get property file by using obj.getproperty then use String Variable 
			String QAURLNAme = obj.getProperty("QA_URL"); 
			System.out.println("QA URL Name is :: " + QAURLNAme);			
	}
	
	public static void getUrl() {
		
		
	}
	public static void main(String[] args) throws IOException {
		readProperties();
		
	}
}
