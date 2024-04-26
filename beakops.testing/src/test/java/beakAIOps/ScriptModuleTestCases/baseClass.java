package beakAIOps.ScriptModuleTestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import beakAIOps.TestingPOM.LoginPagePOMClass;

public class baseClass
{

//WeDriver Define
	
  WebDriver driver;
	
@BeforeMethod()
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
//        options.addArguments("--disable-extensions");
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--disable-plugins-discovery");
//        options.addArguments("--disable-plugins");
//        options.addArguments("--incognito");
//        options.addArguments("start-maximized");
//        options.addArguments("disable-infobars");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--disable-notifications");
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--disable-web-security");
//        options.addArguments("--allow-file-access-from-files");
//        options.addArguments("--user-data-dir=/path/to/temporary/profile");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--headless");

        driver.manage().window().maximize();
        driver.get("https://beakops.ilink-systems.com");
        driver.manage().deleteAllCookies();
        
        String currentURL = driver.getCurrentUrl();

// Verify if the user is on the home page
        if (currentURL.equals("https://beakops.ilink-systems.com/insights/company?&name=clients&overview=true")) 
        {
        	System.out.println("User is on the Homepage");    
        } 
        else 
        {
        	System.out.println("User is not on the Homepage");
        }
        
        driver.get("http://beakops.ilink-systems.com/last_visited_page");

// Check if the user is on the home page and redirect if necessary
        
        if (!driver.getCurrentUrl().equals("https://beakops.ilink-systems.com/insights/company?&name=clients&overview=true")) 
        {
            driver.get("https://beakops.ilink-systems.com/insights/company?&name=clients&overview=true");
            System.out.println("User Redirected on the HomePage");   
        } 
        else 
        {
            
        	System.out.println("User is on the Home Page");
        }
       
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
//Object of LoginPagePOMClass
        
        LoginPagePOMClass loginPage = new LoginPagePOMClass(driver);
		loginPage.enterTheUserEmailAddress();
		loginPage.clickOnCountinueButton();
		loginPage.enterUserPassword();
		loginPage.clickOnLoginButton();
		Thread.sleep(2000);
		
	 }
			
@AfterMethod()
				
		 public void tearDown() throws InterruptedException
		 {
			driver.quit();
			System.out.println("Browser is Close ");
		 }
		

	
}
