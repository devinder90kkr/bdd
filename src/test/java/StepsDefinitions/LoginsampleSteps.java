package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginsampleSteps {
	
	WebDriver driver = null;
	private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");
	
	@Given("Brower is open")
	public void brower_is_open() {
		System.out.println("Inside Step - brower is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :" +projectPath);
		
		System.getProperty("webdriver.chrome.driver", projectPath+"src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
		System.out.println("Inside Step - the user is on login page");
		
		driver.navigate().to("https://pre-staging.app.cuesz.com/login");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside Step - user enter username and password");
		 driver.findElement(emailInput).sendKeys("markcuesz90@yopmail.com");
		 driver.findElement(passwordInput).sendKeys("User!234");
	}

	@And ("the user click on Login button")
	public void the_user_click_on_Login_button() {
		System.out.println("Inside Step - the user click on Login button");
		 driver.findElement(loginButton).click();
	}
	
	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
		System.out.println("Inside Step - the user should be redirected to the homepage");
		driver.findElement(By.xpath("//div[@id='Dashboard-Notification-Settings']//em")).isDisplayed();
		
		driver.close();
		driver.quit();
	}




}
