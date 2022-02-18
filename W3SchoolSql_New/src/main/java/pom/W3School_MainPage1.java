package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School_MainPage1 {

	

	@FindBy (xpath = "(//a[@class='w3-button w3-block tut-button'])[4]")
	private WebElement learnSql;

	
	
	public W3School_MainPage1( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void clickOnLearnSql() {
		
		learnSql.click();
	}
	
	
	
}
