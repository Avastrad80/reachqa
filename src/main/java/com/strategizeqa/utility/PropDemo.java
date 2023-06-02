package com.strategizeqa.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import com.strategizeqa.Keyword;
import com.strategizeqa.base.*;

public class PropDemo {

	public static String valueFromProp(String key) throws IOException {
		String base = System.getProperty("user.dir"); // Current working directory path
		FileInputStream fis = new FileInputStream(base + "/src/main/resources/Application.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static void login() throws IOException {
		Keyword.openbrowser("Chrome");
		Keyword.driver.get(PropDemo.valueFromProp("stage.url"));
		Keyword.driver.findElement(By.xpath("//input[@type='email']"))
				.sendKeys(PropDemo.valueFromProp("stage.username"));
		Keyword.driver.findElement(By.xpath("//button[@value='continue']")).click();
		Keyword.driver.findElement(By.xpath("//input[@type='password']"))
				.sendKeys(PropDemo.valueFromProp("stage.password"));
		Keyword.driver.findElement(By.xpath("//button[@value='login']")).click();
	}

	public static void selectLocation(String locationName) throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		// Click on Location Radio Button
		Keyword.driver.findElement(By.xpath("//a[@id='competition']")).click();
		Thread.sleep(5000);
		
		Keyword.driver.findElement(By.xpath("//div[@class='v-list-item__title'][contains(text(),'City')]/parent::div/following-sibling::div[@class='v-list-item__subtitle location_type']"));
		System.out.println("Selected location: " + locationName);
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws IOException, InterruptedException {

	    selectLocation("Alabama");
	}

}
