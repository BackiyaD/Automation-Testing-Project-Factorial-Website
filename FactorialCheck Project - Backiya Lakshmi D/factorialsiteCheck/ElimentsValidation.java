package factorialsiteCheck;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ElimentsValidation extends BrowserStack {


	//Validation All the necessary UI Elements are Present and Clickable 
	//(Textbox, Calculate Button, About, Terms and Condition and Privacy Link)
	

	@Test (priority = 0)
	public void validation() {
		ElementsStorage p = new ElementsStorage(driver);
		//ElementsStorage p = PageFactory.initElements(driver, ElementsStorage.class);
		System.out.println("Textbox is Present- " + p.textbox.isDisplayed());
		System.out.println("Textbox is enabled- " + p.textbox.isEnabled());

		System.out.println("Calculate Button is Present- " + p.calculateButton.isDisplayed());
		System.out.println("Calculate Button is enabled- " + p.calculateButton.isEnabled());

		System.out.println("About Link is Present- " + p.about.isDisplayed());
		System.out.println("About Link is enabled- " + p.about.isEnabled());

		System.out.println("Terms and Condition Link is Present- " + p.terms.isDisplayed());
		System.out.println("Terms and Condition Link is enabled- " + p.terms.isEnabled());

		System.out.println("Privacy Link is Present- " + p.privacy.isDisplayed());
		System.out.println("Privacy Link is enabled- " + p.privacy.isEnabled());
	}

	
}