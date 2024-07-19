package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity3 {
	AndroidDriver driver;
	
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        URL appServer = new URL("http://localhost:4723/");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 20);
        driver.get("https://www.training-support.net/selenium");
    }
    @Test
    public void to_D0_List() throws InterruptedException {
        String UiScrollable="UiScrollable(UiSelector().scrollable(true))";
        Thread.sleep(5000);
       WebElement todolist= driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable +".scrollToEnd(10).scrollIntoView(textContains(\"To-Do List\"))"));
       todolist.click();
       Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));
     WebElement addtask=  driver.findElementByXPath("//android.widget.EditText[@resource-id='taskInput']");
    addtask.sendKeys("Task1");
        Thread.sleep(5000);
        WebElement button=driver.findElementByXPath("//android.widget.Button[@text='Add Task']");
        button.click();
        Thread.sleep(5000);
        addtask.sendKeys("task2");
        button.click();
        Thread.sleep(5000);
        List<MobileElement> totalTasks = driver.findElementsByXPath("//android.view.View[@resource-id='tasksList']/android.view.View");
      int size= totalTasks.size()-1;
       System.out.println(totalTasks.size()-1);
        Assert.assertEquals(size, 2);
        Thread.sleep(3000);
       wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@resource-id='tasksList']")));
        Thread.sleep(3000);
        driver.findElementByXPath("//android.view.View[@text='task1']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.view.View[@text='task2']").click();
       driver.findElementByXPath("//android.view.View[@resource-id='tasksList']").click();
       driver.findElementByXPath("//android.view.View[@resource-id='tasksList']").click();

    }
}
