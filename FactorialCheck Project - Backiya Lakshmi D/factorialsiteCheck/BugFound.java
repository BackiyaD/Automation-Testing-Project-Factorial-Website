package factorialsiteCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BugFound extends BrowserStack {
	
	ElementsStorage p = PageFactory.initElements(driver, ElementsStorage.class);

		@Test (priority = 7)
	public void bug1() {
	
		p.terms.click();
		String termsandcon = driver.getTitle();
		Assert.assertEquals(termsandcon, "Terms and conditions");
		}
	
	@Test (priority = 8)
	public void bug2() {
		
		p.privacy.click();
		String privacysite = driver.getTitle();
		Assert.assertEquals(privacysite, "Privacy");
		}

}
