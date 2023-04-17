package com.strategizeqa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.strategizeqa.Keyword;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropDemo {
	public static String valueFromProp(String key) throws IOException{
		String base = System.getProperty("user.dir"); //Current working directory path 
		FileInputStream fis = new FileInputStream(base+"/src/main/resources/Application.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static void login() throws IOException {
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		Keyword.driver.get(PropDemo.valueFromProp("stage.url"));
		Keyword.driver.findElement(By.xpath("//input[@type='email']")).sendKeys(PropDemo.valueFromProp("stage.username"));
		Keyword.driver.findElement(By.xpath("//button[@value='continue']")).click();
		Keyword.driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PropDemo.valueFromProp("stage.password"));
		Keyword.driver.findElement(By.xpath("//button[@value='login']")).click();
	}
	
	public static void main(String[] args) throws IOException {
		login();
		
	}
}
