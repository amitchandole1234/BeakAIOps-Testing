package beakAIOps.ScriptModuleTestCases;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import beakAIOps.TestingPOM.CreateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.DeactivateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.DeleteGlobalLevelScript;
import beakAIOps.TestingPOM.LogoutPagePOMClass;
import beakAIOps.TestingPOM.ReactivateGlobalLevelScriptPOMClass;
import beakAIOps.Utility.TakeScreenshot;



public class TC06DeleteGlobalLevelScript extends baseClass

{
	
	@Test
	public void deleteGlobalLevlScripT() throws InterruptedException, IOException
	{
		

		CreateGlobalLevelScriptPOMClass cgls = new CreateGlobalLevelScriptPOMClass(driver);
		cgls.navigateToGlobalLevelPage();
		cgls.clickOnGlobalLevelAutomationMenu();
		
		
		
		
		
		DeleteGlobalLevelScript dgls = new DeleteGlobalLevelScript(driver);
		dgls.clickOnFilterIcon1();
		dgls.enterTheScriptNameToFilterOut1();
		dgls.clickOnDeactivatePopupButton();
		dgls.clickOnCrossAction();
		dgls.selectInactiveScriptRepository();
		dgls.clickOnFilterIcon();
		dgls.enterTheScriptNameToFilterOut();
		dgls.clickOnDeleteIcon();
		dgls.clickOnDeleteButton();
		
		WebElement responceMsg= driver.findElement(By.xpath("//div[text()='Script deleted successfully']"));
		String actualMessage = responceMsg.getText();
		String expectedMessgae="Script deleted sucessfully";
		
		System.out.println("Verify the test case");
		 
		 if(expectedMessgae.equals(actualMessage))
		 {
		 System.out.println("The Global Level Script Is Deleted Sucessfully");
		 System.out.println("Test Case is Pass");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_Deleted");
		 }
		 else
		 {
		 System.out.println("Error in Deleteting a script details");
		 System.out.println("Test Case is Fail");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_NotDeleted");
		 }	 
		 Thread.sleep(8000);
		 
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
