package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@ type='text']"));
		username.sendKeys("velocity");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("fghhh5522");
		
		WebElement login=driver.findElement(By.xpath("//button[  text()='Log in']"));
		login.click();		
		
		//WebElement creatnewacc=driver.findElement(By.xpath("//a[text() ='Create New Account']"));
		//creatnewacc.click();
		
		
		
		
		
		
		
		
	}

}
