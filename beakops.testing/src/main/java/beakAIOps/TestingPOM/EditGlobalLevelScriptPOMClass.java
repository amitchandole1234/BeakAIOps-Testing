package beakAIOps.TestingPOM;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditGlobalLevelScriptPOMClass 
{

//WebDriver Define	
	private static WebDriver driver;
	
//PageFactory Define >>
	
			public EditGlobalLevelScriptPOMClass(WebDriver driver) 
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}		
	
		
//Step-1 Click On Filter Icon to Filter the Script
	
	//Navigate to I-Frame-->
		@FindBy(xpath = "//iframe[@id='199']")
			private WebElement iframeElement;
			
	//Click On Filter Icon-->
		@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[23]")	
			private WebElement clickFilterIcon;
			public void clickOnFilterIcon() throws InterruptedException
			{ 
				Thread.sleep(1000);
				driver.switchTo().frame(iframeElement);
				Thread.sleep(3000);
				clickFilterIcon.click();	
			}
//Step-2 Enter the Script Name inside the Filter Input 
			
		@FindBy(xpath="//input[@placeholder='filter values']")
			private WebElement enterScriptName;
	
		@FindBy(xpath="//span[contains(text(),'Global Level Script')]")
			private WebElement valuePresent;

		@FindBy(xpath="//span[normalize-space()='Select All']")
			private WebElement clickOnSelectAllButton;

		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
			private WebElement clickOnOkButton;

		@FindBy(xpath="(//div[@role='button'])[1]")
			private WebElement clickOnEditActionIcon;

			public void enterTheScriptNameToFilterOut() throws InterruptedException 
			{
				
			    enterScriptName.sendKeys("Global Level Script"); // Pass the "Global Level Script" Input on Filter input Field.
			    Thread.sleep(2000);	    
			    String ValuePresent= valuePresent.getText();
			    
	//Check the Filter Value is Present or No value		   
			    if (ValuePresent.startsWith("Global Level Script"))	
			    	{
			    	 	clickOnSelectAllButton.click();
			            Thread.sleep(1000);
			            clickOnOkButton.click();
			            clickOnEditActionIcon.click();
			            //driver.switchTo().defaultContent();			    	
			    	} 
			    else
			    	{
			    	
			    		System.out.println("Cannot click on Select all and OK Button Bacause The Value is No Values");
			       }
			}
			
						
		
//Step-3 To Edit the Script Name "Global Level Script" To "Edited Global Script"
	
	   @FindBy(xpath="(//input[@id='standard-basic'])[1]")
	   		private WebElement clearScriptName;
	   		public void selectAllAndClearScriptName() throws InterruptedException
	   		{		
	   			Thread.sleep(1000);
	   			clearScriptName.sendKeys(Keys.CONTROL + "a"); //Select All Action
	   			clearScriptName.sendKeys(Keys.BACK_SPACE);    //Press Backspace to Clear Existing Script Name
	   			
		//Now Edit the "Global Level Script " To "Edited Global Script " 
	   			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //Added for Unique Script Name
	   			String todayDateTime = dateFormat.format(new Date());
	   			clearScriptName.sendKeys("Edited Global Script " + todayDateTime);	
	   			
		//Script Name is Updated Click on "Update" Button.
	   			Thread.sleep(1000);
	   			WebElement clickOnUpdateButton = driver.findElement(By.xpath("//span[normalize-space()='Update']"));
	   				clickOnUpdateButton.click();
	   		}
//Step-4 Click on "OK" Button :
	   		
	    @FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text add-btn']")
	    	private WebElement clickOK;
	    	public void clickOnOkButton() throws InterruptedException
	    	{
	    		Thread.sleep(1000);
	    		clickOK.click();
	    	}
	

	
	

}
