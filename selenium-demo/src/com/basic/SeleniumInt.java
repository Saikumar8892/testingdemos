package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumInt{
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver",
		"C:\\Ulearning\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.simplilearn.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.quit();
}
}
