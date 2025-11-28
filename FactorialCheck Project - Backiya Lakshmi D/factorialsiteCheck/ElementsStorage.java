package factorialsiteCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ElementsStorage {
	  public ElementsStorage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
	
	@FindBy (xpath = "//input[@id='number']") WebElement textbox;
	@FindBy (xpath= "//button[@id='getFactorial']") WebElement calculateButton;
	@FindBy (xpath= "//a[text()='About']") WebElement about;
	@FindBy (xpath= "//a[text()='Terms and Conditions']") WebElement terms;
	@FindBy (xpath = "//a[text()='Privacy']") WebElement privacy;
	@FindBy (xpath = "//a[text()='Qxf2 Services']") WebElement service;
	@FindBy (id = "resultDiv") WebElement result;

}
