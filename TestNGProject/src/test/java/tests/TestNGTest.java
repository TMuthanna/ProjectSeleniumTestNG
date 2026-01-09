package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegPage;

public class TestNGTest {
	
	@Test
	public void Login() {
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		RegPage ObjRegPage = new RegPage(driver);
		ObjRegPage.EnterDetails();
		
	}

}
