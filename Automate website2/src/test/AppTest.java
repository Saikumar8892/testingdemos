package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class AppTest<WebDriver> {
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saikumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      ChromeDriver cd = new ChromeDriver();
		 
	      cd.manage().window().maximize();
	      cd.get("https://www.amazon.in/");
	      cd.findElement(By.id("nav-link-accountList")).click();
	      cd.findElement(By.id("createAccountSubmit")).click();
	      cd.findElement(By.id("ap_customer_name")).sendKeys("SAIKUMAR");
	      cd.findElement(By.id("ap_phone_number")).sendKeys("9000000000");
	      cd.findElement(By.id("ap_email")).sendKeys("saiii@gmail.com");
	      cd.findElement(By.id("ap_password")).sendKeys("454545");
	      cd.findElement(By.id("ap_password_check")).sendKeys("454545");
	      cd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	      ChromeDriver cd=new ChromeDriver();
	      cd.manage().window().maximize();
	      cd.get("https://www.amazon.in/");
	      cd.findElement(By.id("nav-link-accountList")).click();
	      cd.findElement(By.id("ap_email")).sendKeys("saiii@gmail.com");
		  cd.findElement(By.id("continue")).click();
	      cd.findElement(By.id("ap_password")).sendKeys("454545");


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  	ChromeDriver cd=new ChromeDriver();
	      	cd.get("https://www.amazon.in/");
		    System.out.println(cd.getTitle());
		    System.out.println(cd.getCurrentUrl());
		    cd.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus mobiles");
		    Thread.sleep(5000);
		    cd.findElement(By.id("nav-search-submit-button")).submit();
		    cd.findElement(By.linkText("OnePlus Nord CE 2 5G (Gray Mirror, 8GB RAM, 128GB Storage)")).click();
	        cd.findElement(By.id("add-to-cart-button")).click();
	  }
}
