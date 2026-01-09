package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Genericfunctions;

public class RegPage {
	WebDriver driver;

	public RegPage(WebDriver driver) {
		this.driver = driver;
	}

	By DoNotConsent = By.cssSelector("[aria-label='Do not consent']");
	By FirstName = By.cssSelector("[placeholder='First Name']");
	By LastName = By.cssSelector("[placeholder='Last Name']");

	Genericfunctions ObjGenericfunctions = new Genericfunctions();

	public void EnterDetails() {
		ObjGenericfunctions.Click(driver, DoNotConsent);
		ObjGenericfunctions.Sendkeys(driver, FirstName, "Sham");
		ObjGenericfunctions.Sendkeys(driver, LastName, "Naik");

	}
}
