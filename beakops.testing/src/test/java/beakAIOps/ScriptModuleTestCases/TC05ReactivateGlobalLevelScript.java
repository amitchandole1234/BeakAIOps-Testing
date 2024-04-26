package beakAIOps.ScriptModuleTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import beakAIOps.TestingPOM.CreateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.LogoutPagePOMClass;
import beakAIOps.TestingPOM.ReactivateGlobalLevelScriptPOMClass;
import beakAIOps.Utility.TakeScreenshot;

public class TC05ReactivateGlobalLevelScript extends baseClass


{
	
	@Test
	public void ReactivateGlobalLevelScript() throws InterruptedException, IOException
	{
		
		CreateGlobalLevelScriptPOMClass cgls = new CreateGlobalLevelScriptPOMClass(driver);
		cgls.navigateToGlobalLevelPage();
		cgls.clickOnGlobalLevelAutomationMenu();
		
		
		ReactivateGlobalLevelScriptPOMClass ragls = new ReactivateGlobalLevelScriptPOMClass(driver);
		ragls.selectInactiveScriptRepository();
		ragls.clickOnFilterIcon();
		ragls.enterTheScriptNameToFilterOut();
		ragls.clickOnReactivateActionIcon();
		
		
		//Verify The Test Case
		
		WebElement reactivate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/main/div/div/div[2]/div/div[2]"));
		String ExpectedMessage = "Script reactivated successfully";
		String ActualMessage = reactivate.getText();
		 
		 
		 System.out.println("Verify the test case");
		 
		 if(ExpectedMessage.equals(ActualMessage))
		 {
		 System.out.println("The Global Level Script Is Reactivated Sucessfully");
		 System.out.println("Test Case is Pass");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_Reactivated");
		 }
		 else
		 {
		 System.out.println("Error in updating a script details");
		 System.out.println("Test Case is Fail");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_Notreactivated");
		 }	 
		 Thread.sleep(8000);
				
	driver.switchTo().defaultContent();			 
				 
	
//Object of LogoutPagePOMClass			 
 	LogoutPagePOMClass logOutPage = new LogoutPagePOMClass(driver);
 	logOutPage.clickOnAccountIcon();
	Thread.sleep(1000);
	logOutPage.clickOnLogoutOption();
	logOutPage.clickOnYesAction();
	Thread.sleep(8000);	

		
		
		
		
		
		
		
	}
	
	
	
	

}
