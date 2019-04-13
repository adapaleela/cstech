package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobListpage 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//*[text()='Programmer analyst '])[1]")
	public WebElement joblist;
	
	public JobListpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
