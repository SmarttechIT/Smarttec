package utility.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFact {
	
	@FindBy (xpath ="")
	private WebElement signin;
	private WebElement username;
	private WebElement password;
	private WebElement submitbutton;
	
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	

}
