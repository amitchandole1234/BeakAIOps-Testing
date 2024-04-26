package beakAIOps.TestingPOM;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGlobalLevelScriptPOMClass 

{

//WebDriver Define	
	 private WebDriver driver;
	 
//PageFactory >>
	 
	 public CreateGlobalLevelScriptPOMClass(WebDriver driver) 
	   {
	       this.driver = driver;
	       PageFactory.initElements(driver, this);
	    }
	
//Navigate To Global Level Page >> 
	
	 //Step-1 Click On Account Icon 
	 		@FindBy(xpath="//span[@class='alignSelfCenter cursor']")
	 		private WebElement clickOnAccountIcon;
	 		public void navigateToGlobalLevelPage()
	 		{
	 			clickOnAccountIcon.click();
		
	//Step-2 Click On Global Setting Option	 
			WebElement clickOnGlobalSettingOption = driver.findElement(By.xpath("//span[text()='Global Settings']"));
			clickOnGlobalSettingOption.click();
	 		}
	
//Global Level Script >>	

	// Step-1 Click On Global Level Automation Menu
	 		@FindBy(xpath="//p[contains(text(),'Automation')]")
	 		private WebElement globalLevelAutomationMenu;
	 		public void clickOnGlobalLevelAutomationMenu() throws InterruptedException
	 		{ 
	 			globalLevelAutomationMenu.click();
	
	//Step-2 Click On Automation Menu Drop Down	
			WebElement clickOnAutomationMenuDropdown = driver.findElement(By.xpath("(//span[@class='summary-color'])[2]"));
			clickOnAutomationMenuDropdown.click();
			Thread.sleep(1000);
		
	//Step-3 Select Script Option From Automation Menu Drop Down
			WebElement selectScriptOptionFromDropdown = driver.findElement(By.xpath("//span[normalize-space()='Script']"));
			selectScriptOptionFromDropdown.click();
			Thread.sleep(1000);
		
	//Step-4 Click On Script Tab
			WebElement clickOnScriptTab = driver.findElement(By.xpath("//button[@id='scrollable-auto-tab-0']"));
			clickOnScriptTab.click();
	 		} 

//Create Global Level Script >>	
	
	//Navigate to I-frame
	 	@FindBy(xpath = "//iframe[@id='199']")
	 	private WebElement iframeElement;

	//Click On "Add Script" Button >>
	 	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/header[1]/div[1]/span[1]/span[1]")
	 	private WebElement clickAddScriptButton;
	 	public void clickOnAddScirptButton() 
		{ 
	 		driver.switchTo().frame(iframeElement);
	 		clickAddScriptButton.click();	
		}
	
//Enter The Global Level Script Details >>
	
	//Step-1 Enter The Global Level Script Name
	 		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	 		private WebElement enterGlobalLevelScriptName;
	 		public void enterGlobalLevelScriptDetails() throws InterruptedException
	 		{
	 		//For Unique Name Purpose Add Date and Time with Script Name
	 		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	 		String todayDateTime = dateFormat.format(new Date());
	 		enterGlobalLevelScriptName.sendKeys("Global Level Script " + todayDateTime);	
		
	//Step-2 Select the Minimum OS As "Windows 10" 
		
	 		//Click On Minimum OS Drop Down
	 		WebElement clickOnMinOsDropdown = driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[2]"));
	 		clickOnMinOsDropdown.click();
	 		Thread.sleep(3000);
		
	 		//Select "Windows 10" Option From the Drop Down
	 		WebElement selectWin10 = driver.findElement(By.xpath("//li[normalize-space()='Windows 10']"));
	 		selectWin10.click();
	 		Thread.sleep(3000);
		
	//Step-3 Select Script Category as "General"	
		
	 		WebElement clickOnCategory = driver.findElement(By.xpath("//input[@id='combo-box-demo']"));
	 		clickOnCategory.click();
	 		clickOnCategory.sendKeys("General"); // For Selection of "General" Script Category 
	 		Thread.sleep(1000);
	 		clickOnCategory.sendKeys(Keys.ARROW_DOWN);
	 		clickOnCategory.sendKeys(Keys.ENTER);
	
	//Step-4 Select Minimum PowerShell Version as "5.0"	
		
	 		//Click on Minimum PowerShell Version Drop down
	 		WebElement clickOnMinPWDropdown = driver.findElement(By.xpath("(//div[@id='demo-simple-select'])[4]"));
	 		clickOnMinPWDropdown.click();
		
	 		//Select Minimum PowerShell Version as "5.0" 
	 		WebElement selectMinPWVersio = driver.findElement(By.xpath("//li[text()='5.0']"));
	 		Thread.sleep(1000);
	 		selectMinPWVersio.click();

	//Step-5 Enter The Script Description 
		
	 		WebElement addScriptDescription = driver.findElement(By.xpath("//textarea[@id='standard-multiline-static']"));
	 		addScriptDescription.click();
	 		addScriptDescription.sendKeys("This Script is Created for Script Automation Testing");

     //Step-6 Enter The Script Details 
		
	 		WebElement enterScriptDetails = driver.findElement(By.xpath("//textarea[@id='standard-multiline-flexible']"));
	 		enterScriptDetails.click();
	 		enterScriptDetails.sendKeys("$PSversionTable"); // For Testing Purpose used "$PSversionTable"
		
	//Step-7 Clicked on "Save" Button (All details are Filled)
		
	 		WebElement clickOnSaveButton = driver.findElement(By.xpath("//span[text()='Save']"));
	 		clickOnSaveButton.click();	
	}
	
//Click On "OK" Button >>	
	
	@FindBy(xpath="//span[text()='Ok']")
		private WebElement clickok;
		public void clickOnOkButton()
		{
			clickok.click();
			System.out.println("Global Level Script Created Sucessfully");		
		}		
}
