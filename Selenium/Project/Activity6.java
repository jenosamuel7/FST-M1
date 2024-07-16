package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity6 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	  
	       driver.get("https://alchemy.hguy.co/jobs/");
	       
	       driver.findElement(By.xpath("//a[text()='Jobs']")).click();
	       Thread.sleep(5000);
	       
	       driver.findElement(By.id("search_keywords")).sendKeys("Banking");
	        
	       driver.findElement(By.className("search_submit")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//h3[text()='BankingTestJob']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@value='Apply for job']")).click(); 
	       Thread.sleep(2000);
	         
	       
	    	      
	       driver.quit();

	}


}
