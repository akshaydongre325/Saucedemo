package tests;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.AddToCardPage2;
import pom.OverView5;
import pom.SwagLab1;
import pom.YourCardPage3;
import pom.YourInformationPage4;
import utils.Utility;

public class TestNG1  {

		WebDriver driver ;
		 SwagLab1 swagLab1;
		 AddToCardPage2 addTOCardPage2;
		 YourCardPage3 yourCardPage3 ;
		 OverView5 overView5 ;
		 YourInformationPage4 yourInformationPage4 ;
		 SoftAssert soft;
		private int testId;
		 @BeforeTest
		 @Parameters("browser")
		 public void beforeTest (String browser) throws InterruptedException {
			 
			 System.out.println(browser);
			 
		if(browser.equalsIgnoreCase("chrome")) 
		{
			
			 System.setProperty("webdriver.chrome.driver","F:\\velocity pune\\automation , akasha sir\\chrome\\chromedriver_win32\\chromedriver.exe");
			 	driver = new ChromeDriver();
				
				System.out.println("start chrome");
			
		}
			 
		if(browser.equalsIgnoreCase("FirefoxDriver")) 
		{
			
			
			System.setProperty("webdriver.gecko.driver","F:\\velocity pune\\automation , akasha sir\\firefox\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		    	driver = new FirefoxDriver();
			
		    
			
//			System.setProperty("Webdriver.ie.driver","F:\\velocity pune\\automation , akasha sir\\internet Exploer\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
//				driver = new InternetExplorerDriver();
			  
		}
		
		if(browser.equalsIgnoreCase("InternetExplorer")) 
		{
			
			System.setProperty("webdriver.ie.driver","F:\\velocity pune\\automation , akasha sir\\internet Exploer\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
				driver.manage().window().maximize();
			  
		}
		
		
		
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		 }
		
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
		
		swagLab1 = new SwagLab1(driver) ;
		
		addTOCardPage2 = new AddToCardPage2(driver);
		
		 yourCardPage3 = new YourCardPage3(driver);
		
		 overView5 = new OverView5(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
		
		driver.get("https://www.saucedemo.com/");
		
	//	driver.manage().window().maximize();
		
		
		
		swagLab1.sendUserName("standard_user");
		
		swagLab1.sendPassword("secret_sauce");
		
		swagLab1.clickOnLoginButton();
		
	}
	
	
	@Test
	public void test1() {
		System.out.println("test1NG");
		
		testId = 201;
		
		addTOCardPage2.clickOnAddToCardButton();
		
		addTOCardPage2.clickOnAddCardSymbol();
	
		String v = driver.getCurrentUrl();
		
		String l = driver.getTitle();
		
	//	soft = new SoftAssert ();
		
	//	soft.assertEquals(v, g);
		
	//	soft.assertNotEquals(l, l,"assertNOtEquals");
		
//		soft.assertTrue(false);
//		
//		soft.assertFalse(false);
//		
//		soft.fail();
//		
		boolean k =	v.equals("https://www.saucedemo.com/cart.html");
		
		if (k)
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		
		boolean z =	l.equals("Swag Labs");
		
		if (z)
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		// soft.assertAll();
	}
	
	@Test 
	public void test2() {
		System.out.println("test2NG");
		
		testId=202;
		
		addTOCardPage2.clickOnAddToCardButton();
		
		addTOCardPage2.clickOnAddCardSymbol();
	
		String v = driver.getCurrentUrl();
		
		String l = driver.getTitle();
		
		boolean k =	v.equals("https://www.saucedemo.com/cart.html");
		
		if (k == true)
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		
		//Assert.assertEquals(v, k,"Apply Hard Assertion by Akshay ");
		
		
		boolean z =	l.equals("Swag Labs");
		
		System.out.println(z);
		
		if (z == true)
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		
		
		
		
	String o =	yourCardPage3.getTextOfYourCart();
	
	System.out.println(o);
	
	yourCardPage3.clickOnCheakoutButton();
	
	}
	
	
	@AfterMethod
	public void logOutFromApllication(ITestResult result) throws IOException, InterruptedException 
		{
		
			System.out.println("afterMethod");
			
			if(ITestResult.FAILURE == result.getStatus()) {
				
				Utility.getScreenShot(driver, testId);
			}
			
			
		
		
		overView5.clickOnMenuButton();
		
		overView5.clickOnLogoutButton();
		
		
		
		}	
		
		
	
	
	@AfterClass
	public void closeTab() {
		System.out.println("afterClass");
		
		swagLab1=null;
		 addTOCardPage2=null;
			}
		
	@AfterTest
	public void afterTest() throws InterruptedException {
	System.out.println("afterTest");
	
	Thread.sleep(3500);
	
	driver.quit();
	
	driver=null;
	System.gc();
	
	
	}

	
	
	
	
	
	
}
