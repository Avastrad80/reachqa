package com.strategizeqa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {
	public static void main(String[] args) throws IOException {
		String base = System.getProperty("user.dir"); //Current working directory path 
		FileInputStream fis = new FileInputStream(base+"/src/main/resources/Application.properties");;
		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty("stage.url");
		System.out.println(value);

	}
}
