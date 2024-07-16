package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	  
	       driver.get("https://alchemy.hguy.co/jobs/");
	      
	       driver.findElement(By.xpath("//a[text()='Jobs']")).click(); 
	       Thread.sleep(5000);
	    	    	      
	       driver.quit();

	}

}
