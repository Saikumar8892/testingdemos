package Locators;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Locatorsexample {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		chapter2();
	}

	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	//Types of xpath
	public static void chapter2() throws InterruptedException {
		driver.get("https://www.simplilearn.com/");
		//Id
        highlight(driver.findElement(By.id("header_srch")));
		Thread.sleep(3000);
		//classname
		highlight(driver.findElement(By.className("logo")));
		Thread.sleep(3000);
		//name
		highlight(driver.findElement(By.name("tag")));
		Thread.sleep(3000);
		//LinkText
		highlight(driver.findElement(By.linkText("Log in")));
		Thread.sleep(3000);
		//Partiallinktext
		highlight(driver.findElement(By.partialLinkText("Log")));
		Thread.sleep(3000);
		//tagname
		highlight(driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		//Absolute XPath
		highlight(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")));
		Thread.sleep(3000);
		//Relative XPath
		highlight(driver.findElement(By.xpath("//a[@title='Reviews']")));
		Thread.sleep(3000);
		//Cssselector
		highlight(driver.findElement(By.cssSelector("a[title='Hire From Us']")));
		System.out.println("sucessfully identified");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}