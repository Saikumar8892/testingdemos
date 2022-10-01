package com.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	 public static void main(String[] args)
	    {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\saikumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/login/");
			
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email"))
	        .sendKeys("saikumarqz23@gmail.com");
	        
	        driver.findElement(By.id("pass"))
	        .sendKeys("Sai3231");
	        
	        driver.findElement(By.id("loginbutton"))
            .click();
	        
	    }
}
