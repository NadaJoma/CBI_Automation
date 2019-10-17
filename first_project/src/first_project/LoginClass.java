package first_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass extends MainClass{

	 
	public static void login() {
		
					
		WebElement useremail = driver.findElement(By.id(ProjectVariables.UserEmailId));
        WebElement userpassword = driver.findElement(By.id(ProjectVariables.USerPasswordId));
        WebElement login = driver.findElement(By.id(ProjectVariables.UserLoginId));
        
        useremail.sendKeys(ProjectVariables.UserEmail);
        userpassword.sendKeys(ProjectVariables.UserPassword);
        login.click();
       
        String expectedUrl="https://www.frontgate.com/webapp/wcs/stores/servlet/AccountOverView"; 
        String actualUrl= driver.getCurrentUrl();
        
        if(actualUrl.contains(expectedUrl)) {
        	  System.out.println("Test passed");
        	//  HomaPage.CheckContent();
        } else {
        	System.out.println("Test failed"+ actualUrl); 
        	  }

	}




	

	 
}
