package beakAIOps.ScriptModuleTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import beakAIOps.TestingPOM.CreateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.DeactivateGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.EditGlobalLevelScriptPOMClass;
import beakAIOps.TestingPOM.LogoutPagePOMClass;
import beakAIOps.Utility.TakeScreenshot;

public class TC03EditGlobalLevelScript extends baseClass

{
	
   



@Test
	
	public void EditGlobalLevelScript() throws InterruptedException, IOException
	{
		

	CreateGlobalLevelScriptPOMClass cgls = new CreateGlobalLevelScriptPOMClass(driver);
		cgls.navigateToGlobalLevelPage();
		cgls.clickOnGlobalLevelAutomationMenu();
	
	EditGlobalLevelScriptPOMClass edls = new EditGlobalLevelScriptPOMClass(driver);
		edls.clickOnFilterIcon();
		edls.enterTheScriptNameToFilterOut();
		edls.clickOnEditActionIcon();
		edls.selectAllAndClearScriptName();
			
		

//   >> Verify the Test <<		
		Thread.sleep(1000);
		WebElement gettext = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/p[1]/div[1]"));
			
		String ActualSucessMessge = gettext.getText();
		String ExpectedSucessMessge = "Script details updated successfully";
		
		 
		 if(ExpectedSucessMessge.equals(ActualSucessMessge))
		 {
		 System.out.println("The Global Level Script Is Edited Sucessfully");
		 System.out.println("Test Case is Pass");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_Edited");
		 }
		 else
		 {
		 System.out.println("Global Script is not Edited");
		 System.out.println("Test Case is Fail");
		 TakeScreenshot.takeScreenshot(driver, "Global_Level_Script_is_notEdited");
		 }
		
		 edls.clickOnOkButton();
		
			
//Object of LogoutPagePOMClass			 
		 	LogoutPagePOMClass logOutPage = new LogoutPagePOMClass(driver);
		 	logOutPage.clickOnAccountIcon();
			Thread.sleep(1000);
			logOutPage.clickOnLogoutOption();
			logOutPage.clickOnYesAction();
			Thread.sleep(8000);	

			
	}
	
	
	
	

}
