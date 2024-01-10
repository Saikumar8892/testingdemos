package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Ulearning\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("sairoyalsulli@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Sai@52");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
	}
}
