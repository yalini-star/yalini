package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG1 {
	
		WebDriver driver;
		@Test(priority=0)
		public void firsttestingfile() throws InterruptedException{
			
			driver.get("https://connect.maveric-systems.com/index.php/site/login");
		}
		@Test(priority=1)
		public void firsttestingfile1() throws InterruptedException{
			
			driver.get("https://www.toolsqa.com/automation-practice-form/");
		}
		
		@BeforeTest
		public void launchBrowser()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Desktop\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		@AfterTest
		public void SecondTest () {
			driver.quit();
			
		}


	}



