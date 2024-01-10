package Timeout;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadTimeOut {
	public static void main(String[] args) throws Exception{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		driver.get("https://www.simplilearn.com/");
		
		
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		Duration duration=Duration.between(startTime, endTime);
		System.out.println("PageLoad:"+duration.toMillis());
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
