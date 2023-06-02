package pomtest;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompage.LoginPage;

public class BaseTest {
	WebDriver driver;
	LoginPage lp;
	@BeforeSuite
	public void initBrowser() throws IOException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\Selenium Download\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String path = System.getProperty("user.dir")+"//config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		driver.get(prop.getProperty("testsiteurl"));
		}

	@BeforeClass
	public void createObject()
	{
		lp = new LoginPage(driver);
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException
	{
//		Thread.sleep(3000);
//		driver.close();
	}
}

