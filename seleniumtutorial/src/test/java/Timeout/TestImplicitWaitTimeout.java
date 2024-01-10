package Timeout;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImplicitWaitTimeout {
   public static void main(String[] args) {
	   WebDriverManager.firefoxdriver().setup();
	   WebDriver driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().setSize(new Dimension(1000, 1000));
	   
	   driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	   driver.findElement(By.id("btn1")).click();
	   driver.findElement(By.id("txt1")).sendKeys("sai");
	   driver.findElement(By.id("btn2")).click();
	   driver.findElement(By.id("txt2")).sendKeys("kumar");
	   
   }
}
