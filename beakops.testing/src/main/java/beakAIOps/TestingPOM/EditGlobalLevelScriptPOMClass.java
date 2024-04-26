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
		
//Step-1 Click On Filter Icon
	
		//Navigate to I-Frame
		@FindBy(xpath = "//iframe[@id='199']")
			private WebElement iframeElement;
			
		//Click On Filter Icon	
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/*[name()='svg'][1]")
			private WebElement clickFilterIcon;
			public void clickOnFilterIcon() throws InterruptedException
			{ 
				Thread.sleep(2000);
				driver.switchTo().frame(iframeElement);
				clickFilterIcon.click();	
			}
	
//Step-2 Enter The Script Name in to the Filter Input Field to Filter Out >>	
		
		 //Enter the Script Name to Filter Out 	
		@FindBy(xpath="//input[@placeholder='filter values']")
			private WebElement enterScriptName;
			public void enterTheScriptNameToFilterOut() throws InterruptedException
			{
				enterScriptName.sendKeys("Global Level Script ");
					
		 //Click on "Select All" Button
			WebElement clickOnSelectAllButton = driver.findElement(By.xpath("//span[normalize-space()='Select All']"));
				clickOnSelectAllButton.click();
					
		 //Click On "OK" Button
			WebElement clickOnOkButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));	
				Thread.sleep(1000);
				clickOnOkButton.click();
				driver.switchTo().defaultContent();
			}

//Step-3 Click on Edit Action Icon	
		//Navigate to I-Frame	
		@FindBy(xpath="//iframe[@id='199']")
			private WebElement ifreamele;
		
		//Click On Edit Action Icon
	    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	    	private WebElement clickEditAction;
	    	public void clickOnEditActionIcon() throws InterruptedException
	    	{
	    		Thread.sleep(1000);
	    		driver.switchTo().frame(ifreamele);
	    		clickEditAction.click();
	    		driver.switchTo().defaultContent();
	    	}

//Step-4 To Edit the Script Name "Global Level Script " To "Edited Global Script "
	
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
//Step-5 Click on "Ok" Button	
	    @FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text add-btn']")
	    	private WebElement clickOK;
	    	public void clickOnOkButton() throws InterruptedException
	    	{
	    		Thread.sleep(1000);
	    		clickOK.click();
	    	}
	
//PageFactory Define >>
	
		public EditGlobalLevelScriptPOMClass(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}	
	
	

}
