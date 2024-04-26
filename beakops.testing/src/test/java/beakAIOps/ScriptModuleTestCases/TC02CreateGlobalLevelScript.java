package beakAIOps.ScriptModuleTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import beakAIOps.TestingPOM.CreateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.LogoutPagePOMClass;
import beakAIOps.Utility.TakeScreenshot;

public class TC02CreateGlobalLevelScript extends baseClass
{

private Object folder;

@Test
	public void createGlobalLevelScript() throws InterruptedException, IOException
	{

//Object of createGlobalLevelPOMClass	
		
		CreateGlobalLevelScriptPOMClass cgls = new CreateGlobalLevelScriptPOMClass(driver);
			cgls.navigateToGlobalLevelPage();
			cgls.clickOnGlobalLevelAutomationMenu();
			cgls.clickOnAddScirptButton();
			cgls.enterGlobalLevelScriptDetails();
			
//TC - 02 > Verify the Global Level Script is Created or Not >>				
		WebElement getSucessMessage = driver.findElement(By.xpath("//div[text()='Script details added successfully']"));				
			String expectedMessage = "Script details added successfully";
			String actualMessage = getSucessMessage.getText();
			
			 if(expectedMessage.equals(actualMessage))
			 	{		 
				 	System.out.println("The Global Level Script is Created Sucessfully");
				 	System.out.println("Test Case is Pass");
				 	Thread.sleep(1500);
				 
	//TakeScreenshot Test case is Pass
				 	
				 	 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_Created_Sucessfully");
				 	
			 	}
			 else
			 	{
				 System.out.println("Global Script is not Created");
				 System.out.println("Test Case if Fail");
				 
	//Take Screenshot if Test Case is Failed
				 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_isNotCreated");
			
			 	}	 
			 	Thread.sleep(1000);
			 	
			cgls.clickOnOkButton();
		 
//Object of LogoutPagePOMClass			 
		 	LogoutPagePOMClass logOutPage = new LogoutPagePOMClass(driver);
		 	logOutPage.clickOnAccountIcon();
			Thread.sleep(1000);
			logOutPage.clickOnLogoutOption();
			logOutPage.clickOnYesAction();
			Thread.sleep(8000);		 		
		
	}
	
}
	

