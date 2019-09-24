package TestNg;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNgyal2 {
	
		WebDriver driver;
		//String value="http://localhost:11153/wd/hub";
		
		@Test
		   public void firsttestingfile1() throws InterruptedException
		{
			
			 driver.findElement(By.id("LoginForm_username")).sendKeys("yalinis");
			 Thread.sleep(1000);
			}
		
		
		@BeforeTest
		public void launchBrowser() throws MalformedURLException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Desktop\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		/*DesiredCapabilities ds=DesiredCapabilities.chrome();
		ds.setPlatform(Platform.ANY);
		driver=new RemoteWebDriver(new URL(value),ds);
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");*/
		
		}
		@AfterTest
		public void SecondTest () throws InterruptedException {
			
			Thread.sleep(1000);
			driver.quit();
			
		}


	}



