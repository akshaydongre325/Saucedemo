package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SqlQureyPage3 {

	

	@FindBy (xpath = "//button[@id='restoreDBBtn']")
	private WebElement restoreDataBase;

	@FindBy (xpath = "//td[@title='Click to see the content of the Customers table']")
	private WebElement customers;

	@FindBy (xpath = "//div[@class='CodeMirror cm-s-default CodeMirror-wrap']")
	private WebElement sqlSelect;

	@FindBy (xpath = "//button[@class='ws-btn']")
	private WebElement runSql;

	
	public SqlQureyPage3( WebDriver driver )
	{
		PageFactory.initElements(driver, this );
	}
	
	
	
	public void clickOnRestoreDataBase() {
		
		restoreDataBase.click();
	}
	
	public void clickOnCustomers() {
		
		customers.click();
	}
	
	public void clickOnSqlSelect() {
		
		sqlSelect.click();
	}
	
	public void clickOnRunSql() {
		
		runSql.click();
	}
	
	
}
