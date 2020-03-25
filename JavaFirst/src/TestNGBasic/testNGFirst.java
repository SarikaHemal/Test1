package TestNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGFirst {
	// Pre-coditions annotations starting with @Before
	
	@BeforeMethod
	@BeforeSuite
	public void setUp() {
		System.out.println("setup sytem property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser ");
	}
	
	
	@BeforeTest
	public void login() {
		System.out.println("login Method ");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL ");
	}
	// Test cause starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title test");
	}
	
	// post condition starting with @After	
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}
	


}
