package com.reachqa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	/**
	 * This method will return the Locator value stored in OR.propetries file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String element(String key){
		String value = "";
		String base = System.getProperty("user.dir"); //Current working directory path 
		//Code to read the property file, this will be asked in interview "How we read the property file"
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(base+"/src/main/resources/OR.properties");	// Properties file reading code line no1
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // properties path
		Properties prop = new Properties(); // Properties file ka object, line no2
		try {
			prop.load(fis); // Load method line no3
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// file input stream ka object.
		value = prop.getProperty(key);  // line no4
		
		
		// Value reading
		return value;
		 	
	}
	
//	public String getLocator 
	
	public String getProperty(String file, String key) {
		String value = "";
		String base = System.getProperty("user.dir"); //Current working directory path 
		//Code to read the property file, this will be asked in interview "How we read the property file"
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(base +"/"+file);	// Properties file reading code line no1
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} // properties path
		Properties prop = new Properties(); // Properties file ka object, line no2
		try {
			prop.load(fis); // Load method line no3
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// file input stream ka object.
		value = prop.getProperty(key);  // line no4
		
		
		// Value reading
		return value;
		
	}
	
}
