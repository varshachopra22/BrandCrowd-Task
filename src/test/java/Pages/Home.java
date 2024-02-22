package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver dr = null;
	By MyAccount = By.xpath("//span[contains(text(),'My Account')]");
	By Email = By.xpath("//header/div[@id='bc-global-navigation']//input[2]");
	By LoginBtn = By.xpath("//header/div[@id='bc-global-navigation']//span[contains(text(),'Login')");
	By Password = By.xpath("//header/div[@id='bc-global-navigation']//input[3]");
	By CreateNewDesign_btn = By.xpath("//span[contains(text(),'Create new design')]");
		
	public Home(WebDriver dr) {
		this.dr = dr;
	}
	
	public void setMyAccount() {
		dr.findElement(MyAccount).click();
	}
	public void setEmail() {
		dr.findElement(Email).sendKeys("tech-challenge@varsha.com");
	}
	public void setLoginBtn() {
		dr.findElement(LoginBtn).click();
	}
	public void setPassword() {
		dr.findElement(Password).sendKeys("Challenge1");
	}
	public void seCreateNewDesign_btn() {
		dr.findElement(CreateNewDesign_btn).click();
	}
}
