package utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryTest {
	
	
public PageFactoryTest(WebDriver driver){
		
		PageFactory.
	}
	
	
	
	
	
	
	
	    @FindBy(xpath="//*[contains(@class,'login')]")
    private WebElement SignInBtn;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//*[contains(@name, 'passwd')]")
	private WebElement Password;
	
	@FindBy(xpath="//*[contains(@class,'icon-lock left')]")
	private WebElement SubmitBtn;
	
	public WebElement getSignInBtn() {
		return SignInBtn;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
}
