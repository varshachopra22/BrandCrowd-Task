package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;

public class CreateNewDesignPage {
	
	WebDriver dr = null;
	By SearchInput = By.xpath("//input[@id='searchTerm']");
	By SearchBtn = By.xpath("//span[contains(text(),'search')]");
	By BrandLogo = By.xpath("//header/div[@id='bc-global-navigation']/div[2]/div[1]/div[1]");
	By Footer = By.xpath("//body/div[@id='create-new-designs-search-results-container']/div[1]/footer[1]/div[1]/div[1]/p[1]");
	By Insta = By.xpath("//*[@id=\"Instagram Container\"]/div/div[1]/label/span[2]");
	
	public CreateNewDesignPage(WebDriver dr) {
		this.dr = dr;
	}
	
	public void setSearchInput(String text) {
		dr.findElement(SearchInput).clear();
		dr.findElement(SearchInput).sendKeys(text);
	}
	public void clickSearchBtn() {
		
		dr.findElement(SearchBtn).click();
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