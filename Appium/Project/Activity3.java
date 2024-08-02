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

public class Activity3 {
	// Driver Declaration
    AndroidDriver driver;
	// Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
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
        driver.findElement(AppiumBy.id("new_note_button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("editable_title")));
        WebElement sendTitle = driver.findElement(AppiumBy.id("editable_title"));
        sendTitle.sendKeys("New Title Added");
        WebElement sendNote = driver.findElement(AppiumBy.id("edit_note_text"));
        sendNote.sendKeys("New Note Added");
        driver.findElement(AppiumBy.id("menu_reminder")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/menu_text\" and @text=\"Later today\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/title\" and @text=\"Reminders\"]")).click();
            
        //Assertion
        String bodyText1 = driver.findElement(AppiumBy.id("index_note_title")).getText();
        Assert.assertEquals(bodyText1, "New Title Added");
        
        System.out.println("Appium Project Activities - Activity3 Test Passed!");

    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}
