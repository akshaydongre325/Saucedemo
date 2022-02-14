package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AddToCardPage2;
import pom.OverView5;
import pom.SwagLab1;
import pom.YourCardPage3;
import pom.YourInformationPage4;

public class TestClass {


	public static void main(String[] args) throws InterruptedException  {

	
	System.setProperty("webdriver.chrome.driver","F:\\velocity pune\\automation , akasha sir\\selenium  2nd\\class 35 ( 6-1-22 ) ( string method , replace,startsWith,endWith,trim,split, tochararray, compareTO , selenium instrallation)\\selemium app extraction\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();

	
	SwagLab1 swagLab1 = new SwagLab1(driver);
	
	swagLab1.sendUserName("standard_user");
	
	swagLab1.sendPassword("secret_sauce");
	
	swagLab1.clickOnLoginButton();
	
	AddToCardPage2 addToCardPage2 = new AddToCardPage2(driver);
	
	addToCardPage2.clickOnAddToCardButton();
	
	addToCardPage2.clickOnAddCardSymbol();
	
	YourCardPage3 yourCardPage3 = new YourCardPage3(driver);
	
	yourCardPage3.clickOnCheakoutButton();
	
	YourInformationPage4 yourInformationPage4 = new YourInformationPage4(driver);
	
	yourInformationPage4.sendFirstName();
	
	yourInformationPage4.sendPassword();
	
	yourInformationPage4.sendPinCode();
	
	yourInformationPage4.clickOnContinueButton();
	
	OverView5 OverView5 = new OverView5 (driver);
	
	 String text= OverView5.getTextOfOverViewPage();
	
	System.out.println(text);
	
	OverView5.clickOnFinishButton();
	
	}	
}
