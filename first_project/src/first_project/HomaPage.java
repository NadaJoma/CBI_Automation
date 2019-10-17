package first_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class HomaPage  extends MainClass{
	
	 public static void main(String[] args) throws InterruptedException {	
		 CheckContent();
	 }

	public static void CheckContent() throws InterruptedException {
		
		WebConnect();
		
		//Global header / logo existance 
		CheckLogo();

		// Navigation menu existance and open / close
		
		CheckShopMenu();
		CheckMenuLinks();
		
		//Mini cart icon  existance and open / close  
		if(CheckIfElementExist(ProjectVariables.HeaderMiniCartIcon)) {
			WebElement HMiniCart = driver.findElement(ProjectVariables.HeaderMiniCartIcon);
			 action.moveToElement(HMiniCart).build().perform();
			
			System.out.println("Header mini cart icon exist"); 
		}else {
			System.out.println("Header mini cart icon not exist"); 
		}
		
		
		
		//Click on My account
		WebElement MyAccount = driver.findElement(ProjectVariables.MyAccountId);
		MyAccount.click();
		driver.findElement(ProjectVariables.HeaderLoginId).click();	
		
		//LoginClass.login();
	 
		
	}
	
	public static void CheckLogo() {
		
		if(CheckIfElementExist(ProjectVariables.LogoElement)) {
			System.out.println("Logo exist"); 
		}else {
			System.out.println("Logo not exist"); 
		}
	}
	
	
	
	public static boolean searchItem(){
		
		WebElement SearchBox = driver.findElement(By.id("headerBox"));
		//Thread.sleep(2000);
		SearchBox.sendKeys("bed");
		driver.findElement(By.id("searchButton")).click();
		return true;
		
	}
	
	public static void CheckShopMenu() {
		if(ClickElement(ProjectVariables.ShopMenuElement)) {
			System.out.println("Shop menu opned"); 
		}
		
	}
	
	public static boolean CheckMenuLinks() {
		WebElement allLinks = driver.findElement(By.tagName("a"));

	    for (WebElement w : allLinks)
	    {

	        w.click();
	        if (driver.findElement(By.xpath("Element on the page")).isDisplayed())
	        {
	            System.out.println("Link:"+w.getText()+"is working");
	        }
	        else
	        {
	            System.out.println("Link:"+w.getText()+"is not working");
	        }
	        driver.navigate().back();//To come back to the Home screen

	    }
		return false;
		
	}
}
