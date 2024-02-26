package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class CreateNewDesignPage {
	
	WebDriver dr = null;
	By SearchInput = By.id("searchTerm");
	By SearchBtn = By.xpath("//span[contains(text(),'search')]");
	By SearchText = By.xpath("//h1[contains(text(),'Templates')]");
	By BrandLogo = By.xpath("//header/div[@id='bc-global-navigation']/div[2]/div[1]/div[1]");
	By Footer = By.xpath("//p[contains(text(),'BrandCrowd is handcrafted from around the world')]");
	By Insta = By.xpath("//*[@id=\"Instagram Container\"]/div/div[1]/label/span[2]");
	
	public CreateNewDesignPage(WebDriver dr) {
		this.dr = dr;
	}
	
	public void setSearchInput(String text) {
//		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("__JSBridgeIframe_1.0__")));
	
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(SearchInput).clear();
		dr.findElement(SearchInput).sendKeys(text);
	}
	public void clickSearchBtn() {
		
		dr.findElement(SearchBtn).click();
	}
	public void isVisiSearchText() {		
		boolean txt = dr.findElement(SearchText).isDisplayed();
		if(txt = true)
			System.out.println("Search Result Visible");
	}
	public void isVisiBrandLogo() {
		boolean logo = dr.findElement(BrandLogo).isDisplayed();
		if(logo = true)
			System.out.println("Brand logo exists");		
	}
	public void isVisiFooter() {
		boolean foot = dr.findElement(Footer).isDisplayed();
		if(foot = true)
			System.out.println("Footer exists");
	}
	public void isVisiInsta() {
		boolean insta = dr.findElement(Insta).isDisplayed();
		if(insta = true)
			System.out.println("Instagram checkbox exists");
	}
	
}