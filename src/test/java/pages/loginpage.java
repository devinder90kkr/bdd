package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	protected WebDriver driver;
	//username field
	private By txt_email = By.name("email");
	// password field 
	private By txt_password =	By.name("password");
	// button 
	private By btn_login	=	 By.xpath("//button[normalize-space()='Login']");
	//logout button
	private By btn_logout 	=	By.xpath("//div[@id='Dashboard-Notification-Settings']//em");
	//click on confirm button 
	private By logout_confrm =	By.xpath("//button[@id='DecisionPopupRejection']");

	//here create constructor for same class with driver
	public loginpage(WebDriver driver) {	
		this.driver =driver;
	}
	
	//created various methods for login page
	public void enterEmail1(String email ) {	
		driver.findElement(txt_email).sendKeys(email);
	}

	//method for password field
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	//method for login button 
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	//method for logout button
	public void logOutbttn() {
		driver.findElement(btn_logout).click();
	}
	
	//method for confirm button
	public void confirmbttn() {
		driver.findElement(logout_confrm).click();
	}
	
	//invoke complete login valid user with email and password
	public void loginValidUser (String email, String password) {
		driver.findElement(txt_email).sendKeys(email);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(btn_logout).click();
		driver.findElement(logout_confrm).click();
		
	}
	
}
