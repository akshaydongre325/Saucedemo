package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.SQL_Tutorial2;
import pom.SqlQureyPage3;
import pom.W3School_MainPage1;

public class TestClass {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\velocity pune\\automation , akasha sir\\selenium  2nd\\class 35 ( 6-1-22 ) ( string method , replace,startsWith,endWith,trim,split, tochararray, compareTO , selenium instrallation)\\selemium app extraction\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);

		driver.manage().window().maximize();
	

		W3School_MainPage1 w3School_MainPage1 = new W3School_MainPage1 (driver);
		
		w3School_MainPage1.clickOnLearnSql();
		
		
		SQL_Tutorial2 sQL_Tutorial2 = new SQL_Tutorial2(driver);
		
		sQL_Tutorial2.clickOnLearnSql();
		
		
		
		ArrayList<String>addr = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(addr.get(1));
		
		
		
		SqlQureyPage3 sqlQureyPage3 = new SqlQureyPage3 (driver);
		
		sqlQureyPage3.clickOnRestoreDataBase();
		
		
		Thread.sleep(3000);
		
		Alert ak = driver.switchTo().alert();
		
		
		ak.accept();
	
		
		SqlQureyPage3 sqlQureyPage31 = new SqlQureyPage3(driver);
		
		sqlQureyPage31.clickOnRestoreDataBase();
		
		
		sqlQureyPage31.clickOnCustomers();
		
		sqlQureyPage31.clickOnSqlSelect();
		
		
		Thread.sleep(3000);


		Actions act = new Actions (driver);
	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(3000);
		
		act.sendKeys(Keys.DELETE).build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys("Select * from Customers where ContactName Like 'Ana%' ;").build().perform();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		sqlQureyPage31.clickOnRunSql();
		
		
		
		
		
}	
}
