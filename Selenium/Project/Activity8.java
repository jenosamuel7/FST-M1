package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity8 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
      
        WebDriver driver = new FirefoxDriver();


        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
      
         
        driver.findElement(By.id("user_login")).sendKeys("​root");
     
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
    
        driver.findElement(By.id("wp-submit")).click();

  
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Login Sucessfully: " + message);
        
                 
        driver.quit();
    }


}
