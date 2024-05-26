package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy (xpath = "//div[@id='Dashboard-Notification-Settings']//em")
	WebElement btn_logout;
	
	@FindBy (xpath = "//button[@id='DecisionPopupRejection']")
	WebElement logout_confrm;
	
	WebDriver driver; 
	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnLogout() {
		btn_logout.click();
	}
	
	public void clickOnConfirm() {
		logout_confrm.click();
	}

}
