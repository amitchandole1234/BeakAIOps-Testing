package beakAIOps.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot 
{
	
	
public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException
		{
	
	
	TakesScreenshot ts = (TakesScreenshot) driver;
    File sourceFile = ts.getScreenshotAs(OutputType.FILE);
    
    // Define the destination directory
    String destinationDirectory = "D:\\gitRepository\\beakops.testing\\Application Screenshot\\";
    
    // Get current date and time
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String currentDateAndTime = dateFormat.format(new Date());
    
    // Construct the filename with current date and time
    String fileName = "SauceDemoLogin_" + currentDateAndTime + ".jpg";
    
    File destFile = new File(destinationDirectory + fileName);
    FileHandler.copy(sourceFile, destFile);
    System.out.println("Screenshot is taken and saved as: " + fileName);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	// Capture the screenshot
//    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//    // Get the current date and time
//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
//    String currentDateAndTime = dateFormat.format(new Date());
//
//    // Construct the screenshot file name with current date and time
//    String fileName = screenshotName + "_" + currentDateAndTime + ".png";
//
//    // Specify the location to save the screenshot
//    String destination = "D:\\Eclips-Workspace\\beakops.testing\\Application Screenshot + fileName";
//
//    // Copy the screenshot to the desired location
//    FileUtils.copyFile(screenshotFile, new File(destination));
//
//    System.out.println("Screenshot captured: " + fileName);

		}

}
