package beakAIOps.TestingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeactivateGlobalLevelScriptPOMClass 
{

//WebDriver Define
	  private WebDriver driver;

//Deactivate the Global Level Script
	  
	 //Step-1 Click On Filter Icon
	  
	  	//Navigate to I-Frame
			@FindBy(xpath = "//iframe[@id='199']")
				private WebElement iframeElement;
			
		//Click on Filter 
			//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/*[name()='svg'][1]")
			@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[23]")	
			private WebElement filtericon;
				public void clickOnFilterIcon() throws InterruptedException
				{ 
					Thread.sleep(2000);
					driver.switchTo().frame(iframeElement);
					Thread.sleep(2000);
					filtericon.click();	
					System.out.println("exe-1");
					
				}
				
//Step-2 Enter The Script Name in to the Filter Input Field to Filter Out >>	
		@FindBy(xpath="//input[@placeholder='filter values']")
			private WebElement enterScriptName;
			public void enterTheScriptNameToFilterOut() throws InterruptedException
				{
				Thread.sleep(1000);
					enterScriptName.sendKeys("Edited Global Script ");	
					
		//Click on "Select All" Button
			WebElement clickOnSelectAllButton = driver.findElement(By.xpath("//span[normalize-space()='Select All']"));
				clickOnSelectAllButton.click();
				
		//Click On "OK" Button
			WebElement clickOnOKButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));	
				Thread.sleep(1000);
				clickOnOKButton.click();
				}
				
//Step-3 Click on Deactivate Action Icon	
		
		//Navigate to I-Frame	
			@FindBy(xpath = "//iframe[@id='199']")
			private WebElement iframeElement1;
		
       //Click on Deactivate Action Icon	
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]")
		//@FindBy(xpath="(//div[@role='button'])[2]")	
		private WebElement deactivateActionIcon;
			public void clickOnDeactivateActionIcon() throws InterruptedException
			{
				Thread.sleep(1000);
				//driver.switchTo().frame(iframeElement1);
				Thread.sleep(2000);
				deactivateActionIcon.click();
				System.out.println("exe-2");
				driver.switchTo().defaultContent();
			}
//Step-4 Click on Pop-up "Deactivate" Button 
			
	    @FindBy(xpath="//span[text()='Deactivate']")
	    	private WebElement clickDeactivate;
	    	public void clickOnDeactivatePopupButton()
	    	{
	    		clickDeactivate.click();
	    	}
	
//Step-5 Now Get the Deactivate Pop-up Message for Verification	    	
	
	    @FindBy(xpath="//div[text()='Script deactivated successfully']")
			private WebElement deactivateSucessMessage;
			public void getSucessMessage()
			{
				String GetSucessMessage= deactivateSucessMessage.getText();
				driver.switchTo().defaultContent();
			}
	
			
//PageFactory Define >>
			
	public DeactivateGlobalLevelScriptPOMClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}			
			
}
