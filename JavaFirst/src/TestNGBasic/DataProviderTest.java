package TestNGBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProviderTest {
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
		//driver.findElement(By.xpath("//a[@href='https://book.spicejet.com/Login.aspx']")).click();
		//Select s1= driver.findElement(By.xpath(xpathExpression))
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
