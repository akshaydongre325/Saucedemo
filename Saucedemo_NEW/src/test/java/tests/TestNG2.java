package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
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

public class TestNG2 {
	
//	SwagLab1 swagLab1;
//	 AddToCardPage2 addTOCardPage2;
//	 
	
//	 @BeforeTest
//	 @Parameters("browser")
//	 public void launchBrowser (String browser) {
//		 
//		 System.out.println(browser);
//		
		 
		
		 
//	if(browser.equalsIgnoreCase("chrome")) {
//		
//		
//		
//	}
//		 
//	if(browser.equalsIgnoreCase("InternetExplorer")) {
//		
//		System.setProperty("Webdriver.ie.driver","F:\\velocity pune\\automation , akasha sir\\internet Exploer\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		 this.driver = driver ; 
//	}
	
	
		 
	// }
	WebDriver driver ;
		@BeforeClass
		 @Parameters("browser")
		 public void beforeClass (String browser) {
			 
			 System.out.println(browser);
			
			 
			
			 
		if(browser.equalsIgnoreCase("chrome")) {
			
		
		
		
			System.out.println("beforeClass");
			
			
			
			 System.setProperty("webdriver.chrome.driver","F:\\velocity pune\\automation , akasha sir\\chrome\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				System.out.println("start chrome");
				driver.get("https://www.saucedemo.com/"); 
			
			
				driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			
			this.driver=driver;
			
		}
		
		
		if(browser.equalsIgnoreCase("InternetExplorer")) {
			
			System.setProperty("webdriver.ie.driver","F:\\velocity pune\\automation , akasha sir\\internet Exploer\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			 this.driver = driver ; 
			 
			 System.out.println("start InternetExplorer");
				driver.get("https://www.saucedemo.com/"); 
			
			
				driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
			
		}
		
		
		
		
		
		
		
		}
		
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforeMethod");
			
			SwagLab1 swagLab1 = new SwagLab1(driver) ;
			
		//	driver.manage().window().maximize();
			
			
			swagLab1.sendUserName("standard_user");
			
			swagLab1.sendPassword("secret_sauce");
			
			swagLab1.clickOnLoginButton();
			
		}
		
		
		@Test
		public void test1() {
			System.out.println("test1");
			
			AddToCardPage2 addTOCardPage2 = new AddToCardPage2(driver);
			
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
			
			if (k== true)
			{
				System.out.println("correct url");
			}
			else
			{
				System.out.println("incorrect url");
			}
			
			boolean z =	l.equals("Swag Labs");
			
			if (z== true)
			{
				System.out.println("correct title");
			}
			else
			{
				System.out.println("incorrect title");
			}
			
		//	soft.assertAll();
		}
		
		@Test
		public void test2() {
			System.out.println("test2");
			
			AddToCardPage2 addTOCardPage2 = new AddToCardPage2(driver);
			
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
			
			if (z== true)
			{
				System.out.println("correct title");
			}
			else
			{
				System.out.println("incorrect title");
			}
			
			YourCardPage3 yourCardPage3 = new YourCardPage3(driver);
			
			
			
		String o =	yourCardPage3.getTextOfYourCart();
		
		System.out.println(o);
		
		yourCardPage3.clickOnCheakoutButton();
		
		
		YourInformationPage4 yourInformationPage4 = new YourInformationPage4(driver);
		
		yourInformationPage4.sendFirstName();
		
		yourInformationPage4.sendPassword();
		
		yourInformationPage4.sendPinCode();
		
		yourInformationPage4.clickOnContinueButton();
		
		OverView5 overView5 = new OverView5(driver);
		
		overView5.clickOnFinishButton();
		
		
		}
		
		
		@AfterMethod
		public void logOutFromApllication() {
			System.out.println("afterMethod");
			
			OverView5 overView5 = new OverView5(driver);
			
			overView5.clickOnMenuButton();
			
			overView5.clickOnLogoutButton();
			
			
			
			
		}
		
		@AfterClass
		public void closeTab() {
			System.out.println("afterClass");
			
//		
//			 swagLab1=null;
//			 addTOCardPage2=null;
			driver.close();
			
		}
			
//		@AfterTest
//		public void afterTest() {
//		System.out.println("afterTest");
//		
//		driver.quit();
//		
//		driver=null;
//		System.gc();
//		
//		
//		}

	
	
	
	
	
	
}
