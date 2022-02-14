package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser 
{
	
	
	public static WebDriver launchChromeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","F:\\velocity pune\\automation , akasha sir\\chrome\\chromedriver_win32\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	 	return  driver;
	}

	public static WebDriver launchFireFoxBrowser() 
	{
		System.setProperty("webdriver.gecko.driver","F:\\velocity pune\\automation , akasha sir\\firefox\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return  driver;
	}



}
