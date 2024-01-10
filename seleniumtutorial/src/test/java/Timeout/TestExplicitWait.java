package Timeout;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExplicitWait {
   public static void main(String[] args) throws Exception {
	   WebDriverManager.firefoxdriver().setup();
	   WebDriver driver = new FirefoxDriver();
	   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().setSize(new Dimension(1000, 1000));
	   
	   driver.get("https://blog.testproject.io/");
	   String parentWindow = driver.getWindowHandle();
	   driver.findElement(By.linkText("Blog")).click();
	   Set<String>windowHandles = driver.getWindowHandles();
	   for(String windowHandle : windowHandles) {
		   if(!windowHandle.equals(parentWindow)) {
			   driver.switchTo().window(windowHandle);
			   Thread.sleep(3000);
			   driver.findElement(By.className("search-field")).sendKeys("sai@gmail.com");
		   }
	   }
	
	   
   }
}
