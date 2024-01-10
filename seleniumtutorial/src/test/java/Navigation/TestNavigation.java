package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNavigation {
	 public static void main(String[] args) throws Exception {
  	   WebDriverManager.firefoxdriver().setup();
  	   WebDriver driver = new FirefoxDriver();
  	   driver.manage().window().maximize();
  	   
  	   driver.get("https://www.google.com/");
  	   Thread.sleep(2000);
  	   driver.findElement(By.name("q")).sendKeys("jrntr");
  	   Thread.sleep(2000);
  	   driver.navigate().to("https://www.facebook.com/");
  	   driver.findElement(By.id("email")).sendKeys("sai@gmail.com");
  	   Thread.sleep(2000);
  	   driver.navigate().refresh();
  	   Thread.sleep(2000);
  	   driver.navigate().back();
  	   Thread.sleep(2000);
  	   driver.navigate().forward();
  	   Thread.sleep(2000);
  	   driver.quit();
	 }
}
