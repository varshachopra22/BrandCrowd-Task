package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateNewDesignPage;
import Pages.Home;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewDesignSearchTest {
	
	public static WebDriver dr = null;
	
	@BeforeTest
	public void setUpTest() {
		
		//initialising Webdriver
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
		
		//Opening URL in browser
		dr.get("https://brandcrowd.com/maker/mydesigns/logodrafts/bfc53a38-e7e3-40c3-ada0-a11bd83829dc/templatetypes?searchTerm=tech challenge");
		dr.manage().window().maximize();
		
		//Logging in
		Home login = new Home(dr);
		login.setEmail();
		login.setPassword();
		login.setLoginBtn();
	}
	
	@Test
	//Search Functionality test
	public static void SearchTest() {
		
		CreateNewDesignPage obj = new CreateNewDesignPage(dr);
		
		obj.setSearchInput("test");
		
		obj.clickSearchBtn();
		
		obj.isVisiSearchText();
		
	}

	@AfterTest
	public void tearDownTest() {
		dr.close();
		System.out.println("Search Test completed");
	}
}
