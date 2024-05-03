package beakAIOps.TestingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteGlobalLevelScript 
{
	//WebDriver Define
	  private WebDriver driver;

	//PageFactory Define >>
		
		public DeleteGlobalLevelScript(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}	  

		
//Step-1 Navigate to Inactive Script Repository	
		
		
		
//Navigate to I-Fream
			@FindBy(xpath="//iframe[@id='199']")
				private WebElement ifream1;
			

          				
		//Click on Filter icon 
			
			@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[23]")	
			private WebElement filtericon;
				public void clickOnFilterIcon1() throws InterruptedException
				{ 
					Thread.sleep(1000);
					driver.switchTo().frame(ifream1);
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
		private WebElement valuePresent1;
				
		@FindBy(xpath="//input[@placeholder='filter values']")
			private WebElement enterScriptName1;
			public void enterTheScriptNameToFilterOut1() throws InterruptedException
				{
					Thread.sleep(1000);
					enterScriptName1.sendKeys("Edited Global Script ");	
					Thread.sleep(1000);
					String ValuePresent= valuePresent1.getText();
					 	
			        	//Check whether the Filter Value is Present or No value		   
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
	    		Thread.sleep(3000);
	    	}			

// Click On Cross Icon	    	
	    	@FindBy(xpath="//iframe[@id='199']")
			private WebElement ifream2;	    	
	    	
@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[24]")
			private WebElement clickOnCrossIcon;
			public void clickOnCrossAction() throws InterruptedException
			{
				Thread.sleep(1000);
				driver.switchTo().frame(ifream2);
				Thread.sleep(2000);
				clickOnCrossIcon.click();
				Thread.sleep(2000);
				 driver.switchTo().defaultContent();	
				
			}			
			
// Click on Inactive Script Repository
		
			@FindBy(xpath="//iframe[@id='199']")
			private WebElement ifream3;	
			
			@FindBy(xpath="//span[text()='Active']")
				private WebElement clickFilterDropdown;
				public void selectInactiveScriptRepository() throws InterruptedException
				{
					Thread.sleep(1000);
					driver.switchTo().frame(ifream3);
					Thread.sleep(3000);
					clickFilterDropdown.click();
					Thread.sleep(3000);
				
					
			//Select the "Inactive" option from drop-down		
			WebElement selectInactiveOption = driver.findElement(By.xpath("//span[text()='Inactive']"));
				Thread.sleep(1000);
				selectInactiveOption.click();
				Thread.sleep(1000);
				
				}
			
				@FindBy(xpath="(//*[name()='svg'][@class='css-sr6nr'])[23]")
				private WebElement clickOnFilter;
					public void clickOnFilterIcon() throws InterruptedException
					{ 
						Thread.sleep(2000);
						clickOnFilter.click();
						Thread.sleep(1000);
						
					}
					
	//Step-3 Enter The Script Name into the Filter Input Field to Filter Out >>
		  
			@FindBy(xpath="//span[normalize-space()='Select All']")
				private WebElement clickOnSelectAll;
			@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
			    private WebElement clickOnOkButton;
			@FindBy(xpath="//span[contains(text(),'Edited Global Script')]")
			private WebElement valuePresent;
					
			@FindBy(xpath="//input[@placeholder='filter values']")
				private WebElement enterScriptName;
				public void enterTheScriptNameToFilterOut() throws InterruptedException
					{
						Thread.sleep(1000);
						enterScriptName1.sendKeys("Edited Global Script ");
						
						 Thread.sleep(2000);	    
						    String ValuePresent= valuePresent1.getText();
						    
				//Check whether the Filter Value is Present or No value		   
						    if (ValuePresent.startsWith("Edited Global Script"))	
						    	{
						    	clickOnSelectAll.click();
						            Thread.sleep(1000);
						            clickOnOkButton.click();
						            Thread.sleep(1000);
									
						            driver.switchTo().defaultContent();			    	
						    	} 
						    else
						    	{
						    	
						    		System.out.println("Cannot click on Select all and OK Button Bacause The Value is No Values");
						       }
		}
				
	  
	  	//Navigate to I-Frame
			@FindBy(xpath = "//iframe[@id='199']")
				private WebElement iframeElement4;
			
		//Click on Filter 
			
			@FindBy(xpath="(//div[@role='button'])[2]")	
			private WebElement deleteIcon;
				public void clickOnDeleteIcon() throws InterruptedException
				{ 
					Thread.sleep(2000);
					driver.switchTo().frame(iframeElement4);
					Thread.sleep(2000);
					deleteIcon.click();	
					System.out.println("exe-1");
					driver.switchTo().defaultContent();
					
				}
				
			@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text add-btn']")
			private WebElement clickDelete;
			public void clickOnDeleteButton() throws InterruptedException
			{
				Thread.sleep(2000);
				
				clickDelete.click();
				Thread.sleep(3000);
				
				
			}			
			
		

}
