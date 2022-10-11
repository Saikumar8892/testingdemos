package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest {
	WebDriver driver;

	@Test(groups = "Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saikumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Chrome", dependsOnMethods = "LaunchChrome")
	public void f() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Printing Load Time in seconds on console

		Long loadtime = (Long) ((JavascriptExecutor) driver)
				.executeScript("return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		System.out.println("Load time of the website is :- " + loadtime/1000+" Seconds");

		//Searching IPhone 13 on search bar

		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		driver.findElement(By.className("L0Z3Pu")).click();

		WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Image is loaded");
		} else {
			System.out.println("Image not loaded");
		}

		try {
			long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				Thread.sleep(2000);

				long newHeight = (long) ((JavascriptExecutor) driver)
						.executeScript("return document.body.scrollHeight");
				if (newHeight == lastHeight) {
					break;
				}
				lastHeight = newHeight;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}