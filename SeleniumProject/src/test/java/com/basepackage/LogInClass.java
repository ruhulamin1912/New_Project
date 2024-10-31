package com.basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LogInClass {
	
	public static void opentheurl() throws IOException {
		
		FileInputStream inpts = new FileInputStream("C:\\Users\\skyxt\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\com\\config\\config.properties");
		Properties obj = new Properties();
			obj.load(inpts); //Load the propertyfile
			
			//Get property file by using obj.getproperty then use String Variable 
			String browsername = obj.getProperty("Browser");
			System.out.println(" Browser Name is :: " + browsername);
	}

}
