package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		
		WebDriver webdriver = null;
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\saikumar\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		webdriver = new ChromeDriver();
		
		
		webdriver.get("https://www.simplilearn.com");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.quit();
		
	}
}
