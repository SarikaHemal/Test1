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
		driver.get("https://www.amazon.com/");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//a//span[@class='nav-action-inner']")).click();
				
		Thread.sleep(5000);
		driver.close();
	}
	
	
}
