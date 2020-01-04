package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	private By signin=By.xpath("//span[contains(text(),'Login')]");
	private By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By NavBar=By.xpath("//nav[@class='navbar-collapse collapse']");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		
		
		return driver.findElement(signin);
	}
	
	
	public WebElement getNavigationBar()
	{
		
		
		return driver.findElement(NavBar);
	}

	public WebElement getTitle()
	{
		
		
		return driver.findElement(title);
	}
	
	
	
	
	
	
	
}
