package tests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browser.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegPage;

public class TestNGTest extends BrowserFactory {
	
	WebDriver driver;

	@Test
	public void Login() {
		TestNGTest Obj = new TestNGTest();
		driver = Obj.SelectBrowser(driver, "Chrome");
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
//		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.manage().window().maximize();

		RegPage ObjRegPage = new RegPage(driver);
		ObjRegPage.EnterDetails();
	}
	
	
	
}
