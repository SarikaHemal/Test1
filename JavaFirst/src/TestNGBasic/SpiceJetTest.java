package TestNGBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpiceJetTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChomeDriver\\new\\chromedriver.exe");
		driver=new ChromeDriver();//launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/Default.aspx");
	}
	
	@Test
	public void titleTest() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void logoTest() {
		boolean b=driver.findElement(By.xpath("//a[contains(@class,'spicejet_logo')]")).isDisplayed();
		System.out.println(b);
	}
	@Test
	public void loginButtonTest() {
		driver.findElement(By.xpath("//a[contains(@id,'HyperLinkLogin')]")).click();
				//("")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
