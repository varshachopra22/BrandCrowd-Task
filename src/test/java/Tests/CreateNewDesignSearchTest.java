package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateNewDesignPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewDesignSearchTest {
	
	public static WebDriver dr = new ChromeDriver();
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		
		
	}
	
	@Test
	public static void SearchTest() {
		
		
		dr.get("https://brandcrowd.com/maker/mydesigns/logodrafts/bfc53a38-e7e3-40c3-ada0-a11bd83829dc/templatetypes?searchTerm=tech+challenge");
		dr.manage().window().maximize();
		CreateNewDesignPage obj = new CreateNewDesignPage(dr);
		
		obj.setSearchInput("test");
		
		obj.clickSearchBtn();
		
	}

	@AfterTest
	public void tearDownTest() {
		dr.close();
		System.out.println("Test completed successfully");
	}
}
