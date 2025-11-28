package factorialsiteCheck;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Totallink extends BrowserStack{
//Click on the About link and verify the total number of link is Greater than 5 and print the link name
//	(Use Webdriver Wait/ Assertion)
     
    @Test (priority = 6)
    public void aboutlink() {
    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    	ElementsStorage p = PageFactory.initElements(driver, ElementsStorage.class);
    	wait.until(ExpectedConditions.elementToBeClickable(p.about));
    	p.about.click();
    	
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
    	List<WebElement> linklist = driver.findElements(By.tagName("a"));
    	int linkcount = linklist.size();
    	 System.out.println("Total links found: " + linkcount);
    	if(linkcount>5) {
    		for(WebElement link: linklist) {
    			
    			System.out.println(link.getText());
    		}
    		
    	}
    }
   
}
