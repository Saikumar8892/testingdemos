package Alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {
       public static void main(String[] args) throws Exception {
    	   WebDriverManager.firefoxdriver().setup();
    	   WebDriver driver = new FirefoxDriver();
    	   driver.manage().window().maximize();
    	   
    	   driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
    	   
    	   //AlertBox
			/*
			 * System.out.println(driver.findElement(By.id("output")).getText());
			 * driver.findElement(By.id("alertBox")).click();
			 * System.out.println(driver.switchTo().alert().getText());
			 * driver.switchTo().alert().accept();
			 * System.out.println(driver.findElement(By.id("output")).getText());
			 */
 
    	   //ConfirmBox
			/*
			 * System.out.println(driver.findElement(By.id("output")).getText());
			 * driver.findElement(By.id("confirmBox")).click();
			 * System.out.println(driver.switchTo().alert().getText());
			 * driver.switchTo().alert().accept();
			 * System.out.println(driver.findElement(By.id("output")).getText());
			 * driver.findElement(By.id("confirmBox")).click();
			 * System.out.println(driver.switchTo().alert().getText());
			 * driver.switchTo().alert().dismiss();
			 * System.out.println(driver.findElement(By.id("output")).getText());
			 */
    	   
    	   //PromptBox
    	   System.out.println(driver.findElement(By.id("output")).getText());
    	   driver.findElement(By.id("promptBox")).click();
    	   System.out.println(driver.switchTo().alert().getText());
    	   driver.switchTo().alert().sendKeys("saikumar");
    	   driver.switchTo().alert().accept();
    	   System.out.println(driver.findElement(By.id("output")).getText());
    	   driver.findElement(By.id("promptBox")).click();
    	   System.out.println(driver.switchTo().alert().getText());
    	   driver.switchTo().alert().dismiss();
    	   System.out.println(driver.findElement(By.id("output")).getText());
    	   
    	   Thread.sleep(2000);
    	   driver.quit();
        }
}
