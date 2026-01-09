package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Genericfunctions {
	public void Click(WebDriver driver, By locator) {
		driver.findElement(locator).click();

	}
	public void Sendkeys(WebDriver driver, By locator, String Value) {
		driver.findElement(locator).sendKeys(Value);
		
	}

}
