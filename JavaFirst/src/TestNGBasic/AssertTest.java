package TestNGBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\ChomeDriver\\new\\chromedriver.exe");
		driver =new ChromeDriver();//launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	}
	@Test
	public void amazonTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Amazon","Title is not match");
	}
	@Test
	public void amazonLogoTest() {
		boolean b=driver.findElement(By.xpath("//span[contains(@class,'nav-sprite nav-logo-base')]")).isDisplayed();
		//Assert.assertTrue(b);
		Assert.assertTrue(b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
