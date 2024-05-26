package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class LoginsampleSteps_POM {
	
//	WebDriver driver = null;
//	loginpage login;
//	
//	@Given("Brower is open")
//	public void brower_is_open() {
//		
//		System.out.println("=== I am inside Login Demo steps pom===");
//		System.out.println("Inside Step - brower is open");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is :" +projectPath);
//		
//		System.getProperty("webdriver.chrome.driver", projectPath+"src/test/resources/driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		// Initialize the login page object here
//		login = new loginpage(driver);
//		
//	}
//
//	@And("the user is on login page")
//	public void the_user_is_on_login_page() {
//		System.out.println("Inside Step - the user is on login page");
//		
//		driver.navigate().to("https://pre-staging.app.cuesz.com/login");
//	}
//
//	@When("^user enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String email, String password) throws InterruptedException {
//		
////		loginpage login = new loginpage(driver);
//		login.enterEmail1(email);
//		login.enterPassword(password);	
//	Thread.sleep(2500);
//	}
//
//	@When ("the user click on Login button")
//	public void the_user_click_on_Login_button() {
//	//	System.out.println("Inside Step - the user click on Login button");
//		login.clickLogin();
//	
//	}
//	
//	@Then("the user should be redirected to the homepage")
//	public void the_user_should_be_redirected_to_the_homepage() throws InterruptedException {
//		System.out.println("Inside Step - the user should be redirected to the homepage");
//		login.logOutbttn();
//		Thread.sleep(2000);
//		login.confirmbttn();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}
//
//
//
//
}
