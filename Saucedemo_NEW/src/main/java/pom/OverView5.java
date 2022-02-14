package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverView5 {
	
	
	
	@FindBy (xpath = "//button[@id='finish']")
	private WebElement finishButton;
	
	@FindBy (xpath = "//div [@class='header_secondary_container']//span")
	private WebElement getTextOfPage;
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	
	public OverView5( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public String getTextOfOverViewPage() {
		
		String text = getTextOfPage.getText();
		return text;
	}
	
	
	
	
	
	public void clickOnFinishButton() {
		
		finishButton.click();
	}
	
	
	public void clickOnMenuButton() {
		
		menuButton.click();
	}
	
	
	public void clickOnLogoutButton() {
		
	logoutButton.click();
	}
	
	
	
	
}
