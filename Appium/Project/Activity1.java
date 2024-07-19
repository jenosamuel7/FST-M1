package Activities;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class Activity1 {
	
	AndroidDriver driver;
	
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://localhost:4723/");
       /driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 20);

    }
    @Test
    public void addTask() throws InterruptedException {
       wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("tasks_fab")));
       // driver.findElementByAccessibilityId("Tasks").click();

        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Task1");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
        driver.findElementById("task_name").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("edit_details")));
        driver.findElementById("edit_details").click();
        driver.findElementById("edit_details").sendKeys("Description");
        driver.findElementByAccessibilityId("Navigate up").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
       String noteadded= driver.findElementById("task_name").getText();
        Assert.assertEquals("Task1",noteadded);

    }
    @Test
    public void addTask2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("tasks_fab")));
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Task2");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
        driver.findElementById("task_name").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("edit_details")));
        driver.findElementById("edit_details").click();
        driver.findElementById("edit_details").sendKeys("Description");
        driver.findElementByAccessibilityId("Navigate up").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
        String noteadded= driver.findElementById("task_name").getText();
        Assert.assertEquals("Task2",noteadded);
    }
    @Test
    public void addTask3(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("tasks_fab")));
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Task3");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
        driver.findElementById("task_name").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("edit_details")));
        driver.findElementById("edit_details").click();
        driver.findElementById("edit_details").sendKeys("Description");
        driver.findElementByAccessibilityId("Navigate up").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
        String noteadded= driver.findElementById("task_name").getText();
        Assert.assertEquals("Task3",noteadded);
    }
}
