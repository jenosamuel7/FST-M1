package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatorPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//when authenticator is getting we can directly provide username and password in url it self
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("title of url is" + driver.getTitle());

	}

}
