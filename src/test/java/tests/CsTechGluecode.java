package tests;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import pages.JobListpage;
import pages.SearchPage;

public class CsTechGluecode
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Homepage hp;
	public JobListpage jp;
	public SearchPage sp;
	public Scenario s;
	public Properties p;
	
	@Before
	public void method1(Scenario s)throws Exception
	{
		this.s=s;
		File f=new File("E:\\leelajava\\cstech\\src\\test\\resources\\repository\\cstech_properties.properties");
		FileReader fr=new FileReader(f);
		p=new Properties();
		p.load(fr);
	}
	
	@Given("^launch site$")
	public void method2()
	{
		System.setProperty("webdriver.chrome.driver",p.getProperty("cdpath"));
		driver=new ChromeDriver();
		hp=new Homepage(driver);
		jp=new JobListpage(driver);
		sp=new SearchPage(driver);
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,20);
	}
	
	@When("^click on menu icon$")
	public void click_on_menu_icon()
	{
		wait.until(ExpectedConditions.visibilityOf(hp.menu_icon));
		hp.click_menu_icon();
	}
	
	@And("^click on careers$")
	public void click_on_careers()
	{
		wait.until(ExpectedConditions.visibilityOf(hp.careers));
		hp.click_careers();
	}
	
	@And("^click on current openings$")
	public void click_on_current_openings()
	{
		wait.until(ExpectedConditions.visibilityOf(hp.current_openings));
		hp.click_current_openings();
	}
	
	@And("^enter skills and designation$")
	public void enter_skills_and_designation()
	{
		wait.until(ExpectedConditions.visibilityOf(sp.skills));
		sp.fill_skills("ASP.Net");
	}
	
	@And("^enter location$")
	public void enter_location() 
	{
		wait.until(ExpectedConditions.visibilityOf(sp.location));
		sp.fill_location("Hyderabad,Telangana,India");
	}
	
	@And("^enter experience$")
	public void enter_experience() 
	{
		wait.until(ExpectedConditions.visibilityOf(sp.experience));
		sp.fill_experience("2");
	}
	
	@And("^click on search button$")
	public void click_on_search_button()
	{
		wait.until(ExpectedConditions.visibilityOf(sp.search));
		sp.click_search();
	}
	
	@Then("^validate list of jobs are available or not$")
	public void validate_list_of_jobs_are_available_or_not() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(jp.joblist));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",jp.joblist);
		Thread.sleep(5000);
	}
	
	@When("^close site$")
	public void close_site()
	{
		driver.close();
	}
}
