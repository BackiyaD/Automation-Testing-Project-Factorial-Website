package factorialsiteCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ValidationAttributesCheck extends BrowserStack {
	/*
	 * Verify the Placeholder in Textbox is = 'Enter an integer' Verify the Title of
	 * the page contains = 'Factorial' Verify the URL contains = 'https'
	 */


	
	
	@Test (priority = 1)
	public void verifytextboxPlaceholder() {
		ElementsStorage p = PageFactory.initElements(driver, ElementsStorage.class);
		String textboxPlaceholder = p.textbox.getAttribute("placeholder");
		if(textboxPlaceholder.equals("Enter an integer")) {
			System.out.println("Placeholder in Textbox is 'Enter an integer' - Verified");
		} else {
			System.out.println("Placeholder in Textbox is different. "
					+ "It's showing -" +textboxPlaceholder );
		}
	}
	
	@Test (priority = 2)
	public void verifyPage() {
		String pagetitle =driver.getTitle();
		if(pagetitle.contains("Factorial")) {
			System.out.println("Title of the page contains 'Factorial'");
		} else {
			System.out.println("Title of the page not contains 'Factorial'");
		}
	}
	
	@Test (priority = 3)
	public void verifyUrl() {
		String pageurl =driver.getCurrentUrl();
		if(pageurl.contains("https")) {
			System.out.println("The URL contains 'https'");
		} else {
			System.out.println("The URL not contains 'https'");
		}
	}

	
}
