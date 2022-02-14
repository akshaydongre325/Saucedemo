package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCardPage3 {

	


	@FindBy (xpath = "//button[@id='checkout']")
	private WebElement cheakout;
	
	@FindBy (xpath = "//span[@class='title']")
	private WebElement getTextOfYourCart;
	
	
	public YourCardPage3( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void clickOnCheakoutButton() {
		
		cheakout.click();
	}
	

	public String getTextOfYourCart() {
		
	
	String l = getTextOfYourCart.getText();
	
	return l;
	}
	
	
	
	
	
	
}
