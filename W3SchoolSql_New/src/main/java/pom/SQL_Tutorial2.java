package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SQL_Tutorial2 {

	
	@FindBy (xpath = "//a[text()='Try it Yourself »']")
	private WebElement TryItYourself;

	
	
	public SQL_Tutorial2( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void clickOnLearnSql() {
		
		TryItYourself.click();
	}
	
	
	
	
}
