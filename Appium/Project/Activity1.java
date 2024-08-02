package appium_project_activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	 // Driver Declaration
    AndroidDriver driver;
	// Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }
    @Test
    public void AddTasks() throws Exception {
        // Add Tasks
    	//Task1
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        WebElement sendText1 = driver.findElement(AppiumBy.id("add_task_title"));
        sendText1.sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("add_task_done")).click();
        //Task2
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        WebElement sendText2 = driver.findElement(AppiumBy.id("add_task_title"));
        sendText2.sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();
        //Task3
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        WebElement sendText3 = driver.findElement(AppiumBy.id("add_task_title"));
        sendText3.sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();
        
        //Assertion
        String bodyText1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete Activity with Google Tasks\"]")).getText();
        Assert.assertEquals(bodyText1, "Complete Activity with Google Tasks");
        String bodyText2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete Activity with Google Keep\"]")).getText();
        Assert.assertEquals(bodyText2, "Complete Activity with Google Keep");
        String bodyText3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.tasks:id/task_name\" and @text=\"Complete the second Activity Google Keep\"]")).getText();
        Assert.assertEquals(bodyText3, "Complete the second Activity Google Keep");
        
        System.out.println("Appium Project Activities - Activity1 Test Passed!");

    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
    

}
