package factorialsiteCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BrowserStack {
	 public WebDriver driver;
	
	 @Parameters("browser")
		@BeforeMethod 
		public void openBrowser(String browser) {
        if(browser.equalsIgnoreCase("chrome")) {
        	  driver = new ChromeDriver();
          } else
          if(browser.equalsIgnoreCase("firefox")) {
        	  driver = new FirefoxDriver();
          } else if(browser.equalsIgnoreCase("edge")) {
        	  System.setProperty("webdriver.edge.driver", "C:\\Users\\backiya\\OneDrive\\Desktop\\Jars\\msedgedriver.exe");
      		 driver = new EdgeDriver();
          }
          driver.get("https://qainterview.pythonanywhere.com/");
          driver.manage().window().maximize();
		}
		
		@AfterMethod 
		public void close() {
		
			 if (driver != null) {
		            driver.quit();
		        }
					}
}
