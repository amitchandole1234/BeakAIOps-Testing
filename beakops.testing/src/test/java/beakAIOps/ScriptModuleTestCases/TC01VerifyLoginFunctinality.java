package beakAIOps.ScriptModuleTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import beakAIOps.TestingPOM.LogoutPagePOMClass;
import beakAIOps.Utility.TakeScreenshot;


public class TC01VerifyLoginFunctinality extends baseClass

{
	@Test
	public void loginFunctionalityCheck() throws InterruptedException, IOException
	{	

//TC - 01 Verify the Login Functionality >>
		Thread.sleep(2500);
		 String expectedTitle = "Beak AIOps";
		 String actualTitle = driver.getTitle();
		 System.out.println("Verify the test case");
		 	if(expectedTitle.equals(actualTitle))
		 		{
		 			System.out.println("Test case is Pass");
		 			
		 			//TakeScreenshot Test case is Pass
				 	
		 		 	 TakeScreenshot.takeScreenshot(driver, "Sucessfully Login ");
	
		 		}
		 	else
		 		{
		 		//Take Screenshot if Test Case is Failed
		 		 TakeScreenshot.takeScreenshot(driver, "Failed to Login");

		 			 
		 			System.out.println("Test case is Fail");
		 		}	
		 	
		 Thread.sleep(30000);
		 
		 
		
	 

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//Object of LogoutPagePOMClass
		 
		 	LogoutPagePOMClass logOutPage = new LogoutPagePOMClass(driver);
		 	logOutPage.clickOnAccountIcon();
			Thread.sleep(1000);
			logOutPage.clickOnLogoutOption();
			logOutPage.clickOnYesAction();
			Thread.sleep(8000);		 
	}
}
