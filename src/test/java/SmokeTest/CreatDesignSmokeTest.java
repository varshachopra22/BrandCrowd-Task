package SmokeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateNewDesignPage;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatDesignSmokeTest {

	public static WebDriver dr = null;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver();
	}
	
	@Test
	public static void SmokeTest() {
					
		CreateNewDesignPage obj = new CreateNewDesignPage(dr);
		
		dr.get("https://brandcrowd.com/maker/mydesigns/logodrafts/bfc53a38-e7e3-40c3-ada0-a11bd83829dc/templatetypes?searchTerm=tech+challenge");
		dr.manage().window().maximize();
		
		obj.isVisiBrandLogo();
		
		obj.isVisiFooter();
		
		obj.isVisiInsta();	
		
		}
	
	@AfterTest
	public void tearDown() {
		dr.close();
		System.out.println("Smoke test completed successfully");
	}
}
