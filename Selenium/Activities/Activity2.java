package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Edge has Edge driver
		WebDriverManager.edgedriver().setup();
						// Initialize Chrome driver
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		driver.manage().window().maximize();
		System.out.println("Home Page Tittle "+driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        Thread.sleep(5000);
        driver.quit();

	}

}
