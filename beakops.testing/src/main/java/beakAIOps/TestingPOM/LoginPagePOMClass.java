package beakAIOps.TestingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	
//WebDriver Define
	private WebDriver driver;
	
//Enter The User Email Address
	@FindBy(xpath="//input[@id='outlined-adornment-weight']")
	private WebElement enterEmail;
	public void enterTheUserEmailAddress() throws InterruptedException
	{
		Thread.sleep(2000);
		enterEmail.sendKeys("amit.tester@ilink-systems.com"); // Here used "amit.tester@ilink-systems.com"			
	}
	
//Click on Continue Button 
	@FindBy(xpath="//span[text()='Continue ']")
	private WebElement clickaction;
	public void clickOnCountinueButton()
	{
		clickaction.click(); 
	}

//Enter The User Password 
	@FindBy(xpath="//input[@id='showPassword']")
	private WebElement enterPassword;
	public void enterUserPassword()
	{
		enterPassword.sendKeys("Beak@1234");	
	}
	
//Click on Login Button 
	@FindBy(xpath="//span[text()='Login']")
	private WebElement clickLogin;
	public void clickOnLoginButton() throws InterruptedException
	{
		clickLogin.click();
		Thread.sleep(3000);
	}
	
//PageFactory 
	
	public LoginPagePOMClass(WebDriver driver)

	{
		this.driver = driver;
	    PageFactory.initElements(driver,this);
	}

}
