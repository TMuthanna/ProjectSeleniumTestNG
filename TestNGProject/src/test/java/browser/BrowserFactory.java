package browser;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public WebDriver SelectBrowser(WebDriver driver, String Value) {
		
		switch(Value) {
		case "Chrome":
			driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
			break;
			
		case "FireFox":
			WebDriverManager.firefoxdriver().avoidShutdownHook().create();
			break;
			
		case "Edge":
			WebDriverManager.edgedriver().avoidShutdownHook().create();
			break;
			
		default:
			System.out.println("Mention Browser Name");
		
		}
		driver.manage().window().maximize();
		return driver;
			
		
	}

}
