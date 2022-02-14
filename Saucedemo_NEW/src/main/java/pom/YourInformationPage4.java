package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage4 {

	@FindBy (xpath = "//input[@id='first-name']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@id='last-name']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@id='postal-code']")
	private WebElement pinCode;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continueButton;
	
	public YourInformationPage4( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void sendFirstName() {
		
		firstName.sendKeys("Akshay");
	}
	
	public void sendPassword() {
		
		lastName.sendKeys("Meshram");
	}
	
	public void sendPinCode() {
		
		pinCode.sendKeys("441912");
	}
	
	public void clickOnContinueButton() {
		
		continueButton.click();
	}
	
}
