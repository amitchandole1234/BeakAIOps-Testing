package beakAIOps.TestingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeactivateGlobalLevelScriptPOMClass 
{

//WebDriver Define-->
	  private WebDriver driver;

//PageFactory Define-->
		public DeactivateGlobalLevelScriptPOMClass(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}	  

//Step-1 Click On Filter Icon to Filter the Script
	  
	  	//Navigate to I-Frame
			@FindBy(xpath = "//iframe[@id='199']")
				private WebElement iframeElement;
			
		//Click on Filter icon 
			
			@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[23]")	
			private WebElement filtericon;
				public void clickOnFilterIcon() throws InterruptedException
				{ 
					Thread.sleep(1000);
					driver.switchTo().frame(iframeElement);
					Thread.sleep(2000);
					filtericon.click();	
				}

//Step-2 Enter the Script Name inside the Filter Input 				

		@FindBy(xpath="//span[normalize-space()='Select All']")
			private WebElement clickOnSelectAllButton;		
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
			private WebElement clickOnOKButton;
		
		@FindBy(xpath="(//div[@role='button'])[2]")
			private WebElement clickOnDeactivateActionIcon;
		
		@FindBy(xpath="//span[contains(text(),'Edited Global Script')]")
		private WebElement valuePresent;
				
		@FindBy(xpath="//input[@placeholder='filter values']")
			private WebElement enterScriptName;
			public void enterTheScriptNameToFilterOut() throws InterruptedException
				{
					Thread.sleep(1000);
					enterScriptName.sendKeys("Edited Global Script ");	
					Thread.sleep(1000);
					String ValuePresent= valuePresent.getText();
					 	
			        	//Check the Filter Value is Present or No value		   
					    if (ValuePresent.startsWith("Edited Global Script"))	
					    	{
					    		clickOnSelectAllButton.click();
					            Thread.sleep(1000);
					            clickOnOKButton.click();
					            clickOnDeactivateActionIcon.click();
					            driver.switchTo().defaultContent();
					            			    	
					    	} 
					    else
					    	{
					    	
					    		System.out.println("Cannot click on Select all and OK Button Bacause The Value is No Values");
					       }  				        				
			        			
				}

//Step-3 Click on Pop-up "Deactivate" Button 
			
	    @FindBy(xpath="(//span[normalize-space()='Deactivate'])[1]")
	    	private WebElement clickDeactivate;
	    	public void clickOnDeactivatePopupButton() throws InterruptedException
	    	{
	    		Thread.sleep(2000);
	    		clickDeactivate.click();
	    	}
	
//Step-4 Now Get the Deactivate Pop-up Message for Verification	    	
	
	    @FindBy(xpath="//div[text()='Script deactivated successfully']")
			private WebElement deactivateSucessMessage;
			public void getSucessMessage()
			{
				String GetSucessMessage= deactivateSucessMessage.getText();
				driver.switchTo().defaultContent();
			}
	
			
			
			
}
