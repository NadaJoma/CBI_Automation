package first_project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MainClass {
	
    static WebDriver driver;
    static Actions action;
   //static  ResultArray= new string [][];
   
	 public static void WebConnect() { 
		 
	        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	        
	        
	        ChromeOptions options = new ChromeOptions();
	       
	        Map<String, String> mobileEmulation = new HashMap<>();
	        mobileEmulation.put("deviceName", "iPhone X");

	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            
	        driver = new ChromeDriver(chromeOptions); 
	        driver.get(ProjectVariables.baseUrl);
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        //driver.manage().window().maximize();
	        action = new Actions(driver);
	 }
	 
	 public static boolean CheckIfElementExist(By Element) {
		 
		 try {
			 if((driver.findElements(Element).size() != 0)) {
				 return true;
			 }
			 return false;
		 }catch (Exception e){
			 return false;
		 }	
				 
	 }
	 
	 public static boolean ClickElement(By Element) {

		 try {
			 ((WebElement) driver.findElements(Element)).click();
			 return true;
		 } catch (Exception e){
			 return false;
		 }
	 }


}
