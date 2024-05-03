package beakAIOps.ScriptModuleTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import beakAIOps.TestingPOM.CreateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.DeactivateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.LogoutPagePOMClass;
import beakAIOps.Utility.TakeScreenshot;

public class TC04DeactivateGlobalLevalScript extends baseClass

{

	@Test
	
	public void DeactivateGlobalLevelScript() throws InterruptedException, IOException
	{
		
//
		CreateGlobalLevelScriptPOMClass cgls = new CreateGlobalLevelScriptPOMClass(driver);
		cgls.navigateToGlobalLevelPage();
		cgls.clickOnGlobalLevelAutomationMenu();
		
		
		DeactivateGlobalLevelScriptPOMClass dgls = new DeactivateGlobalLevelScriptPOMClass(driver);
		dgls.clickOnFilterIcon();
		dgls.enterTheScriptNameToFilterOut();
		//dgls.clickOnDeactivateActionIcon();
		dgls.clickOnDeactivatePopupButton();
		dgls.getSucessMessage();
		WebElement SucessMessgae = driver.findElement(By.xpath("//div[text()='Script deactivated successfully']"));
		
		
//Verify the Global Level Script is Deactivated or Not >>		
		String ExpectedMessage = "Script deactivated successfully";
		String ActualMessage = SucessMessgae.getText();
		 
		 
		 System.out.println("Verify the test case");
		 
		 if(ExpectedMessage.equals(ActualMessage))
		 {
		 System.out.println("The Global Level Script Is Deactivated Sucessfully");
		 System.out.println("Test Case is Pass");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_Deactivated");
		 }
		 else
		 {
		 System.out.println("Global Script is not Deactivated");
		 System.out.println("Test Case is Fail");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_Notdeactivated");
		 }	 
		 Thread.sleep(8000);
				
	driver.switchTo().defaultContent();			 
				 
	
//Object of LogoutPagePOMClass
	 System.out.println("Logout Process Start");
	 	LogoutPagePOMClass logOutPage = new LogoutPagePOMClass(driver);
	 	logOutPage.clickOnAccountIcon();
		Thread.sleep(1000);
		logOutPage.clickOnLogoutOption();
		logOutPage.clickOnYesAction();
		Thread.sleep(8000);	
		System.out.println("Logout Process End");

		
		
	}
	
}
