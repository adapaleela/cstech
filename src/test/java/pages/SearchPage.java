package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//*[@placeholder='Skills, Designation']")
	public WebElement skills;
	
	@FindBy(xpath="//*[@placeholder='Location']")
	public WebElement location;
	
	@FindBy(xpath="//*[@placeholder='Experience']")
	public WebElement experience;
	
	@FindBy(xpath="//*[text()='Search']")
	public WebElement search;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void fill_skills(String x)
	{
		skills.sendKeys(x);
	}
	
	public void fill_location(String x)
	{
		location.sendKeys(x);
	}
	
	public void fill_experience(String x)
	{
		experience.sendKeys(x);
	}
	
	public void click_search()
	{
		search.click();
	}
	
}
