package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.com.BaseCofigration;
import utility.com.PageFactoryTest;

// this class related with PageFactoryTest class (PageFactoryTest class we keep all Xpath for SignInBtn and others 
// this class related with BaseCofigration class (where we hide all the URL, UID PW) we pass data to our automation,
// BaseCofigration is associate with Config.propeties file. This is the where we keep URL, UID and PW; Value. 

public class FinalLogin {
	
	public static void main(String[] args) {
		
	        System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get(BaseCofigration.getCofigValue("URL"));
			driver.manage().window().maximize();
			PageFactoryTest obj = new PageFactoryTest(driver);
			obj.getSignInBtn().click();
			obj.getUserName().sendKeys(BaseCofigration.getCofigValue("Username"));
			obj.getPassword().sendKeys(BaseCofigration.getCofigValue("Password"));
			obj.getSubmitBtn().click();
			driver.close(); 	 	
		}
		
}
