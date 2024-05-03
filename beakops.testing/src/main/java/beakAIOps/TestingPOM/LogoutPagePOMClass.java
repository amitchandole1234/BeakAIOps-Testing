package beakAIOps.TestingPOM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPagePOMClass 
{

//WebDriver Define
	private WebDriver driver;
	
//Step-1 Click On Account Icon	
	@FindBy(xpath="//span[@class='alignSelfCenter cursor']//*[name()='svg']")
		private WebElement clickAccountIcon;
		public void clickOnAccountIcon() throws InterruptedException
		{
			Thread.sleep(1000);
			clickAccountIcon.click();
		}
//Step-2 Select Logout Option	
	@FindBy(xpath="//span[text()='Logout']")
		private WebElement clickLogout;
		public void clickOnLogoutOption() throws InterruptedException
		{
			Thread.sleep(1000);
			clickLogout.click();
		}
//Step-3 Click On "Yes" on Confirm Logout Pop-up	
	@FindBy(xpath="//span[text()='Yes']")
		private WebElement clickonYesAction;
		public void clickOnYesAction() throws InterruptedException
		{
			Thread.sleep(1000);
			clickonYesAction.click();	
			System.out.println("The User is Sucessfully Logged Out");
		}
	
//PageFactory	
	public LogoutPagePOMClass(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	
	
}
