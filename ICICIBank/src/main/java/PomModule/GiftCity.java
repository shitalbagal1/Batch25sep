package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCity {


	@FindBy (xpath="//span[text()='Personal Banking'][1]")
	 private WebElement personalbanking;
	
	@FindBy (xpath="//span[text()='Capital Markets'][1]")
	 private WebElement capitalmarket;
	
	@FindBy (xpath="//span[text()='Global Markets'][1]")
	 private WebElement globalmarket;
	
	@FindBy (xpath="//button[text()='Next']")
	 private WebElement next;
	
	@FindBy (xpath="//button[text()='Previous']")
	 private WebElement previous;

	
	public GiftCity(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickpersonalbanking() {
		personalbanking.click();
	}
	
	public void clickcapitalmarket() {
		capitalmarket.click();
	}
	
	public void clickglobalmarket() {
		personalbanking.click();
	}
	
	public void clicknext() {
		next.click();
	}
	
	public void clickprevious() {
		previous.click();
	}
	
	
	
	
	
}
