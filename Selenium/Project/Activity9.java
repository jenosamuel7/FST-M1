package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity9 {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
    
    WebDriver driver = new FirefoxDriver();


    driver.get("https://alchemy.hguy.co/jobs/wp-admin");
  
     
    driver.findElement(By.id("user_login")).sendKeys("​root");
 
    driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

    driver.findElement(By.id("wp-submit")).click();

 
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
    driver.findElement(By.xpath("//textarea[@class='editor-post-title__input']")).sendKeys("SIT Tester");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
      
    driver.quit();

}
}
