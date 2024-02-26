package SmokeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateNewDesignPage;
import Pages.Home;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatDesignSmokeTest {

	public static WebDriver dr = null;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();		
		dr = new ChromeDriver();
		dr.get("https://brandcrowd.com/maker/mydesigns/logodrafts/bfc53a38-e7e3-40c3-ada0-a11bd83829dc/templatetypes?searchTerm=tech+challenge");
		dr.manage().window().maximize();
		
		Home login = new Home(dr);
		login.setEmail();
		login.setPassword();
		login.setLoginBtn();
	}
	
	@Test
	public static void SmokeTest() {
					
		CreateNewDesignPage obj = new CreateNewDesignPage(dr);
		
		obj.isVisiBrandLogo();
		
		obj.isVisiInsta();	
		
//		JavascriptExecutor js = (JavascriptExecutor)dr;
//		js.executeAsyncScript("window.scrollBy(500,document.body.scrollHeight)");
		
		obj.isVisiFooter();		
		
		}
	
	@AfterTest
	public void tearDown() {
		dr.close();
		System.out.println("Smoke test completed successfully");
	}
}
