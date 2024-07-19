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
public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://localhost:4723/");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 20);
    }
    @Test
    public void googleKeep(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("new_note_button")));
        // driver.findElementByAccessibilityId("Tasks").click();

        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("editable_title")));
        driver.findElementById("editable_title").sendKeys("Note1");
        driver.findElementById("edit_note_text").sendKeys("description for Note1");

        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Open navigation drawer")));
        driver.findElementByAccessibilityId("\t\n" +
                "Open navigation drawer").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("index_note_title")));
       String noteadded= driver.findElementById("index_note_title").getText();
        Assert.assertEquals("Note1",noteadded);
    }
}
