package Activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Activity1 {
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
        
        WebDriver driver = new FirefoxDriver();
            
        driver.get("https://alchemy.hguy.co/jobs/");
  
        System.out.println("Home page title: " + driver.getTitle());
         
        driver.quit();

    }

	}



