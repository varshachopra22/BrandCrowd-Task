package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	WebDriver dr = null;
	
	//Home Page locators
	By MyAccount = By.xpath("//span[contains(text(),'My Account')]");
	By Email = By.xpath("//*[@id=\"signin\"]/input[2]");
	By LoginBtn = By.xpath("//*[@id=\"signin\"]/div/div/button/span");
	By Password = By.xpath("//*[@id=\"signin\"]/input[3]");
	By CreateNewDesign_btn = By.xpath("//*[@id=\"__layout\"]/section/header/div[3]/div/div/div/div[2]/a");
		
	public Home(WebDriver dr) {
		this.dr = dr;
	}
	
	//Login Page methods
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
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("__JSBridgeIframe_1.0__")));
		dr.findElement(CreateNewDesign_btn).click();
	}
}
