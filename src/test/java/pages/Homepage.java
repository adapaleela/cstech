package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='w-nav-control']")
	public WebElement menu_icon;
	
	@FindBy(xpath="//*[text()='Careers']")
	public WebElement careers;
	
	@FindBy(xpath="(//*[text()='Current Openings'])[1]")
	public WebElement current_openings;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void click_menu_icon()
	{
		menu_icon.click();
	}
	
	public void click_careers()
	{
		careers.click();
	}
	
	public void click_current_openings()
	{
		current_openings.click();
	}
}
