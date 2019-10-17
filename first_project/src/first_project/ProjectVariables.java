package first_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProjectVariables {
	
	static String baseUrl = "https://www.frontgate.com";
	static By MyAccountId = By.id("gwt_dropdownmenu_my_account");
	static String HeaderBoxId = "headerBox"; 
	static String UserEmail ="java@test.com";
	static String UserPassword ="n123456789";
	
	static String UserEmailId ="logonId";
	static String USerPasswordId ="logonPassword";
	static String UserLoginId ="logonButton";
	
	static By LogoElement = By.className("t-header__link");
	static By HeaderLoginId = By.linkText("Sign In/Register");
	static By HeaderMiniCartIcon = By.id("cartAnchor"); 
	static By ShopMenuElement = By.id("pwa-shop-nav-button");


}
