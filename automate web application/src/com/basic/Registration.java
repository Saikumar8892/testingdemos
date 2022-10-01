package com.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Registration {
	
    public static void main(String[] args)
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\saikumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/campaign/landing.php");

                driver.manage().window().maximize();
                
                driver.findElement(By.name("firstname"))
                .sendKeys("sai");
                
                driver.findElement(By.name("lastname"))
                .sendKeys("kumar");
                
                driver.findElement(By.name("reg_email__"))
                    .sendKeys("saikumarqz23@gmail.com");
                
                driver.findElement(By.name("reg_email_confirmation__"))
                .sendKeys("saikumarqz23@gmail.com");
                
                driver.findElement(By.id("password_step_input"))
                .sendKeys("Sai3231");
                
                driver.findElement(By.id("day"))
                .sendKeys("7");
                driver.findElement(By.id("month"))
                .sendKeys("Jun");
          
                driver.findElement(By.id("year"))
                    .sendKeys("2001");
                
                driver.findElement(By.className("_58mt"))
                .click();
          
                driver.findElement(By.name("websubmit"))
                    .click();
            }
        }
