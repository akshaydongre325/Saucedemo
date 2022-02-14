package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab1 {

	@FindBy (xpath = "//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@name='login-button']")
	private WebElement loginButton;
	
	
	public SwagLab1( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void sendUserName(String enterName ) {
		
		userName.sendKeys(enterName);
	}
	
	public void sendPassword(String enterPassword) {
		
		password.sendKeys(enterPassword);
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
	}
	
}
