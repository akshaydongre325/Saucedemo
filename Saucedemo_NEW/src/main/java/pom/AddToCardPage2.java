package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCardPage2 {

	

	@FindBy (xpath = "//button[text()='Add to cart']")
	private WebElement addToCardButton;
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")
	private WebElement addCardSymbol;
	
	
	
	public AddToCardPage2( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void clickOnAddToCardButton() {
		
		addToCardButton.click();
	}
	
	public void clickOnAddCardSymbol() {
		
		addCardSymbol.click();
		}
	
	
	
}
