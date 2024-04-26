package beakAIOps.TestingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReactivateGlobalLevelScriptPOMClass 
{

//WebDriver Define	
	private WebDriver driver;
	
//PageFactory	
	public ReactivateGlobalLevelScriptPOMClass(WebDriver driver)
	{
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
//Step-1 Navigate to Inactive Script Repository	
	
		//Navigate to I-Fream
		@FindBy(xpath="//iframe[@id='199']")
			private WebElement ifream3;
		
		//Click On Status Filter
		//@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[6]")
		@FindBy(xpath="//span[text()='Active']")
			private WebElement clickFilterDropdown;
			public void selectInactiveScriptRepository() throws InterruptedException
			{
				Thread.sleep(1000);
				driver.switchTo().frame(ifream3);
				Thread.sleep(3000);
				clickFilterDropdown.click();
				Thread.sleep(2000);
			
				
		//Select the "Inactive" option from drop-down		
		WebElement selectInactiveOption = driver.findElement(By.xpath("//span[text()='Inactive']"));
			Thread.sleep(1000);
			selectInactiveOption.click();
			driver.switchTo().defaultContent();
			}

//Step-2 Click on Filter Icon
			
			//Navigate to I-Frame
			@FindBy(xpath = "//iframe[@id='199']")
				private WebElement iframeElement;
			
	        //Click On Filter Icon
			@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/div[1]/*[name()='svg'][1]")
				private WebElement clickOnFilter;
				public void clickOnFilterIcon() throws InterruptedException
				{ 
					Thread.sleep(2000);
					driver.switchTo().frame(iframeElement);
					clickOnFilter.click();	 						
				}
				
//Step-3 Enter The Script Name in to the Filter Input Field to Filter Out >>
	
			@FindBy(xpath="//input[@placeholder='filter values']")
				private WebElement enterScriptName;
				public void enterTheScriptNameToFilterOut() throws InterruptedException
				{
					enterScriptName.sendKeys("Edited Global Script ");
					
			//Click On "Select All" Button
			 
				WebElement clickOnSelectAll = driver.findElement(By.xpath("//span[normalize-space()='Select All']"));	
					clickOnSelectAll.click();
			
			//Click on "OK" Button		
					
				WebElement clickOnOkButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
				Thread.sleep(1000);
				clickOnOkButton.click();
				driver.switchTo().defaultContent();
	}
				
//Step-4 Click On "Reactivate"

		//Navigate to I-Fream			
	        @FindBy(xpath="//iframe[@id='199']")
	        	private WebElement ifreamele;
	        
        //Click On "Reactivate" Action Icon
	     @FindBy(xpath="/html/body/div/div/main/div[3]/div/div/div[1]/div/div[1]/div/div/section/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div[2]")
	     	private WebElement clickOnReactivateIcon;
	     	public void clickOnReactivateActionIcon() throws InterruptedException
	     	{
	     		Thread.sleep(1000);
	     		driver.switchTo().frame(iframeElement);
	     		clickOnReactivateIcon.click();
	     		driver.switchTo().defaultContent();
	     	}

	}
