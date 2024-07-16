package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3 
{
	public static void main(String[] args) {
	 WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();

   
        driver.get("https://alchemy.hguy.co/jobs/");
     
        
     
        String text = driver.findElement(By.xpath("//div[contains(@class,'post-thumb-img-content post-thumb')]/img")).getAttribute("src");
        System.out.println(text);
        driver.quit();
               
}
}

