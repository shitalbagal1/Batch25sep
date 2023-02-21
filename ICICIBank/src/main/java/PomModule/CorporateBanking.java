package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporateBanking {
	
	@FindBy (xpath="//a[text()='Corporate']")
	 private WebElement corporate;
	
	@FindBy (xpath="//span[text()='Accounts']")
	 private WebElement accounts;
	
	@FindBy (xpath="//span[text()='Transact']")
	 private WebElement transact;
	
	@FindBy (xpath="//span[text()='Credit']")
	 private WebElement creadit;
	
	@FindBy (xpath="//span[text()='Care']")
	 private WebElement cars;
	
	public CorporateBanking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickcorporate() {
		corporate.click();
	}
	
	public void clickaccounts() {
		accounts.click();
	}
	
	public void clicktransact() {
		transact.click();
	}
	
	public void clickcredait() {
		creadit.click();
	}
	
	public void clickcare() {
		creadit.click();
	}
	
	
	
}
