package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	  
	       driver.get("https://alchemy.hguy.co/jobs/");
	       
	       driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@id='create_account_email']")).sendKeys("test@test2134.com");
	       driver.findElement(By.xpath("//*[@id='job_title']")).sendKeys("Test Job");
	       driver.switchTo().frame("job_description_ifr");
	       driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Test");
	       driver.switchTo().defaultContent();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@id='application']")).sendKeys("Test@test1.com");
	       driver.findElement(By.xpath("//*[@id='company_name']")).sendKeys("Test");
	       driver.findElement(By.xpath("//*[@id='company_website']")).sendKeys("http://test.com");
	       driver.findElement(By.xpath("//*[@id='company_tagline']")).sendKeys("Test");
	       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]")).click();
	       driver.findElement(By.xpath("//*[@id='job_preview_submit_button']")).click();
	       driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
	       
	            
	       driver.quit();
	       
	}

}
