package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalBanking {
	
	// Variables
		@FindBy (xpath="//span[]text()='Accounts']")
		private WebElement account;
		
		@FindBy( xpath="//span[]text()='Cards']")
		private WebElement cards;
		

		@FindBy(xpath="//span[]text()='Loans']")
		private WebElement loans;
		
		// Constructor
		
		public PersonalBanking(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		// Methods
		public void clickonAccounts()
		{
			account.click();
		}
		
		public void clickonCards()
		{
			cards.click();
		}
		
		public void clickonLoans() 
		{
			loans.click();

		}
		
		

	
	

}
