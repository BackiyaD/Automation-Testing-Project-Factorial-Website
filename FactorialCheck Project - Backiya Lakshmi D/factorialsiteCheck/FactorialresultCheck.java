package factorialsiteCheck;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FactorialresultCheck extends BrowserStack {
//Data Driven testing (4 to 10) find out the factorial and verify the result
	
    
    @DataProvider(name = "factorial number")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { 4 }, { 5 }, { 6 }, { 7 }, { 8 }, { 9 }, { 10 }
        };
    }
    
    
    @Test(dataProvider = "factorial number", priority = 4)
    public int getFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    @Test(dataProvider = "factorial number", priority = 5)
    public <E> void factorialCheck (int data) throws Exception {
    	ElementsStorage p = PageFactory.initElements(driver, ElementsStorage.class);
    	p.textbox.clear();
    	p.textbox.sendKeys(String.valueOf(data));
    	p.calculateButton.click();
    	Thread.sleep(1000);
    	int expNo = getFactorial(data);
      	String result=p.result.getText();
    	if(result.contains(String.valueOf(expNo))) {
    		System.out.println("Factorial value of "+data+" -Passed");
    	 }else {
    		 System.out.println("Factorial value of "+data+" -Not Passed");
    	 }
    }
    	 
    
}
