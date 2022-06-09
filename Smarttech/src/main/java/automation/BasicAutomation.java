package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.com.BaseCofigration;
import utility.com.PageFactoryTest;


public class BasicAutomation {
	
	 public static void getLogin() {
		
        System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/");
	    driver.get(BaseCofigration.getCofigValue("URL"));
		driver.manage().window().maximize();
		
		PageFactoryTest obj = new PageFactoryTest(driver);
		
		obj.getSignInBtn().click();
		
		//driver.findElement(By.xpath("//*[contains(@class,'login')]")).click();
		obj.getUserName().sendKeys(BaseCofigration.getCofigValue("Username"));
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sobhanrstech@gmail.com");
		obj.getPassword().sendKeys(BaseCofigration.getCofigValue("Password"));
		//driver.findElement(By.xpath("//*[contains(@name, 'passwd')]")).sendKeys("sabiha2019");
		obj.getSubmitBtn().click();
	    //driver.findElement(By.xpath("//*[contains(@class,'icon-lock left')]")).click();
		driver.close(); 
		 
		
	}
		
}
