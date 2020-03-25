package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementTest {
	
	@Test
	public void mouseMovement() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\ChomeDriver\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();;
		Thread.sleep(3000);
		//driver.close();
	}
	
	
}
