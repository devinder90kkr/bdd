package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(name = "email")
	@CacheLookup
	WebElement txt_email;
	
	@FindBy (name = "password")
	WebElement txt_password;
	
	@FindBy (xpath = "//button[normalize-space()='Login']")
	WebElement btn_login;
	
	
	WebDriver driver; 
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String email) {
		txt_email.sendKeys(email);
	}

	public void enterpassword (String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_login.click();
	}
	

	
}
