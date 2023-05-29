package pomscript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_page;

public class POM extends Base_page
{
	@FindBy(id="email")
	private WebElement usntbox;
	
	@FindBy(id="pass")
	private WebElement pwdtbox;
	
	@FindBy(xpath = "//button[.='Log in']")
	private WebElement logbtn;
	
	@FindBy(xpath="//input[@aria-label ='Search Facebook']")
	private WebElement search;
	
	public POM(WebDriver driver)
	{
	 super(driver);
	}
	
	
	public void undata(String un)
	{
		usntbox.sendKeys(un);
	}
	public void pwddata(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void log()
	{
		logbtn.click();
	}
	public void send(String sen)
	{
		search.sendKeys(sen);
		search.sendKeys(Keys.ENTER);
	}

 
		

}
