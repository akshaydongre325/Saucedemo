package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.AddToCardPage2;
import pom.OverView5;
import pom.SwagLab1;
import pom.YourCardPage3;
import pom.YourInformationPage4;
import utils.Utility;

public class TestNG_practicse extends Browser {


		private WebDriver driver ;
		private SwagLab1 swagLab1;
		private AddToCardPage2 addTOCardPage2;
		private YourCardPage3 yourCardPage3 ;
		private OverView5 overView5 ;
		private YourInformationPage4 yourInformationPage4 ;
		private int testId ; 
	 
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		
	 @BeforeTest
	 @Parameters("browser")
	 public void beforeTest (String browser) throws InterruptedException {
		 
		 System.out.println(browser);
		 
	if(browser.equalsIgnoreCase("chrome")) 
	{
		
//		 System.setProperty("webdriver.chrome.driver","F:\\velocity pune\\automation , akasha sir\\chrome\\chromedriver_win32\\chromedriver.exe");
//		 	driver = new ChromeDriver();
			
			System.out.println("start chrome");
		
			driver = launchChromeBrowser();
			
	}
		 
	if(browser.equalsIgnoreCase("FirefoxDriver")) 
	{
		System.out.println("start firefox");
		
		driver = launchFireFoxBrowser();
		
		
//		System.setProperty("webdriver.gecko.driver","F:\\velocity pune\\automation , akasha sir\\firefox\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//	    	driver = new FirefoxDriver();
		
	  
		  
	}
	
	if(browser.equalsIgnoreCase("InternetExplorer")) 
	{
		
		System.setProperty("webdriver.ie.driver","F:\\velocity pune\\automation , akasha sir\\internet Exploer\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			driver.manage().window().maximize();
		  
	}
	
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	
	
	reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
	
	
	 }
	
		@BeforeClass
		 public void beforeClass () {
		  System.out.println("beforeClass");
			
		  swagLab1 = new SwagLab1(driver);
		  
		  addTOCardPage2 = new AddToCardPage2(driver);	
		  
		  yourCardPage3 = new YourCardPage3(driver);
		  
		  yourInformationPage4 = new YourInformationPage4(driver);
		  
		  overView5 = new OverView5(driver);
		  
		  
		}	
		
		
		
		@BeforeMethod
		public void beforeMethod() throws EncryptedDocumentException, IOException {
			System.out.println("beforeMethod");
			
			driver.get("https://www.saucedemo.com/");
			
			
		//	driver.manage().window().maximize();
			
			String userName = Utility.GetDataFromExelSheet("sample", 1, 1);
			swagLab1.sendUserName(userName);
			
			System.out.println(userName);
			
			
			String Password = Utility.GetDataFromExelSheet("sample", 0, 1);
			
			System.out.println(Password + "Password");
			
			swagLab1.sendPassword(Password);
			
			swagLab1.clickOnLoginButton();
			
		}
		
		
		@Test
		public void test1() {
			System.out.println("test1NG_practicse");
			
			testId= 101;
			
			
			
			addTOCardPage2.clickOnAddToCardButton();
			
			addTOCardPage2.clickOnAddCardSymbol();
		
			String v = driver.getCurrentUrl();
			
			String l = driver.getTitle();
			
			String g = "https://www.saucedemo.com/cart.html";
			

//			
//			SoftAssert soft = new SoftAssert ();
//			
//			soft.assertEquals(l, g);
//			
		//	soft.assertNotEquals(l, l,"assertNOtEquals");
			
//			soft.assertTrue(false);
//			
//			soft.assertFalse(false);
//			
//			soft.fail();
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
			
		//	soft.assertAll();
			
			
			System.out.println(testId);
		}
		
		@Test
		public void test2() throws InterruptedException {
			System.out.println("test2NG_practicse");
			
			testId = 102;
			
			
			
			addTOCardPage2.clickOnAddToCardButton();
			
			addTOCardPage2.clickOnAddCardSymbol();
		
			String v = driver.getCurrentUrl();
			
			String l = driver.getTitle();
			
			boolean k =	v.equals("https://www.saucedemo.com/cart.html");
			
			if (k== true)
			{
				System.out.println("correct url");
			}
			else
			{
				System.out.println("incorrect url");
			}
			
		//	Assert.assertEquals(v, l,"Apply Hard Assertion by Akshay ");
			
			
			boolean z =	l.equals("Swag Labs");
			
			System.out.println(z);
			
			if (z== true)
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
		
		yourInformationPage4.sendFirstName();
		
		yourInformationPage4.sendPassword();
		
		yourInformationPage4.sendPinCode();
		
		yourInformationPage4.clickOnContinueButton();
		
		
		
		overView5.clickOnFinishButton();
		
		
		System.out.println(testId);
		
		}
		
		
		@AfterMethod
		public void logOutFromApllication(ITestResult result) throws IOException, InterruptedException {
			System.out.println("afterMethod");
			
			if(ITestResult.FAILURE == result.getStatus()) {
				
				Utility.getScreenShot(driver, testId);
			}
			
			
			
			overView5.clickOnMenuButton();
			
			overView5.clickOnLogoutButton();
			
			
			if(ITestResult.SKIP == result.getStatus()) {
				
				Utility.getScreenShot(driver, testId);
			}
			
			
		}
		
		@AfterClass
		public void closeTab() {
			System.out.println("afterClass");
			
		
			 swagLab1=null;
			 addTOCardPage2=null;
			 
			  yourCardPage3 = null ;
			  
			  yourInformationPage4 = null;
			  
			  overView5 = null;
		
		}
			
		@AfterTest
		public void afterTest() throws InterruptedException {
		System.out.println("afterTest");
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		driver=null;
		
		System.gc();
		
		
		}

	
	
	
	
	

}
