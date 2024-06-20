package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTest {

	public static void main(String[] args) {
		
		 WebDriverManager.firefoxdriver().setup();
		 
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://v1.training-support.net");
		 
		 driver.quit();
		

	}

}
