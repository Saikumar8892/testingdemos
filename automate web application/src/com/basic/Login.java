package com.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	 public static void main(String[] args)
	    {
		 System.setProperty(
		            "webdriver.edge.driver",
		            "C:\\Users\\saikumar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		        WebDriver driver = new EdgeDriver();
			
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email"))
	        .sendKeys("saikumarqz23@gmail.com");
	        
	        driver.findElement(By.id("pass"))
	        .sendKeys("Sai3231");
	        
	        driver.findElement(By.id("loginbutton"))
            .click();
	        
	    }
}
